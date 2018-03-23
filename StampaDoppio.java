mport java.util.*;
import java.io.*;
import java.lang.*;


public class Stampadoppio {
public static Scanner In= new Scanner (System.in);

	public static void main(String[] args) {

InputStreamReader input= new InputStreamReader (System.in);
BufferedReader tastiera= new BufferedReader (input);
System.out.println("Dammi un numero");
int a= In.nextInt ();
int b= 2*a;
System.out.println("il doppio è "+b);
}
	}
