package com.exam.chat;

import java.util.Random;
import java.util.Scanner;

import org.alljoyn.bus.BusAttachment;
import org.alljoyn.bus.BusException;
import org.alljoyn.bus.BusObject;
import org.alljoyn.bus.ProxyBusObject;
import org.alljoyn.bus.annotation.BusMethod;
import org.alljoyn.bus.annotation.BusSignal;

public class ChatClient implements BusObject, ChatInterface {
	
	public static void main(String str[]) {
		BusAttachment bus = new BusAttachment(ChatClient.class.getName());
		bus.connect();

		Class[] client = { ChatInterface.class };
		
		
		ProxyBusObject proxyObj = bus.getProxyBusObject("com.exam.chat", "/myobject", 0, client);
        ChatInterface proxy = proxyObj.getInterface(ChatInterface.class);

	}

	@Override
	@BusSignal
	public String Chat(String str) throws BusException {
		// TODO Auto-generated method stub
		return null;
	}
	
}

