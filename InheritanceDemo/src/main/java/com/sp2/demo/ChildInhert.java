
package com.sp2.demo;

public class ChildInhert extends InherDemo {
	
	private String badhabbits;
	private String goodhabbits;
	
	public String getBadhabbits() {
		return badhabbits;
	}
	public void setBadhabbits(String badhabbits) {
		this.badhabbits = badhabbits;
	}
	public String getGoodhabbits() {
		return goodhabbits;
	}
	public void setGoodhabbits(String goodhabbits) {
		this.goodhabbits = goodhabbits;
	}
	public void displayDetails() {
		System.out.println(getProperty());
		System.out.println(getMoney()); 
		System.out.println(getBadhabbits());
		System.out.println(getGoodhabbits());
		
	}

}
