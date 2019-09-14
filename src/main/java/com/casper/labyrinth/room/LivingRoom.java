package com.casper.labyrinth.room;

public abstract class LivingRoom extends Room {
    public LivingRoom(Room firstExitRoom, Room secondExitRoom) {
        super(firstExitRoom, secondExitRoom);
    }

    @Override
    public String getRoomName() {
        return "Жилая комната";
    }
}
