package com.Queue.ds;

public class Test {
	
	 public static void main(String[] args)
	    {
	        Queue queue = new Queue();
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.dequeue();
	        queue.dequeue();
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);
	        queue.dequeue();
	        System.out.println("Queue Front : " + queue.front.key);
	        System.out.println("Queue Rear : " + queue.rear.key);
	    }

}
