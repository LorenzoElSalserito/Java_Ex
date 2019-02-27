import java.util.*;
import java.lang.*;
import java.io.*;

public class Formazione {
	public static Scanner In= new Scanner(System.in);
	public int lunghezzarosa=26;
	public String nome []= new String [lunghezzarosa];
	public String cognome []= new String [lunghezzarosa];
	public String ruolo []= new String [lunghezzarosa];
	public int numero []= new int [lunghezzarosa];
	public int valore []= new int [lunghezzarosa];
	public int a=0;
	public int c=0;
	public int d=0;
	public int p=0;
		
	
	public void Rosa (){
	for (int i=0; i<lunghezzarosa; i++){
		System.out.println("Inserisci il nome, il cognome, il ruolo, il numero di maglia ed il valore di mercato del giocatore: ");
		System.out.println("I ruoli ammessi, sono: portiere, difensore, centrocampista e attaccante");
		System.out.println("***RICORDATI DI SCRIVERLI IN MINUSCOLO***");
		System.out.println("***DAMMI IL NOME***");
		nome [i]=In.next();
		System.out.println("***DAMMI IL COGNOME***");
		cognome [i]=In.next();
		System.out.println("***DAMMI IL RUOLO***");
		ruolo [i]=In.next();
		if (ruolo[i].equals("portiere")||ruolo[i].equals("difensore")||ruolo[i].equals("centrocampista")||ruolo[i].equals("attaccante")){
			ruolo[i]=ruolo[i];
		}
		else{
			System.out.println("Hai inserito dei valori sbagliati, esco!");
		
			break;
		}
		System.out.println("***DAMMI IL NUMERO DI MAGLIA***");
		numero[i]=In.nextInt();
		System.out.println("***DAMMI IL VALORE DI MERCATO***");
		valore [i]=In.nextInt();
		System.out.println("Il Giocatore inserito è: "+nome[i]+", "+cognome[i]+", "+ruolo[i]+", "+numero[i]+", "+valore[i]);
		}
	System.out.println("**************************************");
	}
 	
	public void StampaRosa (){
		System.out.println("**************************************");
		System.out.println("La tua Squadra è: ");
		for (int j=0;j<lunghezzarosa;j++){
			System.out.println(nome[j]+", "+cognome[j]+", "+ruolo[j]+", "+numero[j]+", "+valore[j]);
		}
		System.out.println("**************************************");
	}
	
	public void Modulo (){
		System.out.println("**************************************");
		System.out.println("Scegliamo il modulo con cui giocare stasera");
		System.out.println("***RICORDATI DI INSERIRE IL COGNOME***");
		System.out.println("**************************************");
		System.out.println("Quanti portieri schieriamo?");
		p=In.nextInt();
		System.out.println("Quanti difensori schieriamo?");
		d=In.nextInt();
		System.out.println("Quanti centrocampisti schieriamo?");
		c=In.nextInt();
		System.out.println("Quanti attaccanti schieriamo?");
		a=In.nextInt();
		System.out.println("Il modulo selezionato è: "+p+"-"+d+"-"+c+"-"+a);
		/*if(a+c+d!=10){
			System.out.println("Non puoi entrare in campo con una squadra che non sia di 11 giocatori");
		}*/
	}
	public void GiocatoriSchierati (){
		String portiere []=new String [p];
		String difensori []=new String [d];
		String centrocampisti []=new String [c];
		String attaccanti []=new String [a];
		System.out.println("Dimmi il portiere");
		
		for (int i=0;i<p;i++){
			portiere[i]=In.next();
		for (int j=0;j<lunghezzarosa;j++){
		if (portiere[i].equals(cognome[j])){
			portiere[i]=portiere[i];
			System.out.println("Il portiere schierato è: "+portiere[i]);		
		}
		else
		{
			System.out.println(portiere[i]+" non è un giocatore della rosa!");
		}
		}
		System.out.println("**************************************");
		}
			
		
		System.out.println("**************************************");
		System.out.println("Dimmi il difensore");
		for (int j=0;j<lunghezzarosa;j++){
		for (int i=0;i<d;i++){
			difensori[i]=In.next();		
		if (difensori[i].equals(cognome[j])){
			difensori[i]=difensori[i];
			System.out.println("Il difensore schierato è: "+difensori[i]);		
		}
		else
		{
			System.out.println(difensori[i]+" non è un giocatore della rosa!");
		}
		}
		System.out.println("**************************************");
		}
		
		System.out.println("**************************************");
		System.out.println("Dimmi il centrocampista");
		for (int j=0;j<lunghezzarosa;j++){
		for (int i=0;i<c;i++){
			centrocampisti[i]=In.next();
		if (centrocampisti[i].equals(cognome[j])){
			centrocampisti[i]=centrocampisti[i];
			System.out.println("Il centrocampista schierato è: "+centrocampisti[i]);		
		}
		else
		{
			System.out.println(centrocampisti[i]+" non è un giocatore della rosa!");
		}
		}
		System.out.println("**************************************");
		}
		
		System.out.println("**************************************");
		System.out.println("Dimmi l'attaccante");
		for (int j=0;j<lunghezzarosa;j++){
		for (int i=0;i<a;i++){
			attaccanti[i]=In.next();
		if (attaccanti[i].equals(cognome[j])){
			attaccanti[i]=attaccanti[i];
			System.out.println("l'attaccante schierato è: "+attaccanti[i]);		
		}
		else
		{
			System.out.println(attaccanti[i]+" non è un giocatore della rosa!");
		}
		}
		System.out.println("**************************************");
		}
		
		System.out.println("La tua formazione per la partita è: ");
		for (int a=0;a<p;a++){
			System.out.println(portiere[a]);
		}
			for (int b=0;b<d;b++){
				System.out.println(difensori[b]);
			}
			for (int v=0;v<c;v++){
				System.out.println(centrocampisti[v]);
			}
			for (int g=0;g<a;g++){
				System.out.println(attaccanti[g]);
			}
}

		
		
		public static void main (String[] args){
		Formazione Calcio=new Formazione();
		Calcio.Rosa(); Calcio.StampaRosa();
		Calcio.Modulo(); Calcio.GiocatoriSchierati();
		
		}
