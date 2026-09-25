public class Working extends AbstractState {

    public Working(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Hora de ir para o trabalho!");
    }

    @Override
    public void execute() {
        juca.setHunger(juca.getHunger() + 2);
        juca.setFatigue(juca.getFatigue() + 5);

        System.out.println("Trabalhando...");
        System.out.println("Fome: " + juca.getHunger());
        System.out.println("Cansaço: " + juca.getFatigue());

        if (juca.getFatigue() > 50) {
            juca.changeState(new Sleeping(juca));
        } else if (juca.getHunger() > 10) {
            juca.changeState(new Eating(juca));
        }
    }

    @Override
    public void leave() {
    }
}
