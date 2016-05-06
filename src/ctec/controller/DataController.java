package ctec.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import ctec.model.Customer;
import ctec.model.Dish;

public class DataController 
{
	private Queue<Customer> customerQueue;
	private Stack<Dish> dishStack;
	
	public void start()
	{
		doStuffToDishes();
		useTheCustomerQueue();
		fillQueue();
	}
	
	private void doStuffToDishes()
	{
		dishStack = new Stack<Dish>();
		dishStack.add(new Dish(true, java.awt.Color.BLACK, 8));
		System.out.println(dishStack.size());
		dishStack.pop();
		dishStack.push(new Dish(false, java.awt.Color.MAGENTA, 78));
	}
	
	private void useTheCustomerQueue()
	{
		customerQueue = new LinkedList<Customer>();
		customerQueue.add(new Customer(false, "", 3234.3));
		customerQueue.remove();
	}
	
	private void fillQueue()
	{
		
	}
}
