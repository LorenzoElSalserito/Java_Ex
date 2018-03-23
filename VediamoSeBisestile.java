import java.util.*;
import java.lang.*;
import java.io.*;

public class VediamoSeBisestile {
	public static Scanner In= new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("AriDaje! Dimmi un anno ed io ti dr� se � bisestile, A�! ");
		int x= In.nextInt ();
		int b= x%4;
		if (x%100==0)
		{
			if (x%400==0)
			{
			System.out.println("Questo anno nun se conta! Mica so' scemo a�!");
			}
		}
		else
		{
		while (x>0)
		if (b==0)
		{
			System.out.println("A�! me sembra bisestile!");
			break;
		}
		else
		{
			System.out.println("Secondo me, nun � bisestile");
			break;
		}
		}
		System.out.println("Se vedemo A�!");
	}

}
