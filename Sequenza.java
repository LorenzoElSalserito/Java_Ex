import java.util.*;
import java.lang.*;
import java.io.*;

public class Sequenza {
	public static Scanner In= new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Wela Zio! Dammi una X positiva: ");
		double x= In.nextInt ();
		while (x>0)
		{
			System.out.println ("Wela Zio! Dammi una Sequenza di numeri fino ad uno negativo: ");
			double k= In.nextInt ();
			if (k==x)
			{
				System.out.println ("X è nella sequenza numerica");
			}
			if (k<0)
			{
				System.out.println ("Abbiamo finito, alla prossima Zio!");
				break;
			}
			else
			{
				System.out.println ("X non è nella sequenza numerica");
			}
		}
	}

}
