package nl.hu.dp;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        ReizigerDAO rd = new ReizigerDAOOracleImpl();
        OVChipkaartDAO od = new OVChipkaartDAOImpl();

        /*
         * Aanmaken van de domein objecten
         */
        Reiziger reiziger = new Reiziger();
        reiziger.setVoorletters("SBS");
        reiziger.setAchternaam("Bogaarts");
        rd.save(reiziger);

        /*
         * Aanmaken van de domein objecten
         */
        OVChipkaart kaart = new OVChipkaart();
        kaart.setKaartopdruk("mijn eerste kaart");
        kaart.setReiziger(reiziger);
        od.save(kaart);

        System.out.println(kaart.getReiziger());

        
    }
}
