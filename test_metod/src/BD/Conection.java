package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection implements IConection{


    private String username = "root";
    private String password = "Estimated strength of the password: 50";
    private String url = "jdbc:mysql://localhost:3306/ListBD?characterEncoding=utf8";
    private String DriverBD = "com.mysql.jdbc.Driver";
    public java.sql.Connection connection;

    public Conection() {
    }

    public Conection(String username, String password, String url, String driverBD, Connection connection) {
        this.username = username;
        this.password = password;
        this.url = url;
        DriverBD = driverBD;
        this.connection = connection;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverBD() {
        return DriverBD;
    }

    public void setDriverBD(String driverBD) {
        DriverBD = driverBD;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public String toString() {
        return "Conection{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", DriverBD='" + DriverBD + '\'' +
                ", connection=" + connection +
                '}';
    }

    @Override
    public Connection connection() throws ClassNotFoundException, SQLException {


        Class.forName(DriverBD);
        connection = DriverManager.getConnection(url, username, password);
        //System.out.println("Подключена БД");
        return connection;
    }

    @Override
    public boolean close() {
        try {
            connection.close();
            System.out.println("Работа с БД завершина");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
}
