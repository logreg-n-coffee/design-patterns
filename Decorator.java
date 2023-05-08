class Decorator {
    interface Coffee {
        double cost();
    }

    static class Espresso implements Coffee {
        public double cost() {
            return 1.99;
        }
    }

    static class CoffeeDecorator implements Coffee {
        private Coffee coffee;

        public CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        public double cost() {
            return coffee.cost();
        }
    }

    static class Whip extends CoffeeDecorator {
        public Whip(Coffee coffee) {
            super(coffee);
        }

        public double cost() {
            return super.cost() + 0.50;
        }
    }
}
