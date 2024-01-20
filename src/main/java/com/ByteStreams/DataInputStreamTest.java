package com.ByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DataInputStreamTest {
  public static void main(String[] args) throws IOException {
    var fio = new DataOutputStream(new FileOutputStream("./assets/data.bin"));
    var fout = new DataInputStream(new FileInputStream("./assets/data.bin"));

    fio.writeInt(25);
    fio.writeUTF("This is a test");

    fio.flush();
    fio.close();

    int num = fout.readInt();
    String str = fout.readUTF();

    System.out.println("-> [output] : " + num + " " + str);

    fout.close();

  }
}
