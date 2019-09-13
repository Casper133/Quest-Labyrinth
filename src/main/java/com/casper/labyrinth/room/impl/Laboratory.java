package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.Room;

public class Laboratory extends Room {
    public Laboratory(Room firstExitRoom, Room secondExitRoom) {
        super(firstExitRoom, secondExitRoom);
    }

    @Override
    public String getRoomMessage() {
        return null;
    }

    @Override
    public String getRoomName() {
        return null;
    }
}
