package com.casper.labyrinth.room;

public abstract class Room {
    private Room firstExitRoom;

    private Room secondExitRoom;

    private Room backRoom;

    private boolean roomVisited = false;


    public Room getFirstExitRoom() {
        return firstExitRoom;
    }

    public Room getSecondExitRoom() {
        return secondExitRoom;
    }

    public void setExitRooms(Room firstExitRoom, Room secondExitRoom) {
        this.firstExitRoom = firstExitRoom;
        this.secondExitRoom = secondExitRoom;

        this.firstExitRoom.setBackRoom(this);
        this.secondExitRoom.setBackRoom(this);
    }

    public Room getBackRoom() {
        return backRoom;
    }

    private void setBackRoom(Room room) {
        backRoom = room;
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
