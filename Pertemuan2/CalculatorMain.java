/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 */
package Pertemuan2;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		try {
			calculator.calculate(5);
		}catch (Exception e) {
			System.out.println(calculator.getMemory());
		}
	}

}
