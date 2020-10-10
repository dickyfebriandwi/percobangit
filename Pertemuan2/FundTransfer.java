/**
 * @author Dicky Febrian Dwiputra (3411181097) Kelas D
 */
package Pertemuan2;

public class FundTransfer {
	public static boolean transferFunds (Account xAcc, Account yAcc, int amt) {
		int tempx=(int)xAcc.getCurrentBalance();
		if(tempx<amt) {
			System.out.println("Fund transfer is fail!!");
		}else {
			xAcc.debit(amt);
			yAcc.credit(amt);
			System.out.println("Completed fund transfer");
		}
		return true;
	}
}
