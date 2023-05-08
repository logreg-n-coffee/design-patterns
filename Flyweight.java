import java.util.HashMap;
import java.util.Map;

class Flyweight {
    private String intrinsicState;

    public Flyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    void operation(String extrinsicState) {
        System.out.println("Intrinsic State: " + intrinsicState + ", Extrinsic State: " + extrinsicState);
    }
}

class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            flyweights.put(intrinsicState, new Flyweight(intrinsicState));
        }
        return flyweights.get(intrinsicState);
    }
}
