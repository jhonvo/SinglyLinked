package com.codigndojo.singlylinkedlist;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    
    public void remove(int value) {
    	Node current = this.head;
    	if (this.head.value == value) {
    		this.head = current.next;
    	}
    	else {
    		while (current.next != null) {
        		if (current.next.value == value) {
        			current.next = current.next.next;
        		}
        		else {
        			current = current.next;
        		}
    		}
    	}
    }
    
    public void printValues(){
    	Node current =  this.head;
    	while (current != null) {
    		System.out.println(current.value);
    		current = current.next;
    	}
    }
    
    public void find(int value) {
    	Node current =  this.head;
    	int find = 0;
    	while (current != null) {
    		if (current.value == value) {
    			System.out.println("Value found at node: " + current);
    			find += 1;
    			current = current.next;
    		}
    		else {
    			current = current.next;
    		}
    	}
    	if (find == 0) {
    		System.out.println("Value not found");
    	}
    }

    
    
}
