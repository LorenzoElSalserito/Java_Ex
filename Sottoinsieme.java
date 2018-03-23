import java.util.*;

public class Sottoinsieme {
	public static Scanner In= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ins1 []= new int [6];
		int ins2 []= new int [3];
		int i=0;
		int j=0;
		
		System.out.println("Dammi il primo insieme di numeri");
		for (i=0; i<6; i++)
			ins1 [i]=In.nextInt();
		
		System.out.println("Dammi il secondo insieme di numeri");
		for (j=0; j<3; j++)
			ins2 [j]=In.nextInt();
		
		int x=0;
		int y=0;
		int n=0;
		
		for (x=0; x<6; x++){
			for (y=0; y<3; y++){
				if (ins1 [x]==ins2 [y])
					n=n+1;
			}
		}
		if (n>=3)
			System.out.println("insieme 2 è contenuto in insieme 1" );
		else
			System.out.println("Gli insiemi sono separati" );
				
	}

}
