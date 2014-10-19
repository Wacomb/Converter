
public class Conditions {

	public static void main(String[] args) {
		/*First condition---------------------------------------------------------
		 
		int i = 0;
		if(i < 0)
		{
			System.out.println("le nombre est négatif");
		}
		else
		{
			if (i == 0)
				System.out.println("le nombre est nul");
			else
				System.out.println("le nombre est positif");
		}
	}
*/
		/*Second condition (extended)---------------------------------------------
		 * 
		int i=0;
		if(i<0)
			System.out.println("Ce nombre est négatif !");
		
		else if(i>0)
			System.out.println("Ce nombre est positif !");
		
		else
			System.out.println("Ce nombre est nul !");
	*/
		
		/*Double condition--------------------------------------------------------
		 * 
		int i=64;
		if(i<100 && i>20)
			System.out.println("Ce nombre est bien dans l'intervalle !");
		else
			System.out.println("Ce nombre n'est pas dans l'intervalle !");
	*/
		
		int note = 7;
		switch(note) {
			case 0:
				System.out.println("Ouch !");
				break;
			case 10:
				System.out.println("Vous avez juste la moyenne.");
				break;
			case 20:
				System.out.println("Parfait !");
				break;
			default:
				System.out.println("Il faut d'avantage travailler !");
		
		}
	}
}
