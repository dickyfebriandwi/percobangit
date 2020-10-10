/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 */
package Pertemuan2;
import java.io.IOException;

public class Method {
	private static final Exception IOException = null;

	public void doSomething() throws ClassCastException{
		try {
			Object object = new Rectangles();
			String string = (String) object;
		} catch  (RuntimeException re) {
			System.out.println("RuntimeException");
		}
	}
}
