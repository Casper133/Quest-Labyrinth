package com.casper.labyrinth.controller;

import com.casper.labyrinth.generator.LevelGenerator;
import com.casper.labyrinth.room.Room;
import com.casper.labyrinth.room.impl.PrisonCell;

public class AppController {
    public static void start() {
        Room level = LevelGenerator.generateLevel();
        System.out.println(level instanceof PrisonCell);
    }
}
