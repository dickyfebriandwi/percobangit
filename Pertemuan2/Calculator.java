/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 */
package Pertemuan2;

public class Calculator {
	private int memory;
	public void calculate(int i) {
		memory = i;
		memory = memory + 10;
		try {
			memory = memory / 0;
		}catch(ArithmeticException ae) {
			memory = memory + 10 ;
			memory = memory / 0 ;
		} finally {
			memory = memory *2;
			memory = memory/0;
		}
	}
	
	public int getMemory() {
		return memory;
	}
}
