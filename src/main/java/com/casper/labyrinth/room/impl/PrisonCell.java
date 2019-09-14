package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.Room;

public class PrisonCell extends Room {
    public PrisonCell(Room firstExitRoom, Room secondExitRoom) {
        super(firstExitRoom, secondExitRoom);
    }

    @Override
    public String getRoomMessage() {
        return "Вы зашли в сырое помещение с клеткой внутри. " +
                "На табличке надпись: \"Тюремная камера #133\"";
    }

    @Override
    public String getRoomName() {
        return "Тюремная камера";
    }
}
