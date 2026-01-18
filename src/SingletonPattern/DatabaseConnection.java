package SingletonPattern;

public class DatabaseConnection {
    private static DatabaseConnection instance = null ;
    private  DatabaseConnection(){};

    public static DatabaseConnection getInstance() {
        return instance = new DatabaseConnection();
    }

    private void executeQuery(String query){
        System.out.println("Database connection successfull.");
    }
}
