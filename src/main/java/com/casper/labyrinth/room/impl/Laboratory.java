package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.Room;

public class Laboratory extends Room {
    public Laboratory(Room firstExitRoom, Room secondExitRoom) {
        super(firstExitRoom, secondExitRoom);
    }

    @Override
    public String getRoomMessage() {
        return "За дверью оказалась светлая комната, " +
                "полная медицинского оборудования, белых халатов и пробирок.";
    }

    @Override
    public String getRoomName() {
        return "Лаборатория";
    }
}
