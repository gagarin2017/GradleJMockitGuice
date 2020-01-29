package GradleJMockitGuice;

public class DatabaseTransactionLog implements TransactionLog {

	@Override
	public String about() {
		return "DatabaseTransactionLog";
	}

}
