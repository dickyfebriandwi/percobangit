/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 */
package Pertemuan2;

public class InternetBanking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account xAcc = new Account(1, 1000);
		Account yAcc = new Account(2, 1200);
		FundTransfer.transferFunds(xAcc, yAcc, 1400);
		System.out.println("xAcc's current balance "+ xAcc.getCurrentBalance());
		System.out.println("yAcc's current balance "+ yAcc.getCurrentBalance());
		System.out.println("Completed execution of main method");
	}

}
