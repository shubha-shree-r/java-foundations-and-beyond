package enumeration;




public class DeclaringEnums {



    public enum Operations {

        PLUS {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        },
        MINUS {
            @Override
            public int apply(int a, int b) {
                return a - b;
            }



        };

        public abstract int apply(int a, int b);
    }

    public static void main(String[] args) {

         int plus = Operations.PLUS.apply(20,20);
        int minus = Operations.MINUS.apply(40,20);
        System.out.println(plus);
        System.out.println(minus);
    }
}
