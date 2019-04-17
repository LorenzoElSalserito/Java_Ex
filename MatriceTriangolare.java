import java.util.Scanner;

public class MatriceTriangolare {
    public static Scanner In= new Scanner(System.in);
    int N;
    int cont;
    int Matrice [][] = new int [N][N];
    
	public MatriceTriangolare(int N) {
		Matrice[0][0]=1;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if(i==j) {
				Matrice[i][j]=1;
				}
				else {
				Matrice[i][j]=0;
				}
			}
		}
	}

	public void TriangoloSuperiore(){
		for (int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int k=i; k<N; k++) {
				if(i==j) {
				Matrice[i][j]=1;
				Matrice[i][k]=1;
				    }
				}
			}
			
		}
		System.out.println(Matrice);
	}
	
	public void TriangoloInferiore() {
		for (int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int k=N; k<i; k--) {
				if(i==j) {
				Matrice[i][j]=1;
				Matrice[i][k]=1;
				    }
				}
			}
			
		}
		System.out.println(Matrice);
	}


public static void main(String[] args) {
	MatriceTriangolare MT = new MatriceTriangolare(5);
	MT.TriangoloSuperiore();MT.TriangoloInferiore();
	
  }
}
