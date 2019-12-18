package com.itechart.increasevariable;

public class Main {

    public static void main(String[] args) {
        Wrapper<Integer> ref = new Wrapper<Integer>(10);

        incrementIntVar(ref);

        System.out.println(ref);
    }

    public static void incrementIntVar(Wrapper<Integer> ref) {
        int i = ref.getRef();
        ref.setRef(++i);
    }

    //Second way to wrap variable into array
}
