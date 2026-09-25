public class Cleaning extends AbstractState {

    public Cleaning(Bob bob) {
        super(bob);
    }

    @Override
    public void enter() {
        System.out.println("Agora preciso limpar esta bagunça...");
    }

    @Override
    public void execute() {
        bob.setMess(bob.getMess() - 4);

        System.out.println("Limpando...");
        System.out.println("Progresso da comida: " + bob.getCookingProgress());
        System.out.println("Bagunça: " + bob.getMess());

        if (bob.getMess() <= 0) {
            bob.setMess(0);

            System.out.println("Tudo limpo!");

            bob.setCookingProgress(0);

            bob.changeState(new Cooking(bob));
        }
    }

    @Override
    public void leave() {
    }
}
