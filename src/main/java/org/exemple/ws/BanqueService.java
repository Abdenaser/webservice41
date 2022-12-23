package org.exemple.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversionEuroToDH")
    private double conversion(@WebParam(name = "montant") double montant){
        return montant * 0.9;
    }
    @WebMethod(operationName = "getComptes")
    public compte getCompte(@WebParam(name = "code")int code){
        return new compte(code, Math.random() * 9000, new Date());
    }
    @WebMethod(operationName = "listcomptes")
    public List<compte> listcompte(){
        List<compte> comptes = new ArrayList<compte>();
        comptes.add(new compte(1, Math.random() * 9000, new Date()));
        comptes.add(new compte(2, Math.random() * 9000, new Date()));
        comptes.add(new compte(3, Math.random() * 9000, new Date()));
        return comptes;
    }
}
