import java.util.ArrayList;
import java.util.List;

public class VisitorExample {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new ConcreteElementA());
        elements.add(new ConcreteElementB());

        Visitor visitor = new ConcreteVisitor();
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    interface Element {
        void accept(Visitor visitor);
    }

    static class ConcreteElementA implements Element {
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }

        public String operationA() {
            return "ConcreteElementA";
        }
    }

    static class ConcreteElementB implements Element {
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }

        public String operationB() {
            return "ConcreteElementB";
        }
    }

    interface Visitor {
        void visit(ConcreteElementA element);

        void visit(ConcreteElementB element);
    }

    static class ConcreteVisitor implements Visitor {
        public void visit(ConcreteElementA element) {
            System.out.println("Visited " + element.operationA());
        }

        public void visit(ConcreteElementB element) {
            System.out.println("Visited " + element.operationB());
        }
    }
}
