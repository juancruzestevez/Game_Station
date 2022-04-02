package webpage;

import com.sun.net.httpserver.HttpServer;
import webpage.handlers.HomeHandler;
import webpage.handlers.LogInHandler;
import webpage.handlers.MyHandler;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8443), 0);

        server.createContext("/main", new MyHandler()); // creates path
        server.createContext("/auth/login", new LogInHandler());
        server.createContext("/home", new HomeHandler());

        server.setExecutor(null); // creates a default executor
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GameStation");
        server.start();
    }
}