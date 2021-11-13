/* 
  Let's assume that in an application there is a need to handle payment done through several 
  modes like; cash, cheque, credit card etc. and based on the mode of the payment the functionality 
  may be different.
*/

interface PaymentInt {
  public void payment(double amout);
}

// Cash payment implementation of Payment interface
class CashPayment implements PaymentInt {
  // method implementatino according to cash payment functionality
  public void payment(double amount) {
    System.out.println("Cash payment of amount " + amount);
  }
}

// Cheque payment implementation of payment interface
class ChequePayment implements PaymentInt {
  public void payment(double amount) {
    System.out.println("Cheque payment of amount " + amount);
  }
}

// CreditCard payment implementation of payment interface
class CreditCardPayment implements PaymentInt {
  public void payment(double amount) {
    System.out.println("CreditCard payment of amount " + amount);
  }
}

public class InterfacePaymentDemo {
  public static void main(String[] args) {
    // Payment interface reference holding the CasehPayment obj
    PaymentInt paymentInt = new CashPayment();
    paymentInt.payment(134.67);

    // Payment interface reference holding the CreditCardPayment obj
    paymentInt = new CreditCardPayment();
    paymentInt.payment(2347.89);

    // Payment interface reference holding the ChequePayment obj
    paymentInt = new ChequePayment();
    paymentInt.payment(1567.78);

    /*
     * Output: 
     *    Cash Payment of amount 134.67 
     *    CreditCard Payment of amount 2347.89
     *    Cheque Payment of amount 1567.45
     */
  }
}