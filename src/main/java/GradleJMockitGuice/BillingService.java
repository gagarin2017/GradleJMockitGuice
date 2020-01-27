package GradleJMockitGuice;

import com.google.inject.Inject;

class BillingService {
	private final CreditCardProcessor processor;
	private final TransactionLog transactionLog;

	@Inject
	BillingService(CreditCardProcessor processor, TransactionLog transactionLog) {
		this.processor = processor;
		this.transactionLog = transactionLog;
	}
	
	public String about() {
		return "Billing Service use Credit Card Process [" + processor + "], and Transaction Log: [" + transactionLog +"]";
	}

}
