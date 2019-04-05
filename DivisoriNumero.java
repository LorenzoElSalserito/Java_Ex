import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class DivisoriNumero {//questo programma prende in input un numero e controlla i suoi divisori e li conta
    public static Scanner In= new Scanner(System.in);
    int divisori;
    int quantidivisori;
    int resto;
    int numeromezzi;
	int numero;
	int i;
    
    public void DimmiDivisori() {
	    System.out.println("Dammi un numero per permettermi di dirti quanti e quali sono i suoi divisori:");
		numero = In.nextInt();
		numeromezzi = (numero/2)+1;
		while (i<=numeromezzi) {
			resto = numero%i;
			i = divisori;
			//System.out.println(i+divisori+resto);
			if (resto == 0) {
				System.out.println("un divisore è: "+divisori);
				quantidivisori = quantidivisori+1;
			}
			i++;
		}
		
		System.out.println("i divisori in totale sono "+quantidivisori);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DivisoriNumero N = new DivisoriNumero();
        N.DimmiDivisori();
  }
}

