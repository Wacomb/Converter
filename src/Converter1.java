import java.util.Scanner;
public class Converter1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double toConvert, converted=0;
		char reponse=' ', mode=' ';
		
		System.out.println("CELSUIS AND FARENHEIT DEGREES CONVERTER");
		System.out.println("---------------------------------------");
		
		do{
			
			do{
				mode=' ';
				System.out.println("Choose the mode : ");
				System.out.println("1 - Celsuis - Fahrenheit Converter");
				System.out.println("2 - Fahrenheit - Celsius Converter");
				mode = sc.nextLine().charAt(0);
				
				if(mode !='1' && mode != '2');
					System.out.println("Unknow mode, please choose again.");
					
			}while(mode !='1' && mode !='2');
			
				System.out.println("Temperature to convert :");
				toConvert = sc.nextDouble();
				sc.nextLine();
			
				if(mode =='1'){
					converted = ((9.0/5.0)*toConvert)+32.0;
					System.out.print(toConvert+ " C° equals to : ");
					System.out.println(converted + " °F.");
				}
				
				else{
					converted=((toConvert - 32) * 5) / 9;
					System.out.print(toConvert + " °F equals to : ");
					System.out.println(converted + " C°.");
				}
				
				do{
					System.out.println("Would you like to convert another temperature ?(O/N");
					reponse = sc.nextLine().charAt(0);	
				}while(reponse !='O' && reponse !='N');
		
		}while(reponse == 'O');
			
			System.out.println("Au revoir !");
			
		 
	
	
	
	
	}

}
