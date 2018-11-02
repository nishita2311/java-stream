package dayFour;

public class Transaction {
	String transactionid;
	long senderAccountNumber;
	long receiverAccountNumber;
	double transactionAmount;
	 
	public Transaction(String id,long sid,long rid,double amt)
	{
		transactionid=id;
		senderAccountNumber=sid;
		receiverAccountNumber=rid;
		transactionAmount=amt;
		
	}
	@Override
	public String toString() {
	return "Transaction [transactionid=" + transactionid + ", senderAccountNumber=" + senderAccountNumber
				+ ", receiverAccountNumber=" + receiverAccountNumber + ", transactionAmount=" + transactionAmount + "]";
	}
	public String getTransactionid() {
		return transactionid;
	}
	public long getSenderAccountNumber() {
		return senderAccountNumber;
	}
	public long getReceiverAccountNumber() {
		return receiverAccountNumber;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	
}
