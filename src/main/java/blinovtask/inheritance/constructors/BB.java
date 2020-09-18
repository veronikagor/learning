package blinovtask.inheritance.constructors;


class BB extends A {
    public BB() {
//super(" "); // да
        this(" "); // да
    }

    public BB(String str) {
        super(str);
    }
}

// либо super() либо this()