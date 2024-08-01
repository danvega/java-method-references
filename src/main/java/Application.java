import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // 1. Reference to a static method

        // Without method reference
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println(number));

        // With method reference
        numbers.forEach(System.out::println);


        // 2. Reference to an instance method of a particular object

        // Without method reference
        Greeter greeter = new Greeter();
        List<String> family = List.of("Dan", "Jen", "Isabella","Juliana");
        family.forEach(name -> greeter.greet(name));

        // With method reference
        family.forEach(greeter::greet);


        // 3. Reference to an instance method of an arbitrary object of a particular type

        // Without method reference
        List<String> team = Arrays.asList("Tasha", "Dan", "Josh", "DaShaun", "Cora", "Whitney", "Cote");
        team.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        // With method reference
        team.sort(String::compareToIgnoreCase);
        System.out.println(team);

        // 4. Reference to a constructor

        // Without method reference
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Person> people1 = names.stream()
                .map(name -> new Person(name))
                .toList();

        // With method reference
        List<Person> people2 = names.stream()
                .map(Person::new)
                .toList();
        System.out.println(people2);

    }

}
