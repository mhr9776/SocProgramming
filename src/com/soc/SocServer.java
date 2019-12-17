package com.soc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocServer {
    public static void main(String[] args) throws IOException {
        System.out.println("server is started");
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("server is waiting for client request");
        Socket s = ss.accept();

        System.out.println("client connected");
        Scanner scanner = new Scanner(System.in);
      while (true) {
          InputStreamReader in = new InputStreamReader(s.getInputStream());
          BufferedReader bf = new BufferedReader(in);
          String str = bf.readLine();
          System.out.println("Client: " + str);


          PrintWriter pr = new PrintWriter(s.getOutputStream());
          pr.println(scanner.next());
          pr.flush();
      }
    }
}
