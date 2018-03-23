
public class Tappo {
	public static Scanner In= new Scanner (System.in);
	public static void main(String[] args) {

		int x = 1;
		int i=0;
		int j=0;
	
		while (x>0)
		{
			System.out.println ("Au mbare! maddari na sequenza i nummeri e appoi ci abbii -1 pi fimmalla");
			int k= In.nextInt ();
			if (k==-1)
			{
				System.out.println ("apposto beddu ni putemu iri ara casa");
				break;
			}
			if (k>0 & k<j)
			{
				i=k;
			}
			if (k>0 & k>i)
			{
				j=k;
			}
			System.out.println("chiddu chiu autu è "+j);
			System.out.println("chiddu chiu vasciu è "+i);
			float media=(j+i)/2;
			System.out.println("indo menzu ci sta chistu "+media);
			}
		}
}
