import BD.Conection;

import java.io.IOException;
import java.sql.SQLException;

import static clientserver.TestASClient.testClient;
import static clientserver.TestAsServer.testServer;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InterruptedException, RuntimeException, IOException {

        new Conection().connection();

        // new Crud_metod_all().Add_BD();
        // new Crud_metod_all().Look_All_BD().stream().sorted();


        testServer();

        //testClient();




    }


}