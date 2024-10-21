package Homework6;
import java.util.ArrayList;
import java.util.List;


public class Person {
    
    private String name;
    private int age;
    private Person mother;
    private List<Person> child;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.child = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setMother(Person mother){
        this.mother = mother;
    }

        
    
    public Person getMother() {
        return mother;
    }
    
        

    public void addChild(Person child){
        this.child.add(child);
    }

    public List<Person> getChild(){
        return child;
    }
}
