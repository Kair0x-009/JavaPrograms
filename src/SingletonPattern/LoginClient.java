package SingletonPattern;

public class LoginClient {

        private DatabaseConnection dbClient ;
        public LoginClient(){
            dbClient = DatabaseConnection.getInstance();
        }

        public void print(){
            System.out.println("Login successful");
        }
}
