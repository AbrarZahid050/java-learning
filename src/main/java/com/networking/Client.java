package com.networking;

import java.io.*;
import java.net.*;

public class Client {
  public static void main(String[] args) {
    final String serverHost = "localhost";
    final int serverPort = 5555;

    try (Socket socket = new Socket(serverHost, serverPort);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

      System.out.println("Connected to the server. Type 'bye' to exit.");

      String userInputLine;
      while ((userInputLine = userInput.readLine()) != null) {
        out.println(userInputLine);

        if ("bye".equalsIgnoreCase(userInputLine)) {
          break;
        }

        System.out.println("Server response -> " + in.readLine());
      }

    } catch (UnknownHostException e) {
      System.err.println("Don't know about host " + serverHost);
      e.printStackTrace();
    } catch (IOException e) {
      System.err.println("Couldn't get I/O for the connection to " + serverHost);
      e.printStackTrace();
    }
  }

}
