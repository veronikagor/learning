package blinovtask.inheritance.overloading;

public class ConstructorParent {
    private int id ;
    private String name = " ";

    public ConstructorParent() {
        super();
    }

    public ConstructorParent(int id) {
        super();
        this.id = id;
    }

    public ConstructorParent(String name) {
        super();
        this.name = name;
    }

    public ConstructorParent(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }


}
