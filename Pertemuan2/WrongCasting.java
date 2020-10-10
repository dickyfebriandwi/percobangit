/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 */
package Pertemuan2;

import java.awt.Rectangle;

public class WrongCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object rectangle = new Rectangle(10,10);
		Object str = (Object) rectangle;
		System.out.println("String str : "+str);
	}

}
