package Eubung_4;

import java.util.Arrays;
import java.util.Iterator;

public class Aufgabe_1 {

	public static void main(String[] args) {
		int summe_Hauptdiagonale=0;
		int Summe_Matrix=0;
		int spalte_Summ=0;
		int [][] transprtierteArray= new int [4][4];
		int NullWert=0;
		
		
		int [][]Array= {{-1,2,3,7},{3,4,5,0},{5,6,9,7},{5,-6,-9,-4}};
		System.out.print("Der angegebene Matrix\n" );
		for (int i = 0; i < 4; i++) {
			summe_Hauptdiagonale+=Array[i][i];
			{
				for (int j = 0; j < 4; j++) {
					
					System.out.print(" "+Array[i][j]);
					Summe_Matrix+=Array[i][j];
				}System.out.print("\n");
			}
			
		}
System.out.print("-----------------------------------------------------------------------------------------------------------------------------------------------\n");

		double Mittelwert=(double) Summe_Matrix/16;
		System.out.print("Das arithmetische Mittel der Elemente der Matrix = "+Mittelwert);
		System.out.print("\n");
		System.out.print("Die Summe der Elemente der Hauptdiagonale = "+summe_Hauptdiagonale);
		System.out.print("\n");
System.out.print("-----------------------------------------------------------------------------------------------------------------------------------------------\n");

		for (int i = 1, j=0; i < 17; i++) {
			
			spalte_Summ+=Array[i-1][j];
			if(i==4){
				int spalteNummer=j+1;
				System.out.print("Das arithmetische Mittel der Elemente der Spalte "+spalteNummer+" = "+spalte_Summ);
				System.out.print("\n");
				spalte_Summ=0;
				j++;
				i=NullWert;
				
				if(j==4) {
					break;
				}}}
System.out.print("-----------------------------------------------------------------------------------------------------------------------------------------------\n");
System.out.println("Die transponierte Matrix");
for (int i = 0; i < 4; i++) {
	for (int j = 0; j < 4; j++) {
		transprtierteArray[i][j]=Array[j][i];
		System.out.print(" "+transprtierteArray[i][j]);
		
	}
	System.out.print("\n");
	
}

System.out.print("-----------------------------------------------------------------------------------------------------------------------------------------------\n");
for (int i = 0; i < 4; i++) {
	
	for (int j = 0; j < 4; j++) {
		if(Array[i][j]<0) {
			
			System.out.print(" "+0);
		}
		else {
			System.out.print(" "+1);
		}}
	System.out.print("\n");
}System.out.print("-----------------------------------------------------------------------------------------------------------------------------------------------\n");
for (int i = 0; i < 4; i++) {
	for (int j = 0; j < 4; j++) {
		if(i==j) {
			Array[i][j]=0;}
		
			System.out.print("  "+Array[i][j]);

		

	
}System.out.print("\n");}
}}
				
			
		
		
		
	


	


