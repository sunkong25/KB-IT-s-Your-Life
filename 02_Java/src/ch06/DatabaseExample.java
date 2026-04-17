package ch06;

public class DatabaseExample {
    static void main(String[] args) {
        Database database = Database.getInstance();

        String connect = database.connect();
        System.out.println("데이터베이스: " + connect);
        database.close();
    }
}
