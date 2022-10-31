package Eubungsbaltt_2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Aufgabe_7 {
	// ein bestimmtes  Element in einem Array löschen 
	static int []array= new int [6] ;
	
		public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			System.out.println("Bitte geben Sie ein Array ein");
			
for (int j = 0; j < array.length; j++) {
	
	array[j] =scanner.nextInt();
	
}

			int index=5;
			
			//int [] array = {25,14,56,15,36};
			int[] array_1=new int[array.length-1];
			
			for (int i = 0; i < array.length-1; i++) {
				
				if (i>=index) { array_1[i]=array[i+1];
				
				
						
				}
				else {array_1[i]=array[i];}
			}
			System.out.println(Arrays.toString(array_1));}}
