package com.casper.labyrinth.view.impl;

import com.casper.labyrinth.view.MessageReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReaderImpl implements MessageReader {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String readMessage() {
        try {
            return bufferedReader.readLine().trim();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void stop() {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
