package com.linkedlist;


public class Linklist {
	static Node head;
	public static void insert(int data) {
		if(head == null) {
			head = new Node(data);
		}
		else {
			Node temp = head;
			System.out.println(temp.data);
			temp = temp.next;
		} 
	}

	public static void main(String[] args) {
//		insert(10);
//		insert(11);
//		System.out.println(temp.data);
	}

}
	