package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.LivingRoom;
import com.casper.labyrinth.room.Room;

public class OrangeLivingRoom extends LivingRoom {
    public OrangeLivingRoom(Room firstExitRoom, Room secondExitRoom) {
        super(firstExitRoom, secondExitRoom);
    }

    @Override
    public String getRoomMessage() {
        return "Перед собой Вы видите несколько кроватей, стол и шкаф. " +
                "На полу большой оранжевый ковер.";
    }
}
