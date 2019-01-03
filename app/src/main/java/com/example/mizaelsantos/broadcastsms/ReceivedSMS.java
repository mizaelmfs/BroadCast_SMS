package com.example.mizaelsantos.broadcastsms;

public class ReceivedSMS {

    private static ReceivedSMS receivedSMS;
    private ReceivedCallBack listener;

    private ReceivedSMS () {}

    public static ReceivedSMS instance() {

        if (receivedSMS == null) {
            receivedSMS = new ReceivedSMS();
        }
        return receivedSMS;
    }

    public ReceivedCallBack getListener() {
        return listener;
    }

    public void setListener(ReceivedCallBack listener) {
        this.listener = listener;
    }

    public interface ReceivedCallBack {
        void onCall(String body);
    }
}
