package com.networking;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) {
    final int port = 5555;

    try {
      ServerSocket server = new ServerSocket(port);
      System.out.println("Server is listening at port: " + port);

      while (true) {
        Socket client = server.accept();
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

        System.out.println("Client connected.");

        String input;
        while ((input = in.readLine()) != null) {
          System.out.println("Received from client: " + input);
          out.println("Server: " + input);

          if (input == "bye") {
            client.close();
          }
        }
      }
    } catch (IOException err) {
      System.out.println("Could not start server. " + err.getMessage());

    }

  }
}
