package com.exam.chat;

import org.alljoyn.bus.BusAttachment;
import org.alljoyn.bus.BusException;
import org.alljoyn.bus.BusObject;
import org.alljoyn.bus.annotation.BusMethod;

public class ChatService implements BusObject, ChatInterface {
	private static final int REQUEST_NAME_NO_FLAGS = 0;

	public static void main(String str[]) {
		BusAttachment bus = new BusAttachment(ChatService.class.getName());
		bus.connect();

		ChatService service = new ChatService();
		bus.registerBusObject(service, "/myobject");
		bus.requestName("com.exam.chat", REQUEST_NAME_NO_FLAGS);
	}

	@Override
	@BusMethod(signature = "s", replySignature = "s")
	public String Chat(String str) throws BusException {
		// TODO Auto-generated method stub
		return str;
	}

}
