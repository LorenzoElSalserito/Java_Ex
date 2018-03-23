import java.lang.*;


public class GiocoDellaVita {
private char [][] mappa;
private char [][] nuova_mappa;
private int n,m;
public GiocoDellaVita (int n, int m){
if (n<=0||m<=0) throw new IllegalArgumentException(); //segnala eccezione se n e m non sono validi
this.n=n;
this.m=m;
mappa= new char [n][m];
nuova_mappa= new char [n][m];
for (int i=0; i<n; i++) for (int j=0; j<m; j++) {
	mappa [i][j]= '-';
}
}

public void AggiungiOrganismo (int i,int j) {
if (i<0||i>=n||j<0||j>=m) throw new IllegalArgumentException();
mappa[i][j]='X';
}

private int vicini (int i, int j){
int cont=0;
if (i>0 && mappa[i-1][j]=='X') cont++;//NORD
if (i>0 && j<m-1 && mappa[i-1][j+1]=='X') cont++;//NORD-EST
if (j<m-1 && mappa[i][j+1]=='X') cont++;//EST
if (i<n-1 && j<m-1 && mappa[i+1][j+1]=='X') cont++;//SUD-EST
if (i<n-1 && mappa[i+1][j]=='X') cont++;//SUD
if (i<n-1 && j>0 && mappa [i+1][j-1]== 'X') cont++;//SUD-OVEST
if (j>0 && mappa [i][j-1]=='X') cont++;//OVEST
if (i>0 && j>0 && mappa[i-1][j-1]=='X') cont++;//NORD-OVEST
return cont;
}//contiamo i vicini che sono stati generati da aggiungi organismo

public void ProssimaGenerazione(){
	/*Un organismo sopravvive nella generazione successiva se ha due o tre vicini;
	 * Un organismo muore,"-",se ha pi� di tre o meno di due vicini;
	 * Un organismo nasce in una cella vuota se la cella ha tre vicini.*/
	for (int i=0; i<n; i++) for (int j=0; j<m; j++){
		int v=vicini(i,j);
		if (mappa[i][j]=='X')
			nuova_mappa[i][j]=(v==2||v==3)?'X':'-';
		else
			nuova_mappa [i][j]=(v==3)?'X':'-';
	}
	//adesso scambiamo le mappe ed usiamo una variabile temporanea
	char [][]temp=mappa; mappa=nuova_mappa; nuova_mappa=temp;
	}
	

public String toString(){
	String s="";
	for (int i=0; i<n; i++){
		for (int j=0; j<m; j++) s+=mappa[i][j];
		s+=""
				+ "";
		}
	return s;
	}


public static void main(String[]args){//adesso vediamo se siamo stati bravi
	GiocoDellaVita GDV= new GiocoDellaVita (8,8);
	System.out.println(GDV); GDV.AggiungiOrganismo(0,3); GDV.AggiungiOrganismo(0,1);
	GDV.AggiungiOrganismo(1,2); GDV.AggiungiOrganismo(1,1); GDV.AggiungiOrganismo(2,5);
	GDV.AggiungiOrganismo(2,4); GDV.AggiungiOrganismo(3,3); GDV.AggiungiOrganismo(3,5);
	System.out.println(GDV);
	GDV.ProssimaGenerazione();
	System.out.println(GDV);
	GDV.ProssimaGenerazione();
	System.out.println(GDV);
	GDV.ProssimaGenerazione();
	System.out.println(GDV);
}
}
