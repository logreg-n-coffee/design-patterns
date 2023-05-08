class Prototype {
    static abstract class Animal implements Cloneable {
        abstract void speak();

        public Animal clone() {
            try {
                return (Animal) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException("Clone failed", e);
            }
        }
    }

    static class Dog extends Animal {
        void speak() {
            System.out.println("Woof!");
        }
    }

    static class Cat extends Animal {
        void speak() {
            System.out.println("Meow!");
        }
    }

}
