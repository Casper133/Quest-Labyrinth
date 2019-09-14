package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.Room;

public class DeadEnd extends Room {

    @Override
    public String getRoomMessage() {
        return null;
    }

    @Override
    public String getRoomName() {
        return "Тупик";
    }
}
