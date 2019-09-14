package com.casper.labyrinth.room;

public abstract class Room {
    private Room firstExitRoom;

    private Room secondExitRoom;

    private Room previousRoom;

    private boolean roomVisited = false;


    public Room(Room firstExitRoom, Room secondExitRoom) {
        this.firstExitRoom = firstExitRoom;
        this.secondExitRoom = secondExitRoom;
    }


    public Room getFirstExitRoom() {
        return firstExitRoom;
    }

    public Room getSecondExitRoom() {
        return secondExitRoom;
    }

    public Room getPreviousRoom() {
        return previousRoom;
    }

    public void setPreviousRoom(Room room) {
        previousRoom = room;
    }

    public boolean isRoomVisited() {
        return roomVisited;
    }

    public void markRoomAsVisited() {
        roomVisited = true;
    }


    public abstract String getRoomMessage();

    public abstract String getRoomName();
}
