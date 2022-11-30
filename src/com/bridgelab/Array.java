package com.bridgelab;

import java.util.Scanner;

/*Repeating element of an array in Java
Find repaating elements
Sort the Array
Find the Min form that Array*/

public class Array {
	
	public void sortArray(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("**** Sorting Array *****");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void repatingElement(int arr[]) {
		System.out.println("\n Repating elements");
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
	
	public void minimumValue(int arr[]) {
		System.out.println("\n Minimum Valye in array");
		System.out.println("\n min value");
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			System.out.println(min);
		}
	}
	
	public static void main(String[] args) {
	Scanner scan = new  Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = scan.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the Elements of the array");
		for(int i=0;i<size;i++) {
		arr[i]=scan.nextInt();
		}
		Array obj = new Array();
		obj.sortArray(arr);
		obj.repatingElement(arr);
		obj.minimumValue(arr);
		scan.close();
	}

}
