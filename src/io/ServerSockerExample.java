package io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;

public class ServerSockerExample {
    public static void main(String[] args) {
        // use from try with resource to auto close all abjects implement auto closable
        try (
                /*
                 * for connect another app , listen to call
                 * every object of Server socket work in a port
                 * listen to call for accept
                 * if every app connect to it , accept method finished
                 * with finish accept an object of type Socket created
                 * usually use multi thread for server to handle several user
                 * */
                ServerSocket serverSocket = new ServerSocket(8080);
                // is a blocking method , wait another app to connect it
                Socket socket = serverSocket.accept();
                Scanner in = new Scanner(socket.getInputStream());
                Formatter out = new Formatter(socket.getOutputStream())) {
            String next;
            do {
                // read String from network
               // next = in.next();
                next = in.nextLine();
                String translate = persianTranslate(next);
                out.format(translate + "\n");
                out.flush();
            }while (!next.equals("exit"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String persianTranslate(String next) {
        return  " (can not translate now )"+next;
    }
}
