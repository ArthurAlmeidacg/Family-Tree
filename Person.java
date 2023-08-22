package pvl5;

import java.util.ArrayList;
import java.util.List;

public class Person implements I_Person {

    private String name;
    private int ID;
    private List<I_Person> children;

    public Person(String name){
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<I_Person> getChildren() {
        return children;
    }

    public void addChild(I_Person child) {
        children.add(child);
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }  

}
