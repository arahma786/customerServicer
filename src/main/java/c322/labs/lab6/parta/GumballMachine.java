package c322.labs.lab6.parta;

import c322.labs.lab6.partb.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    State soldState;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    //State state;
    int count = 0;
    State winnerState;

    State state = soldOutState;

    String location;

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    public GumballMachine(int count) throws RemoteException{
        this.count = count;
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        this.location = location;
        this.count = count;
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
    public void refill(int count) throws RemoteException {
        this.count = count;
        state = noQuarterState;
    }
    public String getLocation() {
        return location;
    }
    public State getWinnerState() {
        return winnerState;
    }

}
