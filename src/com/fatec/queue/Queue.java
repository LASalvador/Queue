package com.fatec.queue;

public class Queue {
    private int head, tail, size;
    private int array[];

    public Queue(int size) {
        this.head = 0;
        this.tail = -1;
        this.size = size;
        this.array = new int[size];
    }

    public boolean isFull() {
        return tail == (size - 1);
    }

    public boolean isEmpty() {
        return tail < 0;
    }

    public boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Is Full");
            return false;
        }
        tail+=1;
        array[tail] = data;
        return true;
    }

    public int dequeue() {
        if (isEmpty() || head > tail) {
            System.out.println("Queue is Empty");
            return 0;
        }

        int item = array[head];
        head+=1;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0;
        }
        return array[head];
    }

    public boolean contains(int target) {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return false;
        }

        for (int i = 0; i < tail; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

}
