import java.sql.Array;
import java.util.ArrayList;

public class Person {
    private String name;
    private Gender gender;
    private int age;
    private boolean isMarried;

    public Person() {}

    public Person(String name, Gender gender, int age, boolean isMarried) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.isMarried = isMarried;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public String toString(){
        return "(Person " + "name: " + this.name + ", " +
                "gender: " + this.gender + ", " +
                "age: " + this.age + ", " +
                "isMarried: " + this.isMarried + ")";
    }

    public ArrayList<Person> getPeople() {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("eddie", Gender.MALE, 12, false));
        people.add(new Person("sam", Gender.MALE, 20, true));
        people.add(new Person("paul", Gender.MALE, 30, true));
        people.add(new Person("sally", Gender.FEMALE, 12, false));
        people.add(new Person("kelly", Gender.FEMALE, 20, true));
        people.add(new Person("sandy", Gender.FEMALE, 30, false));
        return people;
    }

}
