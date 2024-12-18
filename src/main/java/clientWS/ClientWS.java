package clientWS;

import clientWS.proxy.BanqueService;
import clientWS.proxy.BanqueWS;
import clientWS.proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println("----------- Conversion -----------");
        System.out.println(proxy.convert(500));
        Compte cp = proxy.getCompte(5);
        System.out.println("----------- Compte N5 -----------");
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println("----------- Liste des comptes -----------");
        List<Compte> comptes = proxy.listComptes();
        comptes.forEach(c -> {
            System.out.println("-------------------------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println("-------------------------");
        });
    }
}
