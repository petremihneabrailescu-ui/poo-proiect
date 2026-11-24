public class Meci extends Competitie {
    private String echipaGazda;
    private String echipaOaspete;
    private int scorGazda;
    private int scorOaspete;
    private String arbitru;
    private int spectatori;

    public Meci() {
        super();
        this.echipaGazda = "";
        this.echipaOaspete = "";
        this.scorGazda = 0;
        this.scorOaspete = 0;
        this.arbitru = "";
        this.spectatori = 0;
    }

    public Meci(String nume, String locatie, int an, String echipaGazda,
                String echipaOaspete, int scorGazda, int scorOaspete,
                String arbitru, int spectatori) {
        super(nume, locatie, an);
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.scorGazda = scorGazda;
        this.scorOaspete = scorOaspete;
        this.arbitru = arbitru;
        this.spectatori = spectatori;
    }

    public Meci(Meci m) {
        super(m);
        this.echipaGazda = m.echipaGazda;
        this.echipaOaspete = m.echipaOaspete;
        this.scorGazda = m.scorGazda;
        this.scorOaspete = m.scorOaspete;
        this.arbitru = m.arbitru;
        this.spectatori = m.spectatori;
    }

    public String getEchipaGazda() { return echipaGazda; }
    public void setEchipaGazda(String echipaGazda) { this.echipaGazda = echipaGazda; }

    public String getEchipaOaspete() { return echipaOaspete; }
    public void setEchipaOaspete(String echipaOaspete) { this.echipaOaspete = echipaOaspete; }

    public int getScorGazda() { return scorGazda; }
    public void setScorGazda(int scorGazda) { this.scorGazda = scorGazda; }

    public int getScorOaspete() { return scorOaspete; }
    public void setScorOaspete(int scorOaspete) { this.scorOaspete = scorOaspete; }

    public String getArbitru() { return arbitru; }
    public void setArbitru(String arbitru) { this.arbitru = arbitru; }

    public int getSpectatori() { return spectatori; }
    public void setSpectatori(int spectatori) { this.spectatori = spectatori; }

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

    @Override
    public String toString() {
        return super.toString() + " | Meci: " + echipaGazda + " " + scorGazda
                + " - " + scorOaspete + " " + echipaOaspete
                + ", arbitru: " + arbitru + ", spectatori: " + spectatori;
    }
}
