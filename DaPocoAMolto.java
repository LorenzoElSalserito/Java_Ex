import java.util.*;

public class DaPocoAMolto {
	public static Scanner In= new Scanner (System.in);

	public static void main(String[] args) {

    boolean a;
    int i=0;
    int num []= new int [5];
    
    System.out.println("Voglio 5 numeri");
    for (i=0; i<5; i++)
    {
    	num [i]=In.nextInt();
    }
    int j=1;
    while (num[j-1]<num[j])
    {
    	j=j+1;
    	if (j==5){
    		a=true;
    		System.out.println(a);
    		break;}
}
    if (j!=5){
    	a=false;
    	System.out.println(a);
	}
	}
}
