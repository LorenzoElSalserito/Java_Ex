import java.util.*;
//Inseriamo una data come classe e generiamo da essa oggetti immutabili (tuple)


public class Calendario {
public static int giorno=0, mese=1, anno=2;
private int G=0, M=0, A=0;
public static Scanner In= new Scanner (System.in);

public void data (){
	System.out.println("Dammi la data di oggi, prima il giorno, poi il mese, ed infine l'anno");
	G=In.nextInt();
	M=In.nextInt();
	A=In.nextInt();
	System.out.println(G+"/"+M+"/"+A);
}//Inserisco la data di oggi per generare il calendario


public void durata_mese (){//30 gg a nov con apr giu e sett, di 28 ce n'è 1 gli altri son 31
	if (M==11||M==4||M==6||M==9)
		mese=30;
	if (M==2)
		mese=28;
	else
		mese=31;
		System.out.println ("Questo mese ha "+mese+"giorni");
	}

public int anno_bisestile (){
	int bisestile=A%4;
		if (A%100==0)
	{
		if (A%400==0)
		{
		System.out.println("Questo anno non è bisestile");
		}
	}
	else
	{
	while (A>0)
	if (bisestile==0)
	{
		System.out.println("L'Anno inserito è bisestile");
		break;
	}
	else
	{
		System.out.println("L'anno inserito, non è bisestile");
		break;
	}
	}
	return bisestile+A;	
}
public void giorno_prima(){
	int G1=G-1;
	System.out.println("Il giorno prima è: "+G1);
}
public void giorno_dopo(){
	int G2=G+1;
	System.out.println("Il giorno dopo è: "+G2);
	}
public void quanto_a_natale(){
	int Gn=25;
	int Mn=12;
	int An=A;
	int GN=Gn-G;
	int MN=Mn-M;
	int natale []= {Gn,Mn,An};
	if (G<Gn && M<=Mn)
	{
		int distanzanatale [] ={GN, MN};
		System.out.println("I giorni e i mesi che mancano a Natale sono: "+GN+"gg"+MN+"mm");
	}
	else{
		int GNn=G-Gn;
		System.out.println("I giorni e i mesi che mancano a Natale sono: "+GNn+"gg"+MN+"mm");
	}
}

public static void main (String[]args){
	
	Calendario DATA=new Calendario ();
	DATA.data();
	DATA.anno_bisestile();
	DATA.durata_mese();
	DATA.giorno_dopo();
	DATA.giorno_prima();
	DATA.quanto_a_natale();
	
}
}
