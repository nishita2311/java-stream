package dayFour;

import java.util.ArrayList;
import java.util.List;

public class TransactionTester {
	
	

	public static void main(String[] args) {
		Transaction t1=new Transaction("101",11000150,11000160,100000.00);
		Transaction t2=new Transaction("102",11000161,11000144,150000.00);
		Transaction t3=new Transaction("103",11000198,11000156,178999.00);
		
		List<Transaction> list1=new ArrayList<>();
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		
		TransactionService service=new TransactionService();
		service.printAllTransactions(list1,11000150);
		
	}
}
