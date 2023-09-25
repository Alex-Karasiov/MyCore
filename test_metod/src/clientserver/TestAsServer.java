package clientserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestAsServer {
    public static void testServer() throws InterruptedException, IOException {
       int count = 0;

        ServerSocket serverSocket= new ServerSocket(3345);
        while (true) {
            Socket input = serverSocket.accept();
            System.out.println("client" + (count++));
            OutputStreamWriter writer = new OutputStreamWriter(input.getOutputStream());
            writer.write(
                    "HTTP/1.0 200 OK \n" +
                            "Content-type: text/html\n"+
                            "\n"+
                                    "<H1> ja </H1>");
            writer.flush();
            writer.close();
            input.close();



        }

        }

    }

