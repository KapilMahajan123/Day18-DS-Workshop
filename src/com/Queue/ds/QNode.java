package com.Queue.ds;

public class QNode {
	
	 int key;
	 QNode next;
	 
	    // constructor to create a new linked list node
	    public QNode(int key)
	    {
	        this.key = key;
	        this.next = null;
	    }
	}
	 
	// A class to represent a queue
	class Queue {
	    QNode front, rear;
	 
	    public Queue() { 
	    	this.front = this.rear = null; 
	    	}
	 
	    // Enqueue method
	    void enqueue(int key)
	    {
	        QNode temp = new QNode(key);
	        if (this.rear == null) {
	            this.front = this.rear = temp;
	            return;
	        }
	        this.rear.next = temp;
	        this.rear = temp;
	    }
	 
	    // Dequeue Method
	    void dequeue()
	    {
	        if (this.front == null)
	            return;
	        QNode temp = this.front;
	        this.front = this.front.next;
	 
	        if (this.front == null)
	            this.rear = null;
	    }
}
