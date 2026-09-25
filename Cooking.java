public class Cooking extends AbstractState {

    public Cooking(Bob bob) {
        super(bob);
    }

    @Override
    public void enter() {
        System.out.println("Hora de preparar uma refeição!");
    }

    @Override
    public void execute() {
        bob.setCookingProgress(bob.getCookingProgress() + 3);
        bob.setMess(bob.getMess() + 2);

        System.out.println("Cozinhando...");
        System.out.println("Progresso da comida: " + bob.getCookingProgress());
        System.out.println("Bagunça: " + bob.getMess());

        if (bob.getCookingProgress() >= 12) {
            bob.setCookingProgress(12);

            System.out.println("A comida está pronta!");

            bob.changeState(new Cleaning(bob));
        }
    }

    @Override
    public void leave() {
    }
}
