package Eubungsbaltt_2;

public class Aufgabe_5 {

	public static void main(String[] args) {
		double speicher =0;
		int i = 0;
		int i2=0;
		int min =Integer.MAX_VALUE;
		double []array= {53,32,19,5,79,25,47 };
		for ( i = 0; i < array.length-1; i++) {speicher =array[i];
			for (int j = i+1; j < array.length; j++) {
				if(array[i]<array[j]) {
					
					array[i]=array[j];
					array[j]=speicher;
					
				}}}System.out.println(array[i]);
				int max=0; 

				for(i2=0;i<array.length-1; i2++) { 

				if(max<array[i2]) { 

				max=(int) array[i2]; 
				
				
	
	}
	

}System.out.println(array[i2]);}}
