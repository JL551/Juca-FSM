public class Main {
    public static void main(String[] args) {
        Juca juca = new Juca();
        Bob bob = new Bob();

        for (int tick = 1; tick <= 30; tick++) {
            System.out.println();
            System.out.println("========== TICK " + tick + " ==========");

            System.out.println();
            System.out.println("----- JUCA -----");
            juca.update();

            System.out.println();
            System.out.println("----- BOB -----");
            bob.update();
        }
    }
}
