package org.exemple;

import proxy.BanqueService;
import proxy.BanqueWS;

public class Clientws {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.listcomptes());
    }
}
