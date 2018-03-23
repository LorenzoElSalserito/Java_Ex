import java.util.*;

public class NumeroDos {
	public static Scanner In= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Quanto deve essere lunga la sequenza?");
		int l=In.nextInt();   
		int numeri[]= new int[l];
		int i=0;
		
		for (i=0; i<l; i++)
		{
			System.out.println("Dammi la sequenza");
			numeri [i]=In.nextInt();
		}
		System.out.println("Scrivi un numero");
		int z=In.nextInt();
		int j=0;
		for (j=0; j<l; j++)
		{
			if (numeri[j]==z)
			System.out.println("il numero c'è ");
			else 
			System.out.print("il numero non c'è ");
		}
	}

}
