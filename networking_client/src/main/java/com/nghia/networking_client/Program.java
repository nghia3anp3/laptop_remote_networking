/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nghia.networking_client;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.Socket;

public class Program {
    
    //===========================================================================================================================================
    public static PrintWriter outToServer;
    public static BufferedReader inFromServer;
    public static Socket client;
    public static BufferedImage img;
    public static ObjectInputStream oin;
    public static byte[] bytes;
    public static Image img1;
    //===========================================================================================================================================
    
    public static void main(String[] args) throws IOException {       
        Client client = new Client();
        client.setVisible(true);
    } 
}
