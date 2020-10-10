package Pertemuan2;
//import java.awt.Rectangle;

/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 */


public class NullReferenceDua {
	//private static Rectangle rectangle;
	static Rectangles rectangle = new Rectangles();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(rectangle == null) {
			System.out.println("rectanlge variable doesn't refer to a Rectangle object");
		}else {
			int area = rectangle.area();
			System.out.println("Area: "+area);
		}
	}

}
