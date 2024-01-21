package com.networking;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;

// testing 1 2 3 
public class Server {
  public static void main(String[] args) {
    final int port = 5555;

    try (ServerSocket server = new ServerSocket(port)) {
      System.out.println("Server is listening at port: " + port);

      while (true) {
        // Continuously accept incoming client connections
        clientConnect(server);
      }
    } catch (IOException err) {
      System.out.println("Could not start server. " + err.getMessage());
    }
  }

  // Method to handle communication with a connected client
  public static void clientConnect(ServerSocket server) {
    try (Socket client = server.accept();
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));) {

      System.out.println("Client connected.");
      // Send initial message to the client
      out.println("[Server] type 'bye' to exit.");

      String input;
      while ((input = in.readLine()) != null) {
        // Process messages received from the client
        System.out.println("Received from client: " + input);
        out.println("[Server] " + input);

        // Check if the client wants to exit
        if ("bye".equalsIgnoreCase(input.trim())) {
          System.out.println("[Closing]--------------------");
          client.close();
          // Exit the loop if 'bye' is received
          break;
        }
      }
    } catch (IOException err) {
      System.err.println("Ending the communication with the client.");
    }
  }
}
