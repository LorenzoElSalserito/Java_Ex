import java.util.*;
import java.lang.*;
import java.io.*;

public class Doppione {//Controlliamo se la lista1 è doppia o originale rispetto alla lista2
	public static Scanner In= new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
System.out.println("Che lunghezza hanno le liste?");
int l= In.nextInt ();

int i=0;
int j=0;

String[] lista1 = new String[l];
String[] lista2 = new String[l];

for (i=0; i<l; i++)
{
	System.out.println("Prima lista");
	lista1 [i]= In.next();
}

for	(j=0; j<l; j++)
{
	System.out.println("Seconda lista");
	lista2 [j]= In.next();
}
int h=0;
int k=0;
for (h=0; h<l; h++)
{
	for (k=0; k<l; k++)
	{
     if (lista1 [h].equals(lista2 [k]))
         System.out.println("Sono doppi");  
     else
    	 System.out.println("Sono originali");
	}
}
}
}
