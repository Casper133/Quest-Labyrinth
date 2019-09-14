package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.Room;

public class SecurityRoom extends Room {
    @Override
    public String getRoomMessage() {
        return "Вы нашли комнату охраны. В комнате всего одна дверь, за которой выход наружу. " +
                "Вы смогли выбраться, поздравляем!";
    }

    @Override
    public String getRoomName() {
        return "Комната охраны";
    }
}
