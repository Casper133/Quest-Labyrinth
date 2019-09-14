package com.casper.labyrinth.room;

public abstract class Room {
    private Room firstExitRoom;

    private Room secondExitRoom;

    private Room previousRoom;

    private boolean roomVisited = false;


    public Room getFirstExitRoom() {
        return firstExitRoom;
    }

    public void setFirstExitRoom(Room firstExitRoom) {
        this.firstExitRoom = firstExitRoom;
    }

    public Room getSecondExitRoom() {
        return secondExitRoom;
    }

    public void setExitRooms(Room firstExitRoom, Room secondExitRoom) {
        this.firstExitRoom = firstExitRoom;
        this.secondExitRoom = secondExitRoom;

        this.firstExitRoom.setPreviousRoom(this);
        this.secondExitRoom.setPreviousRoom(this);
    }

    public Room getPreviousRoom() {
        return previousRoom;
    }

    private void setPreviousRoom(Room room) {
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
