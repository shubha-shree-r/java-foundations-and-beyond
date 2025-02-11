package enumeration;

public class TestData {

    public enum TestUsers{
        ADMIN("admin@example.com", "password123"),
        REGULAR_USER("user@example.com", "password456"),
        GUEST("guest@example.com", "password789");

        private final String email;
        private final String passward;

        TestUsers(String email, String passward){
            this.email = email;
            this.passward = passward;
        }

        public String getEmail(){

            return  email;
        }

        public String getPassward(){

            return passward;
        }

    }


    public static void main(String[] args) {



        for (TestUsers user : TestUsers.values()) {
            System.out.println(user.name() + ":");
            System.out.println("email :" + user.getEmail());
            System.out.println("passward :" + user.getPassward());
            System.out.println(" ");
        }
    }
}
