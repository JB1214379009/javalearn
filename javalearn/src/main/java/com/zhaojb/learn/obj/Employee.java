package com.zhaojb.learn.obj;

import java.util.Random;

import sun.nio.cs.Surrogate.Generator;

public class Employee {
	private String name;
	private double salary;
	private int id = assignId();
	private static int nextId;
	
	private static int assignId(){
		int r = nextId;
		nextId++;
		return r;
	}
	
	public Employee(String n, double s) {
		// TODO Auto-generated constructor stub
		name = n;
		salary = s;
	}
	
	public Employee(double s) {
		// TODO Auto-generated constructor stub
		this("Employee #" + nextId, s);
		nextId++;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public String getName() {
		return name;
	}
	/**
	 * 
	    * @Title: getSalary
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @return    参数
	    * @return double    返回类型
	    * @throws
	 */
	public double getSalary() {
		return salary;
	}
	//初始化块，只要构造类的对象，这些块就会被执行
	{
		id = nextId;
		nextId++;
	}
	
	static {
		Random random = new Random();
		nextId = random.nextInt(10000);
	}
}
