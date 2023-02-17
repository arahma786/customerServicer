package c322.labs.lab6.parta;

public class GumballMachine {
    State soldState;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State state;
    int count = 0;

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    public GumballMachine(int count) {
        this.count = count;
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }


    public int getCount() {
        return count;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    public void insertQuarter() {
        state.insertQuarter();
    }

    public State getSoldState() {
        return soldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }


}
