package com.nghia.networking_server;

import java.net.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//===========================================================================================================================================
public class Program {
public static Socket server;
public static ServerSocket client;
public static BufferedReader inFromClient; 
public static PrintWriter outToClient;
public static ObjectOutputStream ImgOut;
public static ByteArrayOutputStream ous;
//===========================================================================================================================================

    public static void main(String[] args) {
        Server server = new Server();
        server.setVisible(true);
    }
}
