import java.util.Scanner;

public class Decimal {
    /*
     * 
     */
    public static void main(String[] args) {
        double n1, n2;
        String operation;
        Scanner scannerObject = new Scanner(System.in);
        /*
		*
	    *
		*/
        System.out.println("Enter first number");
        n1 = scannerObject. nextDouble();
         /*
		*
	    *
		*/
        System.out.println("Enter second number");
        n2 = scannerObject. nextDouble();
        /*
		*
	    *
		*/
        Scanner op = new Scanner(System.in);
        System.out.println("Enter your division");
        operation = op.next();
        /*
		*
		*
		*/
	
        switch (operation)  {
        case "+":
            System.out.println("Your result is " + (n1 + n2));
            break;

        case "-":
            System.out.println("Your result is " + (n1 - n2));
            break;

        case "/":
            System.out.println("Your result is " + (n1 / n2));
            break;

        case "*":
            System.out.println("Your result is " + (n1 * n2));
            break;
         /*
		 *
		 *
		 *
		 */
        

        }
    }
}
