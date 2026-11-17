public class Cursa extends Competitie {
    private double distantaKm;
    private double vitezaMedie;
    private String castigator;
    private int numarParticipanti;

    public Cursa(String nume, String locatie, int an, double distantaKm,
                 double vitezaMedie, String castigator, int numarParticipanti) {
        super(nume, locatie, an);
        this.distantaKm = distantaKm;
        this.vitezaMedie = vitezaMedie;
        this.castigator = castigator;
        this.numarParticipanti = numarParticipanti;
    }

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
}
