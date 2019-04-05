import java.util.*;
import java.lang.*;


public class SommaIterativa {
	public static Scanner In= new Scanner(System.in);
	int a;
	int b;
	int somma;
	int controllosomma;

	public SommaIterativa(int a, int b) { //uso un metodo ricorsivo per ottenere la somma di alcuni numeri
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	public void Somma() { //prende ogni numero nel range da a a b e lo somma
		for(int i=a; i<=b; i++) {
			somma += i;
			//System.out.println("La somma dei numeri da a a b è "+somma);
		}
		System.out.println("La somma dei numeri da a a b è "+somma);
	}
	
	public void ControlloSomma() { //banalmente controlla se la somma è giusta
		controllosomma = b*(b+1)/2;
		System.out.println("La somma totale doveva essere "+controllosomma);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SommaIterativa S = new SommaIterativa(1, 100);
		S.Somma(); S.ControlloSomma();
		
		

	}

}
