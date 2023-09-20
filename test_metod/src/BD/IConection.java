package BD;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConection {
    Connection connection() throws ClassNotFoundException, SQLException;
    boolean close();
}
