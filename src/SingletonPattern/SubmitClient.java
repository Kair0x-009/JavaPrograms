package SingletonPattern;

public class SubmitClient {
    private DatabaseConnection dbClient;

    public SubmitClient(){
        dbClient = DatabaseConnection.getInstance();
    }

    public void print(){
        System.out.println("Submission Successful");
    }
}
