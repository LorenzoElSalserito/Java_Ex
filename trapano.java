import java.util.Scanner;

public class Trapano {
	public static Scanner In= new Scanner(System.in);
	int piano[][]=new int[4][4];
	int x;
	int y;
	String select;
	String selection;
	boolean acceso;

	
	public void Motore(){
		System.out.print("Vuoi accendere o spegnere il motore? Usa 'n' per spegnere e 's' per accendere");
		select = In.next();
		if (select.equals("n")){
			acceso = false;
		}
		else if (select.equals("s")) {
			acceso = true;
		}
	}
	
	public void Foro(){
		if (acceso == true){
			System.out.println("Dammi le coordinate dove vuoi trapanare, ricorda che ti stai muovendo su un piano 4x4");
			x=In.nextInt();
			y=In.nextInt();
			if (x>4 || y>4){
				System.out.println("Mi hai dato dei valori errati, sto forando l'ultima casella!");
				piano[4][4]=0;
				System.out.println("Alle coordinate selezionate, abbiamo fatto un foro! "+piano[4][4]);
			}
			else{
			piano [x][y]=0;
			System.out.println("Alle coordinate selezionate, abbiamo fatto un foro! "+piano[x][y]);
		    }
			Motore();
		}
		else{
			
			System.out.println("Il trapano è spento, accendilo per operare!");
			System.out.println("Vuoi accenderlo?");
			if (selection.equals("n")){
				System.out.println("OK! Alla prossima!");
			}
			else if (selection.equals("s")) {
				Motore();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Trapano t = new Trapano();
        t.Motore();t.Foro();
	}

}
