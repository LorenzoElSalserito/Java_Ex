import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class NumerazionePosizionale {
    public static Scanner In= new Scanner(System.in);
    int numero;
    
	public NumerazionePosizionale(int numero) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
	}
	
	public void PosizioneNumerica() {
		    if (numero<10) {
				System.out.println(numero+" ha la posizione unitaria");
			}
			if (numero>10) {
				System.out.println(numero+" ha la posizione decimale");
			}
			if (numero>100) {
				System.out.println(numero+" ha la posizione delle centinaia");
			}
			if (numero>1000) {
				System.out.println(numero+" ha la posizione delle migliaia");
			}
			if (numero>10000) {
				System.out.println(numero+" ha la posizione delle decine di migliaia");
			}
			if (numero>100000) {
				System.out.println(numero+" ha la posizione delle centinaia di migliaia");
			}
			if (numero>1000000) {
				System.out.println(numero+" ha la posizione del milione");
				
			}
			if (numero>10000000) {
				System.out.println(numero+" ha una posizione superiore al milione");
			}

			

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NumerazionePosizionale N = new NumerazionePosizionale (138);
        N.PosizioneNumerica();
    
	}

}
