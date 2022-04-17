import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class people {
    public static Connection conn;
    public static Statement stat;
    public static void connectToDB() throws ClassNotFoundException, SQLException
    {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:TEST1.db");

        System.out.println("База Подключена!");

    }

    public static void createDB() throws ClassNotFoundException, SQLException
    {
        stat = conn.createStatement();


        stat.execute("CREATE TABLE if not exists products ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text, 'cost' DOUBLE, 'onStock' INT, 'sold' INT);");

        System.out.println("Таблица создана");
    }
}
