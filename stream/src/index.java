import java.util.*;
import java.util.stream.Collectors;

public class index {
    public static void main(String[] args) {
        Person temp = new Person();
        ArrayList<Person> people = temp.getPeople();

        // forEach
        people.forEach(System.out::println);

        // filter
        List<Person> femaleList = people.stream().filter(person -> person.getGender() == Gender.FEMALE).collect(Collectors.toList());
        System.out.println("***femaleList***" + "\n" + femaleList);
        List<Person> maleList = people.stream().filter(person -> person.getGender() == Gender.MALE).collect(Collectors.toList());
        System.out.println("***maleList***" + "\n" + maleList);

        // sort
        List<Person> sortedByAgeList = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

        // allMatch
        boolean isAllMarried = people.stream().allMatch(Person::isMarried);
        System.out.println("***isAllMarried***" + "\n" + isAllMarried);

        // anyMatch
        boolean isSomeoneMarried = people.stream().anyMatch(Person::isMarried);
        System.out.println("***isSomeoneMarried***" + "\n" + isSomeoneMarried);

        // noneMatch
        boolean isNoOneMarried = people.stream().noneMatch(Person::isMarried);
        System.out.println("***isNoOneMarried***" + "\n" + isNoOneMarried);

        // max
        Optional<Person> oldestPerson = people.stream().max(Comparator.comparing(Person::getAge));
        System.out.println("***oldestPerson***" + "\n" + oldestPerson);

        // min
        Optional<Person> youngestPerson = people.stream().min(Comparator.comparing(Person::getAge));
        System.out.println("***youngestPerson***" + "\n" + youngestPerson);

        // groupingBy
        Map<Gender, List<Person>> groupedByGender = people.stream().collect(Collectors.groupingBy(Person::getGender));
        System.out.println("***groupedByGender***" + "\n" + groupedByGender);

        // map
        List<String> names = people.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("***names***" + "\n" + names);

        // mixed
        Optional<String> name = people.stream().filter(Person::isMarried).filter(person -> person.getGender() == Gender.MALE).min(Comparator.comparing(Person::getAge)).map(Person::getName);
        System.out.println("***name***" + "\n" + name);

    }
}
