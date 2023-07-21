package golde.comet.assessment.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Person {
    String name;
    int age;
    String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

public interface ReadingJsonObject {
    public static void main(String[] args) {

            try {
                Scanner scanner = new Scanner(new File("src/main/resources/person.csv"));
                scanner.useDelimiter(",");

                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] fields = line.split(",");

                    Person person = new Person();
                    person.setName(fields[0]);
                    person.setAge(Integer.parseInt(fields[1]));
                    person.setEmail(fields[2]);

                    System.out.println(person.toString());
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
}
