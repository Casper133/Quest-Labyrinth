package com.casper.labyrinth.generator;

import com.casper.labyrinth.room.Room;
import com.casper.labyrinth.room.impl.ControlRoom;
import com.casper.labyrinth.room.impl.GreenLivingRoom;
import com.casper.labyrinth.room.impl.Laboratory;
import com.casper.labyrinth.room.impl.OrangeLivingRoom;
import com.casper.labyrinth.room.impl.PrisonCell;
import com.casper.labyrinth.room.impl.RedLivingRoom;
import com.casper.labyrinth.room.impl.SecurityRoom;
import com.casper.labyrinth.room.impl.YellowLivingRoom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LevelGenerator {
    public static Room generateLevel() {
        List<Room> rooms = new ArrayList<>(6);

        rooms.add(new GreenLivingRoom());
        rooms.add(new OrangeLivingRoom());
        rooms.add(new RedLivingRoom());
        rooms.add(new YellowLivingRoom());

        rooms.add(new ControlRoom());
        rooms.add(new Laboratory());

        Collections.shuffle(rooms);

        return createLevel(rooms);
    }

    private static Room createLevel(List<Room> rooms) {
        Room level = new PrisonCell();

        fillLevelByRooms(level, rooms);

        rooms.remove(0);
        rooms.remove(0);

        int randomLeafIndex = (int) (rooms.size() * Math.random());
        rooms.get(randomLeafIndex).setFirstExitRoom(new SecurityRoom());

        return level;
    }

    private static void fillLevelByRooms(Room level, List<Room> rooms) {
        Room firstRoom = rooms.get(0);
        Room secondRoom = rooms.get(1);
        level.setExitRooms(firstRoom, secondRoom);
        firstRoom.setExitRooms(rooms.get(2), rooms.get(3));
        secondRoom.setExitRooms(rooms.get(4), rooms.get(5));
    }
}
