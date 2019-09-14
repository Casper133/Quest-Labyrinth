package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.LivingRoom;

public class OrangeLivingRoom extends LivingRoom {
    @Override
    public String getRoomMessage() {
        return "Перед собой Вы видите несколько кроватей, стол и шкаф. " +
                "На полу большой оранжевый ковер.";
    }
}
