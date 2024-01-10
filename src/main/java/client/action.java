package client;
import org.example.service.*;

import java.util.List;

public class action {

    public static void main(String[] args) {
     /*   BanqueWS banqueWS = new BanqueWS();

        // Get the port for BanqueService
        BanqueService banqueService = banqueWS.getBanqueServicePort();

        // Use methods provided by BanqueService
        Compte compte = new Compte();
        compte.setCode(1);
        compte.setSolde(123);
        compte.setPass("pass");
        float amount = 123;
        int accountId = 1;

        // Example usage of methods from Banque_Service
        int resultVerser = banqueService.verser(compte, amount);
        System.out.println("Verser result: " + resultVerser + compte.getSolde());

        int resultTransfert = banqueService.transfert(compte, amount);
        System.out.println("Transfert result: " + resultTransfert);

        int resultRetirer = banqueService.retirer(compte, amount);
        System.out.println("Retirer result: " + resultRetirer);

        List<Compte> comptes = banqueService.getComptes();
        System.out.println("Comptes: " + comptes);

        Compte compteDetails = banqueService.getCompte(accountId);
        System.out.println("Compte details: " + compteDetails);

        boolean exists = banqueService.exist(compte);
        System.out.println("Account exists: " + exists);

        int historiqueResult = banqueService.setHistorique(accountId, 1);
        System.out.println("Historique result: " + historiqueResult);

        List<Historique> historiqueList = banqueService.getHist(accountId);
        System.out.println("Historique list: " + historiqueList);

        String acte = banqueService.getActe(1);
        System.out.println("Acte: " + acte);*/

        BanqueWS service = new BanqueWS();

        testRetirer(service);
        testVerser(service);
        testTransfert(service);
        testGetComptes(service);
        testGetCompte(service);
        testSaveCompte(service);
        testExist(service);
        testSetHistorique(service);

        testGetActe(service);
    }

    private static void testRetirer(BanqueWS service) {
        Compte c = new Compte();
        c.setCode(1); // Set your account code here
        float montant = 100; // Set the amount to withdraw
        int result = service.getBanqueServicePort().retirer(c, montant);
        System.out.println("Retirer Result: " + result);
    }

    private static void testVerser(BanqueWS service) {
        Compte c = new Compte();
        c.setCode(1); // Set your account code here
        float montant = 100; // Set the amount to deposit
        int result = service.getBanqueServicePort().verser(c, montant);
        System.out.println("Verser Result: " + result);
    }

    private static void testTransfert(BanqueWS service) {
        Compte c = new Compte();
        c.setCode(1); // Set your account code here
        float montant = 100; // Set the amount to transfer
        int result = service.getBanqueServicePort().transfert(c, montant);
        System.out.println("Transfert Result: " + result);
    }

    private static void testGetComptes(BanqueWS service) {
        List<Compte> comptes = service.getBanqueServicePort().getComptes();
        System.out.println("List of Accounts:");
        for (Compte c : comptes) {
            System.out.println("Account Code: " + c.getCode() + ", Solde: " + c.getSolde() + ", Pass: " + c.getPass());
        }
    }

    private static void testGetCompte(BanqueWS service) {
        int codeCin = 1; // Set the account code to retrieve
        Compte c = service.getBanqueServicePort().getCompte(codeCin);
        System.out.println("Account Details for Code " + codeCin + ": " + c);
    }

    private static void testSaveCompte(BanqueWS service) {
        Compte c = new Compte();
        c.setCode(4); // Set account code
        c.setPass("password"); // Set account password
        Compte savedAccount = service.getBanqueServicePort().saveCompte(c);
        System.out.println("Saved Account: " + savedAccount);
    }

    private static void testExist(BanqueWS service) {
        Compte c = new Compte();
        c.setCode(1); // Set account code
        c.setPass("password"); // Set account password
        boolean exists = service.getBanqueServicePort().exist(c);
        System.out.println("Account Exists: " + exists);
    }

    private static void testSetHistorique(BanqueWS service) {
        int codeCin = 1; // Set account code
        int idActe = 123; // Set action ID
        int result = service.getBanqueServicePort().setHistorique(codeCin, idActe);
        System.out.println("Set Historique Result: " + result);
    }


    private static void testGetActe(BanqueWS service) {
        int idcode = 1; // Set action ID
        String action = service.getBanqueServicePort().getActe(idcode);
        System.out.println("Action for ID " + idcode + ": " + action);
    }

}
