package com.casper.labyrinth.controller;

import com.casper.labyrinth.generator.LevelGenerator;
import com.casper.labyrinth.room.Room;
import com.casper.labyrinth.room.impl.DeadEnd;
import com.casper.labyrinth.room.impl.PrisonCell;
import com.casper.labyrinth.room.impl.SecurityRoom;
import com.casper.labyrinth.view.MessageReader;
import com.casper.labyrinth.view.MessageWriter;
import com.casper.labyrinth.view.impl.ConsoleReader;
import com.casper.labyrinth.view.impl.ConsoleWriter;

public class AppController {
    private static final MessageWriter messageWriter = new ConsoleWriter();
    private static final MessageReader messageReader = new ConsoleReader();

    public static void start() {
        Room currentRoom = LevelGenerator.generateLevel();

        messageWriter.writeMessage("\nВы очнулись от криков бегущих с корабля пришельцев.");
        messageWriter.writeMessage("Последнее воспоминание — на Землю вторглись инопланетяне, " +
                "сразу взяв Вас в плен и захватив рядом с местом посадки Вашу родную деревню.");
        messageWriter.writeMessage("Они привели Вас к плоскому кораблю, напоминающему летающую тарелку.");
        messageWriter.writeMessage("Сразу на входе была комната охраны, где Вам в шею вкололи снотворное.");
        messageWriter.writeMessage("Полностью проснувшись, Вы осмотрелись и поняли, " +
                "что находитесь в открытой клетке.");
        messageWriter.writeMessage("На полу лежала записка со странным текстом: " +
                "\"Мы срочно улетаем в капсулах с этой ужасной планеты. В каждой комнате корабля, " +
                "кроме тюремной камеры и комнаты охраны, по 3 двери. " +
                "Найди комнату охраны и сможешь вернуться домой. Удачи.\"");
        messageWriter.writeMessage("Должно быть, её оставил тот же пришелец, что и открыл камеру. " +
                "Ваша задача — выбраться. Вперёд!");

        currentRoom.markRoomAsVisited();
        currentRoom = getExitFromPrison(currentRoom);

        while (true) {
            messageWriter.writeMessage("Вы открываете дверь.");

            if (currentRoom instanceof DeadEnd) {
                messageWriter.writeMessage("За дверью тупик. Выберите другую комнату.");
                currentRoom.markRoomAsVisited();
                currentRoom = currentRoom.getBackRoom();
                currentRoom = getNewCurrentRoom(currentRoom);
                continue;
            }

            messageWriter.writeMessage(currentRoom.getRoomMessage());
            currentRoom.markRoomAsVisited();

            if (currentRoom instanceof SecurityRoom) {
                break;
            }

            if (currentRoom instanceof PrisonCell) {
                currentRoom = getExitFromPrison(currentRoom);
                continue;
            }

            currentRoom = getNewCurrentRoom(currentRoom);
        }

        messageWriter.stop();
        messageReader.stop();
    }

    private static Room getExitFromPrison(Room currentRoom) {
        boolean inputCorrect = false;

        while (!inputCorrect) {
            String firstRoomText = getRoomText(currentRoom.getFirstExitRoom());
            String secondRoomText = getRoomText(currentRoom.getSecondExitRoom());
            messageWriter.writeMessage("\nПеред Вами 2 двери. Выберите одну из них.");
            messageWriter.writeMessage("1 — левая дверь" + firstRoomText +
                    ", 2 — правая дверь" + secondRoomText + ".");

            switch (messageReader.readMessage()) {
                case "1":
                    currentRoom = currentRoom.getFirstExitRoom();
                    inputCorrect = true;
                    break;
                case "2":
                    currentRoom = currentRoom.getSecondExitRoom();
                    inputCorrect = true;
                    break;
                default:
                    messageWriter.writeMessage("\nНекорректный ввод. Попробуйте ещё раз.");
                    break;
            }
        }

        messageWriter.writeMessage("");
        return currentRoom;
    }

    private static Room getNewCurrentRoom(Room currentRoom) {
        String firstRoomText = getRoomText(currentRoom.getFirstExitRoom());
        String secondRoomText = getRoomText(currentRoom.getSecondExitRoom());
        String backRoomText = getRoomText(currentRoom.getBackRoom());

        boolean inputCorrect = false;

        while (!inputCorrect) {
            messageWriter.writeMessage("\nВы встали в центр комнаты. " +
                    "Перед Вами 2 двери, сзади ещё одна. Выберите одну их них.");
            messageWriter.writeMessage("1 — левая дверь" + firstRoomText +
                    ", 2 — правая дверь" + secondRoomText +
                    ", 3 — дверь сзади" + backRoomText + ".");

            switch (messageReader.readMessage()) {
                case "1":
                    currentRoom = currentRoom.getFirstExitRoom();
                    inputCorrect = true;
                    break;
                case "2":
                    currentRoom = currentRoom.getSecondExitRoom();
                    inputCorrect = true;
                    break;
                case "3":
                    currentRoom = currentRoom.getBackRoom();
                    inputCorrect = true;
                    break;
                default:
                    messageWriter.writeMessage("Некорректный ввод. Попробуйте ещё раз.\n");
                    break;
            }
        }

        messageWriter.writeMessage("");
        return currentRoom;
    }

    private static String getRoomText(Room room) {
        String roomText = "";
        if (room != null) {
            roomText = room.isRoomVisited() ? " (" + room.getRoomName() + ")" : "";
        }
        return roomText;
    }
}
