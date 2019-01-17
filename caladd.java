import java.util.Scanner;
public class caladd {
	public static void main(String args[]) {
		float a, b, res;
		char choice, ch;
		Scanner scan = new Scanner(System.in);
	
		do	{
			System.out.print("1. ADD two numbers\n");
			System.out.print("3. subtract two numbers\n");
			System.out.print("4. multiply two numbers\n");
			System.out.print("2. Exit\n");
			System.out.print("Enter our choice : ");
			choice = scan.next().charAt(0);
			switch(choice){
				case '1' : System.out.print("Enter TWO numbers : ");
					   a = scan.nextFloat();
					   b = scan.nextFloat();
					   res = a + b;
					   System.out.print("Result = " + res);
					   break;
				 case '4' : System.out.print("Enter TWO numbers : ");
                                           a = scan.nextFloat();
                                           b = scan.nextFloat();
                                           res = a * b;
                                           System.out.print("Result = " + res);
                                           break;

				case '3' : System.out.print("Enter TWO numbers : ");
                                           a = scan.nextFloat();
                                           b = scan.nextFloat();
                                           res = a - b;
                                           System.out.print("Result = " + res);
                                           break;

				case '2' : System.exit(0);
					   break;
				default : System.out.print("INVALID CHOICE!!!");
					  break;
			}
				System.out.print("\n------------------------\n");
		}while(choice != 2);

}
}
