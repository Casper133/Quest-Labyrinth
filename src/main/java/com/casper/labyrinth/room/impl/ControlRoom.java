package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.Room;

public class ControlRoom extends Room {
    public ControlRoom(Room firstExitRoom, Room secondExitRoom) {
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
