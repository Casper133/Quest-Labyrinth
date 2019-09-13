package com.casper.labyrinth.view.impl;

import com.casper.labyrinth.view.MessageWriter;

public class ConsoleWriterImpl implements MessageWriter {
    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void stop() {
    }
}
