package lambdaExpressions.preDefinedInterfaces;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterfaceExample {
    public static void main(String[] args) {
        Supplier<Date> supply = ()-> new Date();
        System.out.println(supply.get());
    }
}
