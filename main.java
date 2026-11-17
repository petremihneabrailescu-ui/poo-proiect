public class Main {
    public static void main(String[] args) {
        Competitie[] competitii = {
            new Meci("Liga 1", "Bucuresti", 2026, "Rapid", "Steaua", 2, 1),
            new Meci("Cupa Romaniei", "Cluj", 2026, "CFR", "Craiova", 0, 0),
            new Cursa("Maraton", "Brasov", 2026, 42.0, 14.5, "Ionescu", 300),
            new Cursa("Semimaraton", "Iasi", 2026, 21.0, 12.0, "Popa", 150)
        };

        for (Competitie c : competitii) {
            System.out.println(c);
            c.afiseazaRezultat();
            System.out.println();
        }
    }
}
