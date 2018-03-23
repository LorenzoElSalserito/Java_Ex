import java.util.*;
import java.lang.*;
import java.io.*;


public class Discriminante {
	public static Scanner In= new Scanner (System.in);

	public static void main(String[] args) {

		System.out.println("Dammi tre numeri per il calcolo del discriminante");
		double a= In.nextInt ();
		double b= In.nextInt ();
		double c= In.nextInt ();
		double delta= (b*b) - (4*a*c);
		System.out.println("Il delta è "+delta);
		if (delta>=0)
		{
			System.out.println("Il delta è maggiore di 0");
	
		}
		else 
		{
			System.out.println("Il delta è negativo");
		}
		}
		}
	


