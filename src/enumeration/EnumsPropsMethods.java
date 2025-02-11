package enumeration;

public class EnumsPropsMethods {

    public enum PaymentMethods{
        CREDIT_CARD,
        DEBIT_CARD,
        PAYPAL,
        BANK_TRANSFER
    }

    public static void main(String[] args) {
        int ordinal = PaymentMethods.PAYPAL.ordinal();
        System.out.println(ordinal);

        PaymentMethods paymentMethods = PaymentMethods.PAYPAL;
        System.out.println(PaymentMethods.valueOf("DEBIT_CARD"));
        System.out.println(PaymentMethods.BANK_TRANSFER.name());
        System.out.println(paymentMethods);
        System.out.println("-----------------");
        PaymentMethods[] paymentMethods1 = PaymentMethods.values();
        for(PaymentMethods method : paymentMethods1){

            System.out.println(method);
        }
    }
}
