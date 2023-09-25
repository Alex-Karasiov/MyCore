package clientserver;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestASClient {

    public static void testClient() throws InterruptedException, IOException {

        Socket socket = new Socket("localhost", 3345);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        out.println("ghjjjj");
        out.println("rr");
        out.println("eeeeeeeeee");
    }
}

