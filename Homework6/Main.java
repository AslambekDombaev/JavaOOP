package Homework6;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
    // Создаем людей
        Person mary = new Person("Mary", 66);
        Person susan = new Person("Susan", 33);
    // Устанавливаем родительские связи
        susan.setMother(mary);
        mary.addChild(susan);
    // Добавляем людей в древо
        familyTree.addPerson(mary);
        familyTree.addPerson(susan);

        // Пример получения всех детей Мэри
        List<Person> marysChildren = familyTree.getChildren(mary);
        for (Person child : marysChildren) {
            System.out.println("Mary's child: " + child.getName());
        }
    }
}