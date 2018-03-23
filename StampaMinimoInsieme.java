import java.util.*;

public class StampaMinimoInsieme {
    public static Scanner In= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub77
		
		System.out.println("Lunghezza n");
		int l=In.nextInt();
		int numeri[]= new int[l];
		int i=0;
		int min4=0;
		
		for(i=0; i<l; i++){
			
		System.out.println("Inserisci numero l-esimo");
		numeri[i]=In.nextInt();
		}
		
		for(i=0; i<l; i++){
		    if(numeri[i]<min){
		    	min=numeri[i];
		    }
		
			}
			


System.out.println("il minimo è =" +min);

	}

}
