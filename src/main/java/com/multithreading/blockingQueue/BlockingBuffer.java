package com.multithreading.blockingQueue;

import com.interfaces.Buffer;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer {
  private final ArrayBlockingQueue<Integer> buffer;

  public BlockingBuffer(int capacity) {
    buffer = new ArrayBlockingQueue<>(capacity);
  }

  public void set(int value) throws InterruptedException {
    buffer.put(value);
  }

  public int size() {
    return buffer.size();
  }

  public int get() throws InterruptedException {
    int value = buffer.take();
    return value;
  }
}
