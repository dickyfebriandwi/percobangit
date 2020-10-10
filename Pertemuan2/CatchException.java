/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 */
package Pertemuan2;

public class CatchException {
	public void doSomething() {
		try {
			int i = 1/0;
		}catch (Throwable throwable) {
			System.out.println("catching java.lang.Throwable exception");
		}
	}
}
