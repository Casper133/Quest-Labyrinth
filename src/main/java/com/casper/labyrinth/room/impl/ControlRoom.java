package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.Room;

public class ControlRoom extends Room {
    public ControlRoom(Room firstExitRoom, Room secondExitRoom) {
        super(firstExitRoom, secondExitRoom);
    }

    @Override
    public String getRoomMessage() {
        return "В комнате расположен огромный компьютер и множество мониторов. " +
                "\"Вероятно, пункт управления\", - подумали Вы.";
    }

    @Override
    public String getRoomName() {
        return "Комната управления";
    }
}
