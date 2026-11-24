public class Cursa extends Competitie {
    private double distantaKm;
    private double vitezaMedie;
    private String castigator;
    private int numarParticipanti;
    private double premiu;

    public Cursa() {
        super();
        this.distantaKm = 0;
        this.vitezaMedie = 1;
        this.castigator = "";
        this.numarParticipanti = 0;
        this.premiu = 0;
    }

    public Cursa(String nume, String locatie, int an, double distantaKm,
                 double vitezaMedie, String castigator, int numarParticipanti,
                 double premiu) {
        super(nume, locatie, an);
        this.distantaKm = distantaKm;
        this.vitezaMedie = vitezaMedie;
        this.castigator = castigator;
        this.numarParticipanti = numarParticipanti;
        this.premiu = premiu;
    }

    public Cursa(Cursa c) {
        super(c);
        this.distantaKm = c.distantaKm;
        this.vitezaMedie = c.vitezaMedie;
        this.castigator = c.castigator;
        this.numarParticipanti = c.numarParticipanti;
        this.premiu = c.premiu;
    }

    public double getDistantaKm() { return distantaKm; }
    public void setDistantaKm(double distantaKm) { this.distantaKm = distantaKm; }

    public double getVitezaMedie() { return vitezaMedie; }
    public void setVitezaMedie(double vitezaMedie) { this.vitezaMedie = vitezaMedie; }

    public String getCastigator() { return castigator; }
    public void setCastigator(String castigator) { this.castigator = castigator; }

    public int getNumarParticipanti() { return numarParticipanti; }
    public void setNumarParticipanti(int numarParticipanti) { this.numarParticipanti = numarParticipanti; }

    public double getPremiu() { return premiu; }
    public void setPremiu(double premiu) { this.premiu = premiu; }

    @Override
    public double calculeazaDurata() {
        return (distantaKm / vitezaMedie) * 60;
    }

    @Override
    public void afiseazaRezultat() {
        System.out.println("Cursa de " + distantaKm + " km, " + numarParticipanti
                + " participanti | Castigator: " + castigator
                + " | Durata: " + String.format("%.1f", calculeazaDurata()) + " min");
    }

    @Override
    public String toString() {
        return super.toString() + " | Cursa: " + distantaKm + " km, viteza medie "
                + vitezaMedie + " km/h, castigator: " + castigator
                + ", participanti: " + numarParticipanti + ", premiu: " + premiu;
    }
}
