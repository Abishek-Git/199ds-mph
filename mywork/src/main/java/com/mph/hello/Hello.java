package com.mph.hello;

public class Hello {
	public int add(int... number) {
		int x =0;
		for(int a:number) {
			x=x+a;
		}
		return x;
	}
	public int mul(int... number) {
		int x =1;
		for(int a:number) {
			x=x*a;
		}
		return x;
	}

	public static void main(String[] args) {

	}

}
