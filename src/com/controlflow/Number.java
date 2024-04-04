package com.controlflow;

public class Number 
{
	public static void printNumbers (int num)
	{
		for (int i = 1; i <= num; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
    }
	public static void main(String[] args) {
	    printNumbers(5);
	  }
}
