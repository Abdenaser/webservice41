package org.exemple;

import jakarta.xml.ws.Endpoint;
import org.exemple.ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("web service deployed on http://0.0.0.0:9191");
    }
}
