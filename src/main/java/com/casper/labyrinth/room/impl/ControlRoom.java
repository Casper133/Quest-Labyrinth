package com.casper.labyrinth.room.impl;

import com.casper.labyrinth.room.Room;

public class ControlRoom extends Room {
    @Override
    public String getRoomMessage() {
        return "В комнате расположен огромный компьютер и множество мониторов. " +
                "\"Вероятно, пункт управления\", - подумали Вы.";
    }

    @Override
    public String getRoomName() {
        return "Комната управления";
    }
}
