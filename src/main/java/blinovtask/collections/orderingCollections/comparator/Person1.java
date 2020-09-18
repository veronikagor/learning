package blinovtask.collections.orderingCollections.comparator;

public class Person1 {
    private int personID;
    private String name = "";
    public Person1(){
    }

    public Person1(int personID, String name) {
        this.personID = personID;
        this.name = name;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "personID=" + personID +
                ", name='" + name + '\'' +
                '}';
    }
}
