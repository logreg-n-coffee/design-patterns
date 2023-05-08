interface Mediator {
    void send(String message, Colleague colleague);
}

class ConcreteMediator implements Mediator {
    private Colleague colleague1;
    private Colleague colleague2;

    void setColleague1(Colleague colleague) {
        this.colleague1 = colleague;
    }

    void setColleague2(Colleague colleague) {
        this.colleague2 = colleague;
    }

    public void send(String message, Colleague originator) {
        if (originator == colleague1) {
            colleague2.receive(message);
        } else {
            colleague1.receive(message);
        }
    }
}

abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void send(String message);

    abstract void receive(String message);
}
