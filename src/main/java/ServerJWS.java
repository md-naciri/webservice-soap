import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

import java.util.function.DoubleToIntFunction;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9191/", new BanqueService());
        System.out.println("Server started at port 9191");
    }
}
