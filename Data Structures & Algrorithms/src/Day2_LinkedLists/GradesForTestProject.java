package Day2_LinkedLists;

import java.util.*;

import Day2_LinkedLists.SingleLinkedList.Node;

public class GradesForTestProject {

	static class Node {
		int score;
		String name;
		Node next;

		Node(String n, int s) {
			name = n;
			score = s;
			next = null;
		}

	}

	Node head;

	public static void main(String[] args) {
		GradesForTestProject sl = new GradesForTestProject();

		sl.head = new Node("Jack", 90);
		Node two = new Node("Mary", 95);
		Node three = new Node("Bob", 85);
		Node four = new Node("Bhargav", 20);
		Node five = new Node("Apoorva", 100);
		Node six = new Node("Jeffery", 87);
		Node seven = new Node("Nathan", 92);
		Node eight = new Node("Sebastian", 90);
		Node nine = new Node("Yang", 97);
		Node ten = new Node("Yash", 72);
		Node eleven = new Node("Rishabh", 92);
		Node twelve = new Node("Annabelle", 79);
		Node thirteen = new Node("Henry", 63);
		Node fourteen = new Node("Paul", 89);
		Node fifteen = new Node("Michelle", 93);
		Node sixteen = new Node("Jake", 96);
		Node seventeen = new Node("Josh", 84);
		Node eighteen = new Node("Harry", 78);
		Node nineteen = new Node("Ben", 81);
		Node twenty = new Node("Meet", 21);

		sl.head.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		seven.next = eight;
		eight.next = nine;
		nine.next = ten;
		ten.next = eleven;
		eleven.next = twelve;
		twelve.next = thirteen;
		thirteen.next = fourteen;
		fourteen.next = fifteen;
		fifteen.next = sixteen;
		sixteen.next = seventeen;
		seventeen.next = eighteen;
		eighteen.next = nineteen;
		nineteen.next = twenty;
		
		System.out.println(average(sl.head));
	}

	public static double avgOf(ArrayList<Integer> a) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < a.size(); i++) {
			sum = sum + a.get(i);
		}
		System.out.println(sum);
		avg = (double) sum / a.size();
		return avg;

	}

	public static double average(Node n) {
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		while (n != null) {
			count ++;
			sum = sum + n.score;
			avg = (double) sum / count;
		}
			return avg;
		
	}

}
