public class Juca {
    private State state;

    private int hunger;
    private int fatigue;

    public Juca() {
        hunger = 0;
        fatigue = 0;

        state = new Working(this);
        state.enter();
    }

    public void update() {
        state.execute();
    }

    public void changeState(State newState) {
        state.leave();
        state = newState;
        state.enter();
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = Math.max(hunger, 0);
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = Math.max(fatigue, 0);
    }

    public State getState() {
        return state;
    }
}
