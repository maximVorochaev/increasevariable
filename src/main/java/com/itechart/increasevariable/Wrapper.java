package com.itechart.increasevariable;

public class Wrapper<E> {
    E ref;

    public Wrapper(E ref) {
        this.ref = ref;
    }

    public E getRef() {
        return ref;
    }

    public void setRef(E ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return ref.toString();
    }
}
