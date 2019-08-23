package Day2_LinkedLists;

public class DoublyLinkedList {

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
			prev = null;
			next = null;
		}

	}

	Node head;
	Node tail;

	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();

		dl.appendNode(3);
		dl.appendNode(7);
		dl.appendNode(9);
		dl.appendNode(2);

		dl.printDoubleLinkedList(dl.head);
		// dl.insertNodeBefore(dl.head.next, 4);
		// dl.replace(dl.head.next, 2);
		dl.printDoubleLinkedList(dl.head);
		dl.deleteNode(dl.head, dl.head.next.next);
		dl.printDoubleLinkedList(dl.head);
	}

	public void appendNode(int val) {
		Node newNode = new Node(val);
		Node last = head;
		newNode.next = null;

		if (head == null) {
			newNode.prev = null;
			head = newNode;
			tail = newNode;
			return;
		}
		while (last.next != null)
			last = last.next;
		last.next = newNode;
		newNode.prev = last;
		tail = newNode;
	}

	public void printDoubleLinkedList(Node n) {
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void insertNodeBefore(Node n, int v) {
		Node nd = new Node(v);

		nd.next = n;
		nd.prev = n.prev;
		n.prev.next = nd;
		n.prev = nd;

	}

	public static void insertNodeAfter(Node n, int v) {
		Node nd = new Node(v);

		Node temp = n.next;
		nd.next = temp;
		temp.prev = nd;

		n.next = nd;
		nd.prev = n;

	}

	public static void deleteNode(Node n, Node j) {
		if (n == j) {
			n.next.prev = null;
		} else {
			while (n.next != j) {
				n = n.next;
			}

			n.next = j.next;
			n.prev = n.prev;
			j.next.prev = n;

		}

	}
	
	public void del(Node n)
	{
		if(head == n)
		{
			n.next.prev = null;
			return;
		}
		Node temp = n.next;
		Node temp1 = n.prev;
		
		temp1.next = temp;
		temp.prev = temp1;
		
	}

}
