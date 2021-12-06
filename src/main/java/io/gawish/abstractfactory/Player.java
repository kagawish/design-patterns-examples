package io.gawish.abstractfactory;

public class Player {
    public void travel() {
        Runner.environment.getTransport().travel();;
    }

    public void visit() {
        Runner.environment.getTransport().visit();
    }

    public void attack() {
        Runner.environment.getWeapon().attack();
    }
}
