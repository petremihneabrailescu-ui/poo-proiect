public class Main {
    public static void main(String[] args) {
        // Punctul 1: polimorfism
        Competitie[] competitii = {
            new Meci("Liga 1", "Bucuresti", 2026, "Rapid", "Steaua", 2, 1, "Popescu", 12000),
            new Meci("Cupa Romaniei", "Cluj", 2026, "CFR", "Craiova", 0, 0, "Marin", 8000),
            new Cursa("Maraton", "Brasov", 2026, 42.0, 14.5, "Ionescu", 300, 5000),
            new Cursa("Semimaraton", "Iasi", 2026, 21.0, 12.0, "Popa", 150, 2000)
        };

        for (Competitie c : competitii) {
            System.out.println(c);
            c.afiseazaRezultat();
            System.out.println();
        }

        Meci m = new Meci();
        m.setNume("Supercupa");
        m.setLocatie("Iasi");
        m.setAn(2026);
        m.setEchipaGazda("Dinamo");
        m.setEchipaOaspete("Sepsi");
        m.setScorGazda(1);
        m.setScorOaspete(1);
        m.setArbitru("Ionescu");
        m.setSpectatori(5000);
        System.out.println(m);

        Cursa c1 = new Cursa("Maraton", "Brasov", 2026, 42.0, 14.5, "Ionescu", 300, 5000);
        Cursa c2 = new Cursa(c1);
        c2.setNume("Maraton copie");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Distanta: " + c1.getDistantaKm() + " km");
    }
}
