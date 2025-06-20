package org.example.myProjets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
    public class FindMaximumAgeFromofPeople {
        public static void main(String[] args) {
            List<Person> people = Arrays.asList(
                    new Person("A", 23),
                    new Person("B", 40),
                    new Person("C", 31),
                    new Person("D", 50)
            );

            Optional<Person> oldPerson = people.stream()
                    .max(Comparator.comparing(Person::getAge));

            System.out.println(oldPerson.get());
        }
}
