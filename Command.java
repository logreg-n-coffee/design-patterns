interface Command {
    void execute();
}

class Receiver {
    void action() {
        System.out.println("Receiver action");
    }
}

class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}
