public class Bob {
    private State state;

    private int cookingProgress;
    private int mess;

    public Bob() {
        cookingProgress = 0;
        mess = 0;

        state = new Cooking(this);
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

    public int getCookingProgress() {
        return cookingProgress;
    }

    public void setCookingProgress(int cookingProgress) {
        this.cookingProgress = Math.max(cookingProgress, 0);
    }

    public int getMess() {
        return mess;
    }

    public void setMess(int mess) {
        this.mess = Math.max(mess, 0);
    }

    public State getState() {
        return state;
    }
}
