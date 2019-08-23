package Day2_LinkedLists;

import java.util.*;

public class SingleLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// global variable head
	static Node head;

	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();

		sl.head = new Node(-9);
		Node second = new Node(2);
		Node third = new Node(6);

		sl.head.next = second;
		second.next = third;
		//printLinkedList(sl.head);
		//System.out.println(" ");
		
		// System.out.println(countNodesRecursion(sl.head));
		// System.out.println(countEvenValues(sl.head));
//		System.out.println("\nbefore inserting a node: ");
//		sl.printLinkedListRecursion(sl.head);
//
//		System.out.println("\nInserting a node: ");
//		sl.insertNode(sl.head, third, 5);
//		sl.printLinkedListRecursion(sl.head);
//
//		deleteNode(sl.head, second);
		sl.addHead(sl.head, 4);
		sl.deleteHead(sl.head);

	}

	public static void printLinkedList(Node n) {
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public Node printLinkedListRecursion(Node n) {
		if (n == null) {
			return n;
		} else {
			System.out.println(n.data + "");
			return printLinkedListRecursion(n.next);
		}
	}

	public static int countNodes(Node n) {
		int count = 0;
		while (n.next != null) {
			count++;
		}
		return count;

	}

	public static int countNodesRecursion(Node n) {
		if (n != null) {
			return 1 + countNodesRecursion(n.next);
		} else {
			return 0;
		}
	}

	public static int countEvenValues(Node n) {
		int count = 0;
		while (n.next != null) {
			if (n.data % 2 == 0) {
				count++;
			} else {
				n = n.next;
			}
		}
		return count;
	}

	public static int countEvenValuesRecursion(Node n) {
		if (n.data % 2 == 0) {
			return 1 + countEvenValuesRecursion(n.next);
		} else {
			return 0;
		}
	}

	public void insertNode(Node h, Node n, int newVal) {
		// for traversing till Node n, so that we can insert a new node
		while (h.next != n) {
			h = h.next;
		}

		Node newNode = new Node(newVal);
		newNode.next = n;
		h.next = newNode;
	}

	public static void deleteNode(Node n, Node h) {
		while (n.next != h) {
			n = n.next;
		}
		n.next = h.next;
		printLinkedList(n);
	}

	public  void addHead(Node n, int newHead) {
		Node nd = new Node(newHead);
		nd.next = n;
		head = nd;
		printLinkedList(head);
	}
	
	public void deleteHead(Node n) {
		head = n.next;
		printLinkedList(head);
		
	}
}
