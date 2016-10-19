package com.zhaojb.learn.basicjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * 
 *@Title:FirstSample
 *@Description:
 *@Author:zhaojb
 *@Since:2016年10月19日
 *@Version:1.1.0
 */
public class FirstSample {

	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileIO();
	}

	public static void primitiveType() {
		int x = 0b1001;
		int y = 0b1111_0000_1101;
		int z = 0x3bf;
		int a = 07;
		long b = 4000L;
		double c = 3.14;//默认为double型 
		float d = 3.14f;//浮点数不适合用于禁止出现舍入误差的金融计算中，因为浮点数值采用二进制系统表示
		//无法正确表示十分之一
		//应当采用bigdecimal
		if (c == Double.NaN) {
			//所有非数值都认为是不相同的
			//应该用Double.isNaN(x)
		}
		//声明一个变量之后，必须用赋值语句对变量进行显式初始化，千万不要使用未被初始化的变量
		//声明尽可能放在第一次使用的地方
		int i,j;
		//只能被赋值一次，使用全大写
		final double CM_PER_INCH = 	2.524;
		//>>>用符号位填充高位
		//>>用0填充高位
		//java中没有幂运算，需要借助Math.sqrt(x);
	}
	
	public static void strings() {
		String greeting = "Hello";
		String s = greeting.substring(0, 3);//后面的参数代表不想复制的第一个位置
		//长度等于3-0
		String expletive = "Expletive";
		String PG13 = "deleted";
		String message = expletive + PG13;//字符串属于不可变字符串
		message.equals(PG13);//检测两个字符串是否相等
		"helol".equalsIgnoreCase("Hello0");//记住不要使用==运算符
		//空串是长度为0的字符串
		message.length();//返回采用utf-16编码表示的给定字符串所需要的代码单元数量
		//如果想获取代码点数量的话，可以调用
		//string.codePointCount(0,string.length());
		//代码点跟代码单元是不同的，代码点是一个字符的代码值，代码单元是代码点的子集，一个代码单元是一个字符的编码，或者辅助字符的第一或者第二部分
		//charat()返回的是代码单元
		//如果想获取代码点的话可以采用
		//int index = string.offsetByCodePoints(0,i);
		//int cp = string.codePointAt(index);
		//遍历并获取每一个代码点的话使用
		//Character.isSupplementaryCodePoint(cp))
		//注意区分空串与null串，先判断null再判断空串，不允许在一个null上调用方法
	}
	
	public static void stringsApi() {
		String string0 = "hello";
		String string1 = "world";
		string0.charAt(0);//返回的是代码单元
		string1.codePointAt(0);//返回的是给定位置开始或者结束的代码点
		string0.offsetByCodePoints(0, 5);//从指定位置开始偏移cpCount后的代码点索引
		string0.compareTo(string1);//位于string1之前返回正数，之后返回负数，相等返回0
		string0.endsWith("llo");//以什么结尾
		string0.equals(string1);//相等
		string0.equalsIgnoreCase(string0);//忽略大小写
		string0.indexOf('a');
		string0.indexOf(0);//某个代码点的位置
		string0.lastIndexOf(0);//某个代码点的位置
		string0.lastIndexOf(0);//某个代码点的位置
		string0.length();//代码单元的长度
		string0.codePointCount(0, string0.length());//代码点的数量，没有配成对的代用字符将计入代码点
		string0.replace("llo", "world");//替换
		string0.startsWith("he");
		string0.toLowerCase();
		string0.toUpperCase();
		string0.trim();//删除了原始字符串头部和尾部的空格
	}
	
	public static String createString() {
		StringBuilder builder = new StringBuilder();
		builder.append("h");
		builder.append("s");
		builder.append('a');
		builder.appendCodePoint(4);
		builder.insert(0, "aaa");
		builder.setCharAt(0, 'a');
		builder.delete(0, 5);
		return builder.toString();//StringBuffer是它的前身，效率稍微有点低，但允许采用多线程的方式执行添加或删除字符的操作
		//单线程下使用stringbuilder
	}
	
	public static void io() {
		Scanner inScanner = new Scanner(System.in);
		String name = inScanner.nextLine();
		System.out.println(name);
		int age = inScanner.nextInt();
		System.out.println(age);
		while(inScanner.hasNext()){
			System.out.println(inScanner.next());
		}
	}
	
	public static void formatOutput() {
		System.out.printf("%.2f",3.1456454f);
		//String.formatTo();可以使用
	}
	
	public static void fileIO() {
		try {
			
			Scanner scanner = new Scanner(Paths.get("src/main/test.txt"));
			String string = scanner.nextLine();
			System.out.println(string);
			PrintWriter writer = new PrintWriter("src/main/test.txt");
			writer.println("aaa");//没有则会创建
			writer.flush();
			writer.close();
			scanner.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void bigNumber() {
		BigInteger bigInteger = BigInteger.valueOf(100);
		BigDecimal bigDecimal = BigDecimal.valueOf(500);
		//大数值可以实现任意精度的数值运算
		bigDecimal.add(bigDecimal);
		bigDecimal.multiply(bigDecimal);
		bigDecimal.subtract(bigDecimal);
		bigDecimal.divide(bigDecimal);
		bigDecimal.compareTo(bigDecimal);
	}
	
	public static void arr() {
		int[]a;//只是声明了变量，并没有将a初始化为一个真正的数组
		int[]b = new int[100];//创建了一个可以存储100个整数的数组，数组长度不要求是常量
		String string =Arrays.toString(b);
		int[]c = {1,2,3};
		//注意这是两个变量引用同一个数组
		b=c;
		//要用arrays.copyOf来做
		//也可以用它来扩展长度，多于的元素按默认数值处理
		//利用arrays.sort()可以实现排序
		//arr[][];
		//想要快速的打印二维数组可以使用arrays.deepToString();
		//采用arr = new int[a][]的方式先命名行，再根据需求来命名不同长度的列
	}
	
	public static void foreach() {
		int []a = new int[10];
		for(int b:a){}
	}
}
