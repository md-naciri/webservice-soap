package client.clientWS;

import client.proxy.BanqueService;
import client.proxy.BanqueWS;
import client.proxy.Compte;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.convert(500));
        Compte cp = proxy.getCompte(5);
        System.out.println("-------------------------");
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println("-------------------------");
        List<Compte> comptes = proxy.listComptes();
        comptes.forEach(c -> {
            System.out.println("-------------------------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println("-------------------------");
        });
    }
}
