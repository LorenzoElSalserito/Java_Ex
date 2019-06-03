import java.util.Scanner;

public class Ippodromo {
	public static Scanner In= new Scanner(System.in);
	boolean giochiamo=true;
	int vincitaPiazzato=10;
	int gioca=1;
	int vincitaVincente=50;
	int portafoglio=100;
	int puntata=5;
	String cavalli []= {"Pippo","Puccetta","Gennaro","Fabiolo","Cuccolo","Sbrodolo","Maria","Giovanni","Mariuolo","Lalla"};
	double velocità []=new double [10];
	int sceltaCavallo;
	double podio[]=new double [3];
	String podioNomi[]= new String [3];
	
	public void giocatore(){
		System.out.println("Vuoi puntare? s/n");
		String giocata=In.next();
		if(giocata.equals("s")){
			portafoglio=portafoglio-puntata;
		}
		System.out.println("Scegli il cavallo sul quale puntare");
		System.out.println("Usa un numero da 0 a 9");
		System.out.println("I cavalli sono: ");
		for (int j=0; j<10; j++){
			System.out.println(cavalli[j]);
		}
		sceltaCavallo=In.nextInt();
	}
	
	public void cavallo(){
		for (int i=0; i<10; i++){
			velocità[i]=Math.random();
		}
		for (int j=0; j<10; j++){
				System.out.println(cavalli[j]+" "+velocità[j]);
		}
	}
	
	public void podio(){
		podio[0]=velocità[0];
		for (int k=0; k<10; k++){
			for(int q=0; q<10; q++){
			if(velocità[k]>velocità[q] && podio[0]<velocità[k]){
				podio[0]=velocità[k];
				podioNomi[0]=cavalli[k];
			}
		}
	}
		for (int a=0; a<10; a++){
			for(int s=0; s<10; s++){
			if(velocità[a]<podio[0] && velocità[a]>velocità[s]){
				podio[1]=velocità[a];
				podioNomi[1]=cavalli[a];
			}
		}
	}
		for (int w=0; w<10; w++){
			for(int e=0; e<10; e++){
			if(velocità [w]<podio[1] && velocità[w]>velocità[e]){
				podio[2]=velocità[w];
				podioNomi[2]=cavalli[w];
	     		}
			}
		}
	}
	
	public void vittoria(){
			System.out.println("i cavalli vincenti correvano a "+podio[0]+" Km/h"+podio[1]+" Km/h"+podio[2]+" Km/h"+" e sono: "+podioNomi[0]+podioNomi[1]+podioNomi[2]);
			System.out.println("il cavallo vincente è "+podioNomi[0]);
			if (cavalli[sceltaCavallo].equals(podioNomi[0])){
					System.out.println("Hai Vinto! Complimenti!");
					portafoglio=portafoglio+vincitaVincente;
			}
			if (cavalli[sceltaCavallo].equals(podioNomi[1]) || cavalli[sceltaCavallo].equals(podioNomi[2])){
				System.out.println("Sei sul podio! Complimenti!");
				portafoglio=portafoglio+vincitaPiazzato;
		}
			System.out.println("Hai ancora "+portafoglio+" euro");
	       if (portafoglio==0){
	    	   System.out.println("Hai finito il credito");
	    	   giochiamo=false;
	       }
	    	   
	       }
	public void fammigiocare(){
		System.out.println("Vuoi giocare ancora? inserisci 0 (NO) o 1 (SI)");
		gioca=In.nextInt();
		if (gioca<0 || gioca>1){
			System.out.println("Non barare! Dammi 0 per non giocare, 1 per continuare a giocare");
			gioca=In.nextInt();
		   }
		if (gioca==1){
		giochiamo=true;
		cavallo();
		giocatore();
		podio();
		vittoria();
		fammigiocare();
	    }
		else{
			giochiamo=false;
			System.out.println("Arrivederci!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ippodromo Ip = new Ippodromo();
        Ip.cavallo(); Ip.giocatore(); Ip.podio();
	    Ip.vittoria(); Ip.fammigiocare();
        }
}
