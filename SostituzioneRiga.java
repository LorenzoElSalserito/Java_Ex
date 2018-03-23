import java.util.*;
import java.lang.*;
import java.io.*;

public class SostituzioneRiga {
	
	public static Scanner In= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[4];
		int k=0,i=0,j=0,l=0;
		int m[][]=new int[4][4];
		
		
		System.out.println("Dammi la riga che devo andare a sostituire: "+'\n');
		k=In.nextInt();
		
		for(i=0; i<4; i++){
			for(j=0; j<4; j++){
		System.out.println("Dammi l'elemento della matrice : "+'\n' +i +j);
		m[i][j]=In.nextInt();

			}
	  }
		
		for(l=0; l<4; l++){
			System.out.println("Dammi l'elemento del vettore" +l);
			a[l]=In.nextInt();
			
		}
		
		
			
				for(j=0; j<4; j++){
				m[k][j]=a[j];
			
		}
			
	for(j=0; j<4; j++){
				
		System.out.println("Il risultato matriciale è  "+m[k][j]);
				
			
		}
		
			
		
		
	}
	
	
}
