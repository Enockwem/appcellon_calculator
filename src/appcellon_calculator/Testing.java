package appcellon_calculator;

public class Testing {

	public static void main(String[] args) {
		Testmethod mytests = new Testmethod();
		// TODO Auto-generated method stub
		System.out.printf("%s %3s\n","Step A",":Select operation.");
		System.out.printf("%10s\n", "1.Add");
		System.out.printf("%15s\n", "2.Subtract");
		System.out.printf("%15s\n", "3.Miltiply");
		System.out.printf("%13s\n", "4.Divide");
		//Scanner object
		java.util.Scanner scan = new java.util.Scanner(System.in);
			
		System.out.println("Enter your Choice here: ");
		int condition = scan.nextInt(); // Accepting user input
		if(condition == 1 || condition == 2 || condition == 3 || condition == 4) {
			
			System.out.println("Enter the first number: ");
			int number1 = scan.nextInt();
			System.out.println("Enter the second number: ");
			int number2 = scan.nextInt();
			
			switch(condition){
			case 1:
				int x =mytests.Add(number1,number2);
				System.out.println(x);
				break;
			case 2:
				int sub = mytests.Subtract(number1,number2);
				System.out.println(sub);
				break;
			case 3:
				double mult = mytests.Multiply(number1, number2);
				System.out.println(mult);
				break;
			case 4:
				double div = mytests.Divide(number1, number2);
				System.out.println(div);
				break;
			default:
				System.out.println("A wrong choice was made");
				break;
			}
		}else
		{
			System.out.println("That was a wrong choice");			
		}
		
		scan.close();
	}
	
	
}
