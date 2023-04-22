package stringAPIPractice15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadTextFile {
    public static List loadPersons() {

        List list = new ArrayList<>();

        File file = new File("src/testdata.csv");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                list.add(new Person(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Could not find the file to be loaded");
        }

        return list;
    }

    public static class Person {
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String street;
        private String city;
        private String state;
        private int zip;

        public Person(String csvLine) {
            String[] data = csvLine.split(",");
            this.id = Integer.valueOf(data[0]);
            this.firstName = data[1];
            this.lastName = data[2];
            this.age = Integer.valueOf(data[3]);
            this.street = data[4];
            this.city = data[5];
            this.state = data[6];
            this.zip = Integer.valueOf(data[7]);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }

        public int getAge() {
            return age;
        }
    }
}
