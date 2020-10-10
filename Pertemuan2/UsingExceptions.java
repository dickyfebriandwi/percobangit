/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 * Program 2-6
 */
package Pertemuan2;

public class UsingExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwException();
		}catch (Exception exception) {
			System.err.println("Exception handled in main");
		}
		doesNotThrowException();
	}
	
	public static void throwException() throws Exception{
		try {
			System.out.println("Method throwException");
			throw new Exception();
		}catch (Exception exception) {
			System.err.println("Exception handled in method throwException");
			throw exception;
		}finally{
			System.err.println("Finnaly executed in throwException");
		}
	}
	
	public static void doesNotThrowException() {
		try {
			System.out.println("Method doesNotThrowException");
		}catch (Exception exception) {
			System.err.println(exception);
		}finally {
			System.err.println("Finnaly executed in doesNotThrowException");
		}
		System.out.println("End of method doesNotThrowException");
	}

}
