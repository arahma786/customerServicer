package c322.labs.lab6.parta;

import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {

        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();

        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();

        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();

        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
