package Pertemuan2;
import java.util.Scanner;

/**
 * @author Dicky Febrian Dwiputra
 *
 * 3411181097

 */
public class DivideByZeroNoExceptionHandling {
	
	public static int pembagian (int bil, int pbg) {
		return bil / pbg;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukan nilai Pembilang: ");
		int numerator = scanner.nextInt();
		System.out.println("Masukan nilai Penyebut (Pembagi) : ");
		int denominator = scanner.nextInt();
		
		float result = pembagian (numerator, denominator);
		System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
		
		
	}

}
