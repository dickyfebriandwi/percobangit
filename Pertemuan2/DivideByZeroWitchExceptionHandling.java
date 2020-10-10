package Pertemuan2;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Dicky Febrian Dwiputra
 *
 * 3411181097
 */
public class DivideByZeroWitchExceptionHandling {
	
	public static int pembagian (int bil, int pbg) throws ArithmeticException {
		return bil / pbg;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop=true;
		do {
			try {
				System.out.println("Please enter an integer numerator : ");
				int numerator = scanner.nextInt();
				System.out.println("Please enter an integer denomerator : ");
				int denominator = scanner.nextInt();
				
				int result = pembagian(numerator,denominator);
				System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
				continueLoop=false;
				
			}catch(InputMismatchException e) {
				System.err.printf("%nException: %s%n", e);
				scanner.nextLine();
				System.out.println("You must enter integers. Please try again. %n%n");
			}catch(ArithmeticException arithmeticException) {
				System.out.printf("%nException: %s%n", arithmeticException);
				System.out.println("Zero is an invaid denominator. Please try again.%n%n");
			}
			
		}while(continueLoop);
	}

}
