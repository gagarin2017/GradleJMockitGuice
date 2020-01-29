package GradleJMockitGuice;

public class PaypalCreditCardProcessor implements CreditCardProcessor {

	@Override
	public String about() {
		return "PaypalCreditCardProcessor";
	}

}
