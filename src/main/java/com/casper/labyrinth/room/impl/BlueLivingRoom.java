package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.LivingRoom;
import com.casper.labyrinth.room.Room;

public class BlueLivingRoom extends LivingRoom {
    public BlueLivingRoom(Room firstExitRoom, Room secondExitRoom) {
        super(firstExitRoom, secondExitRoom);
    }

    @Override
    public String getRoomMessage() {
        return "Перед собой Вы видите несколько кроватей, стол и шкаф. " +
                "На полу большой синий ковер.";
    }
}
