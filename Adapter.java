interface OldInterface {
    void oldMethod();
}

class OldClass implements OldInterface {
    public void oldMethod() {
        System.out.println("Old method");
    }
}

interface NewInterface {
    void newMethod();
}

class Adapter implements NewInterface {
    private OldInterface oldObject;

    public Adapter(OldInterface oldObject) {
        this.oldObject = oldObject;
    }

    public void newMethod() {
        oldObject.oldMethod();
    }
}
