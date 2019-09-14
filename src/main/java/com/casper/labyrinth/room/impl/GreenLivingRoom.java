package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.LivingRoom;

public class GreenLivingRoom extends LivingRoom {
    @Override
    public String getRoomMessage() {
        return "Перед собой Вы видите несколько кроватей, стол и шкаф. " +
                "На полу большой зеленый ковер.";
    }
}
