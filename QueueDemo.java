package Main;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> qu=new PriorityQueue<>();
		System.out.println("remove Elements="+qu.poll());
		qu.add(600);
		qu.offer(655);
		qu.offer(255);
		qu.offer(80);
		qu.offer(30);
		qu.offer(50);
		System.out.println("Queue Data="+qu);
		System.out.println("removed elements="+qu.remove());
		System.out.println("removed elements="+qu.remove());
		System.out.println("peek elements="+qu.peek());
		System.out.println("removed elements="+qu.poll());
		System.out.println("Queue Data="+qu);
	}
}
