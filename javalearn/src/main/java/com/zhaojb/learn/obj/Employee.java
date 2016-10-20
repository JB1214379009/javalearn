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
	//所有数据域初始化为默认值（0、false、null）
	//按照在类声明中出现的次序，依次执行所有域初始化语句和初始化块
	//如果构造器第一行调用了第二个构造器，则执行第二个构造器主体
	//执行这个构造器的主体
	//可以通过提供一个初始化值，或者使用一个静态的初始化块来对静态域进行初始化
	//如果对类的静态域进行初始化的代码比较复杂，那么可以使用静态的初始化块
	//如果没有指定public或private，这个部分（类、方法或变量）可以
	//被同一个包中的所有方法访问
}
