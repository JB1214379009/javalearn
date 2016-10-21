package com.zhaojb.learn.exceptions;

public class Exceptions {
	//如果由于出现错误而使得某些操作没有完成，程序应该
	//允许用户保存所有操作的结果，并以适当的方式终止程序
	//用户输入错误、设备错误、物理限制、代码错误
	//一种表示错误状态状况的常用返回值是null引用
	//异常分类
	//在Java程序设计语言中，异常对象都是派生于Thorwable类的一个实例
	//如果Java中内置的异常类不能够满足需求，用户可以创建自己的异常类
	//需要注意的是，所有的异常都是由Throwable继承而来的，但是在下一层立即分解
	//为两个分支 Error和Exception
	//Error类层次结构描述了Java运行时系统的内部错误和
	//资源耗尽错误
	//应用程序不应该抛出这个类型的对象
	//Runtimeexception是程序错误导致的异常，
	//程序本身没有问题，但由于像I/O错误这种问题导致的异常属于其他异常
	//如果出现runtime的话，那一定是你的问题
	//未检查异常 派生于error跟runtimeexception的所有异常
	//所有其他的异常称为已检查异常
	//编译器将核查是否为所有的已检查异常提供了异常处理器
	//对于那些可能被他人使用的java方法，应该根据异常规范，
	//在方法的首部声明这个方法可能抛出的异常
	//抛出多个已检查异常，那就必须在方法的首部列出所有的异常类，中间用逗号隔开
	//不需要声明java的内部错误，即从error继承的错误，
	//任何程序代码都具有抛出那些异常的潜能，而我们没有控制能力
	//同样也不需要声明从RuntimeException继承的那些未检查异常
	//总之，一个方法必须声明所有可能抛出的已检查异常，而
	//未检查异常要么不可控制
	//要么就应该避免发生
	//如果方法没有声明所有可能发生的已检查异常，编译器就会给出一个错误信息
	//处了声明异常之外，还可以捕获异常，这样会使得异常不被抛到方法之外
	//子类覆盖了超类的方法，子类必须抛出更加特定的异常
	//如果超类方法不抛出任何已检查异常，子类也不能抛出任何已检查异常
	//如果类中的一个方法声明将会抛出一个异常，
	//而这个异常是某个特定类的实例时，则这个方法就有可能抛出一个这个类的异常，
	//或者这个任意一个子类的异常
	//一旦方法抛出了异常，这个方法就不可能返回到调用者
	//不必为返回的默认值或错误代码担忧	
	//创建异常类，只需要定义一个派生于exception或者派生于exception子类的类
	//定义类应该包含两个构造器，一个是默认的构造器，另外一个是带有详细信息的构造器，string入参
}
