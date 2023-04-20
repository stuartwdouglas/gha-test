package io.github.stuartwdouglas.hacbstest;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.coollibrary.DoCoolStuff;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String... args) throws IOException {

        System.out.println("Saying Hello");
        System.out.println(DoCoolStuff.sayHello());
    }

}
