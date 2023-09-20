import BD.Conection;
import Crud.Crud_metod_all;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       new Conection().connection();

       new Crud_metod_all().Add_BD();
        new Crud_metod_all().Look_All_BD().stream().sorted();



    }


}