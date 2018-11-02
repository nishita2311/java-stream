package dayFour;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionService {
	
	public void printAllTransactions(List<Transaction> transactions,long accountNumber)
	{
		List<Transaction> list=transactions.stream()
								.filter(x->x.getSenderAccountNumber()==accountNumber)
								.collect(Collectors.toList());
				System.out.println(list);
	}

}


