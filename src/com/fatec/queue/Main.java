package com.fatec.queue;

public class Main {
    public static void main(String[] args) {
        // [], head = 0, tail = -1
        Queue queue = new Queue(3);
        // [1], head = 0, tail = 0
        queue.enqueue(1);
        // [1,2], head = 0 , tail = 1
        queue.enqueue(2);
        // [1,2,3] head = 0 , tail = 2
        queue.enqueue(3);
        // should print stack is Full
        queue.enqueue(4);
        // should print 1
        System.out.println(queue.peek());
        // should return false
        queue.contains(4);
        // should return true
        queue.contains(3);
        // dequeue 1: 1
        System.out.println("DEQUEUE 1:" + queue.dequeue());
        // dequeue 2: 2
        System.out.println("DEQUEUE 2:" + queue.dequeue());
        // dequeue 3: 3
        System.out.println("DEQUEUE 3:" + queue.dequeue());

        System.out.println(queue.dequeue());
    }
}
