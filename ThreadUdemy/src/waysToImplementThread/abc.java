package waysToImplementThread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class abc extends Men{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList<Integer>();
		Stack s  = new Stack();
		
		
		Men m = new abc();
		m.sex();
		m.gender();
		
		
		gama g = new gama();
		g.m1();
		g.m2();
		
		

	}

	@Override
	void gender() {
		// TODO Auto-generated method stub
		System.out.println("abstratc method gender");
	}
	
}



abstract class Men{
	abstract void gender();
	void sex() {
		System.out.println("abstract class here");
	}
}


interface alpha{
	abstract void m1();
	void m2();
}


class gama implements alpha{
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("interface with abstract method m1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("don't need to define abstract keyword to a method, methods in iterface is auto abstratc");
	}
}
