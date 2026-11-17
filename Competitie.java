public abstract class Competitie implements Evaluabil {
    protected String nume;
    protected String locatie;
    protected int an;

    public Competitie(String nume, String locatie, int an) {
        this.nume = nume;
        this.locatie = locatie;
        this.an = an;
    }

    @Override
    public String toString() {
        return nume + " (" + locatie + ", " + an + ")";
    }
}
