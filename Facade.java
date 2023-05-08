class SubsystemA {
    void operationA() {
        System.out.println("Operation A");
    }
}

class SubsystemB {
    void operationB() {
        System.out.println("Operation B");
    }
}

class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade(SubsystemA subsystemA, SubsystemB subsystemB) {
        this.subsystemA = subsystemA;
        this.subsystemB = subsystemB;
    }

    void performOperation() {
        subsystemA.operationA();
        subsystemB.operationB();
    }
}
