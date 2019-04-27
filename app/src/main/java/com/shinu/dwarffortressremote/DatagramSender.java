package com.shinu.dwarffortressremote;

import android.util.Log;

import java.net.*;

public class DatagramSender extends Thread {
    DatagramPacket datagramPacket;
    DatagramSocket datagramSocket;
    String message = null;
    String addr = null;

    public DatagramSender() {
        try {
            datagramSocket = new DatagramSocket();
        } catch (Exception e) {
            Log.d("LOG", e.toString());
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void run() {
        if (this.message != null && this.addr != null) {
            try {
                datagramPacket = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getByName(addr), 8080);
                datagramSocket.send(datagramPacket);
            } catch (Exception e) {
                Log.d("LOG", e.toString());
            }
        }
    }

    public void sendData() {
        this.start();
    }
}
