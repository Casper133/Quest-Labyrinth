package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.Room;

public class Laboratory extends Room {
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
