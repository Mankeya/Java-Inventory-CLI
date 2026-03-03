import connection.ConnectionFactory;
import java.sql.Connection;

public class Test {
    public static void main(String[] args) {

        try (Connection conn = ConnectionFactory.getConnection()) {
            System.out.println("Conexão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}