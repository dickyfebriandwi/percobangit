/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 */
package Pertemuan2;

import java.awt.Rectangle;

public class MyClass {
	public void doSomething() {
		try {
			Object object = new Rectangle(10,10);
			String string = (String) object;
		}catch (MyException me) {
			System.out.println("Catching exception"+me);
		}finally {
			System.out.println("Executing finally blocks");
		}
	}
}
