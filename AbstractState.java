public abstract class AbstractState implements State {
    protected Juca juca;
    protected Bob bob;

    public AbstractState(Juca juca) {
        this.juca = juca;
    }

    public AbstractState(Bob bob) {
        this.bob = bob;
    }

    @Override
    public void enter() {
    }

    @Override
    public void leave() {
    }
}
