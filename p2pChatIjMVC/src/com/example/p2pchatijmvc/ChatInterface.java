package com.example.p2pchatijmvc;
import org.alljoyn.bus.BusException;
import org.alljoyn.bus.annotation.BusInterface;
import org.alljoyn.bus.annotation.BusSignal;

@BusInterface (name = "com.p2p.bus.chat")
public interface ChatInterface {

    @BusSignal
    public void Chat(String str) throws BusException;
}