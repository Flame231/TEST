package org.example.Sender;

public class SmsSender implements Sender {

    @Override
    public void send(String message) {
        System.out.println("send sms " + message);
    }
}
