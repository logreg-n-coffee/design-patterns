class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    // Setters for each attribute
    public void setDough(String dough) {
        this.dough = dough;
    }
    // ... other setters

    static class Builder {
        private String dough;
        private String sauce;
        private String topping;

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }
        // ... other setters

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.setDough(this.dough);
            // ... set other attributes
            return pizza;
        }
    }
}
