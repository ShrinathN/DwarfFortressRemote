package com.shinu.dwarffortressremote;

import android.util.Log;

import java.net.*;

public class DatagramSender {
    DatagramPacket datagramPacket;
    DatagramSocket datagramSocket;

    public DatagramSender(String message, String addr) {
        try {
            datagramPacket = new DatagramPacket(message.getBytes("utf-8"), message.length(), InetAddress.getByName("192.168.1.12"), 8080);
            datagramSocket = new DatagramSocket();
        } catch (Exception e) {
            Log.d("LOG", e.toString());
        }
    }

    public void sendData() {
        try {
            datagramSocket.send(datagramPacket);
        } catch(Exception e) {
            Log.d("LOG", e.toString());
        }
    }
}
