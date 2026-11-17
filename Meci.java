public class Meci extends Competitie {
    private String echipaGazda;
    private String echipaOaspete;
    private int scorGazda;
    private int scorOaspete;

    public Meci(String nume, String locatie, int an, String echipaGazda,
                String echipaOaspete, int scorGazda, int scorOaspete) {
        super(nume, locatie, an);
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.scorGazda = scorGazda;
        this.scorOaspete = scorOaspete;
    }

    @Override
    public double calculeazaDurata() {
        return 90;
    }

    @Override
    public void afiseazaRezultat() {
        String castigator;
        if (scorGazda > scorOaspete) castigator = echipaGazda;
        else if (scorGazda < scorOaspete) castigator = echipaOaspete;
        else castigator = "Egalitate";

        System.out.println(echipaGazda + " " + scorGazda + " - " + scorOaspete
                + " " + echipaOaspete + " | Castigator: " + castigator
                + " | Durata: " + calculeazaDurata() + " min");
    }
}
