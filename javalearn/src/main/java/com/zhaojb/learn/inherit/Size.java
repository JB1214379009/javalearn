package com.zhaojb.learn.inherit;

public enum Size {
	//比较两个枚举类型的值时候，永远不要调用equals，而直接使用==就可以了
	SMALL("S"), MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
	
	private String abbreviation;
	
	private Size(String abbreviation) {
		// TODO Auto-generated constructor stub
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation() {
		return abbreviation;
	}
}
