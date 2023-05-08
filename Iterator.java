interface Iterator {
    boolean hasNext();

    Object next();
}

class ConcreteIterator implements Iterator {
    private Object[] items;
    private int position;

    public ConcreteIterator(Object[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.length;
    }

    public Object next() {
        if (hasNext()) {
            return items[position++];
        }
        return null;
    }
}

class ConcreteAggregate {
    private Object[] items;

    public ConcreteAggregate(Object[] items) {
        this.items = items;
    }

    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }
}
