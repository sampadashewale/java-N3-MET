package org.tnsif.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

import java.util.Queue;
public class PriorityQueueDemo {
	public static void main(String[] args) {
		Queue <Integer> obj=new PriorityQueue<>();
		obj.offer(13);
		obj.add(55);
		obj.add(91);
		obj.offer(91);
		System.out.println("  "+obj);
		
		/*obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();
		System.out.println("  "+obj);*/
		
		 // poll method will not give error
		/*obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();*/
		
		obj.remove();
		System.out.println(obj);
		System.out.println("Head element is queue : "+obj.peek());
		System.out.println("Queue elemrnts are : "+obj);
		
	}

}
