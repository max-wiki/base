package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Formatter;
import java.util.Scanner;

public class SocketExample {
    // Socket is client , first run class server socket
    public static void main(String[] args) {
        // writeToSocket();
        // readFromSocket();
        try (Socket socket = new Socket("127.0.0.1", 8080);
             Scanner socketIn = new Scanner(socket.getInputStream());
             Formatter socketOut = new Formatter(socket.getOutputStream());
             Scanner systemIn = new Scanner(System.in)
        ) {
            String next;
            do {
                // read token before space , not read whole text
               // next = systemIn.next();
                next = systemIn.nextLine();
                socketOut.format(next + "\n");
              //  socketOut.format(next + "\n");
                socketOut.flush();
               // String received = socketIn.next();
                String received = socketIn.nextLine();
                System.out.println("received: " + received);
                System.out.flush();
            } while (!next.equals("exit"));

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void readFromSocket() {
        try {
            Socket socket = new Socket("127.0.0.1", 8080);
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            while (true) {
                String next = scanner.next();
                if (next.contains("exit"))
                    break;
                System.out.println("server: " + next);
                // system.out also has buffer and has flush method to not buffer data out put
                System.out.flush();
            }
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeToSocket() {
        try {
            // connect to a ip and a app port
            Socket socket = new Socket("127.0.0.1", 8080);
            // get output stream for send data
            OutputStream outputStream = socket.getOutputStream();
            // create new instance of formatter , for write data to output stream
            Formatter formatter = new Formatter(outputStream);
            formatter.format("hi!\n");
            // in io when flush , not keep data and send to stream ,
            // some output can buffer data for keep data and flush method not keep , send data
            formatter.flush();
            formatter.format("are you okay?\n");
            formatter.flush();
            formatter.format("exit");
            formatter.flush();
            socket.close();
            System.out.println("finished");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
