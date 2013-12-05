package com.exam.chat;

import java.util.Random;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public class ChatHelper extends Handler {
	public ChatHelper(Looper looper) {
		super(looper);
	}

	public static void main(String str[]) {
		ChatHelper mChatHelper;
		HandlerThread busThread = new HandlerThread("ChatHelper");
		busThread.start();
		mChatHelper = new ChatHelper(busThread.getLooper());
	}
	@Override
	public void handleMessage(Message msg) {
		switch (msg.what) {
		default:
			break;
		}
	}
	
	 public static String RandomString(){
    	 String str=new  String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
    	 	StringBuffer sb=new StringBuffer();
    	 	Random r = new Random();
    	 	int te=0;
    	 	for(int i=1;i<=6;i++){
    	 		te=r.nextInt(62);
    	 		sb.append(str.charAt(te));
    	 	}
    	 	String a;
    	 	a = sb.toString();
    	 	Log.i("aaa",a);
    	 	return a;
     }
}
