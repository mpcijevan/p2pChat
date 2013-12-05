package com.exam.chat;

import org.alljoyn.bus.BusException;
import org.alljoyn.bus.annotation.BusInterface;
import org.alljoyn.bus.annotation.BusSignal;

@BusInterface (name = "com.p2p.bus.chat")
public interface ChatInterface {

    @BusSignal
    public String Chat(String str) throws BusException;
}