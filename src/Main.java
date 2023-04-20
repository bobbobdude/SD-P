import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <ReadTextFile.Person> persons = ReadTextFile.loadPersons();

        System.out.println("Total number of persons: " + persons.size());

        for (int i = 0; i < persons.size(); i++){
            System.out.println(persons.get(i).getFirstName());
        }

    }

    }