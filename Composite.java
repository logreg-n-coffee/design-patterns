import java.util.ArrayList;
import java.util.List;

interface Component {
    void operation();
}

class Leaf implements Component {
    public void operation() {
        System.out.println("Leaf operation");
    }
}

class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    void add(Component component) {
        children.add(component);
    }

    void remove(Component component) {
        children.remove(component);
    }

    public void operation() {
        for (Component child : children) {
            child.operation();
        }
    }
}
