package com.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",9999);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            PrintWriter pr = new PrintWriter(s.getOutputStream());
            pr.println(scanner.nextLine());
            pr.flush();

            InputStreamReader in = new InputStreamReader(s.getInputStream());
            BufferedReader bf = new BufferedReader(in);


            String str = bf.readLine();
            System.out.println("server: " + str);
        }
    }
}