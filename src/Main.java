import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String[] lotrCharacters = {"Frodo", "Samwise", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Gollum", "Saruman", "Galadriel", "Elrond", "Glorfindel", "Bilbo", "Merry", "Pippin", "Treebeard", "Faramir", "Éowyn", "Éomer", "Grima"};

        StringArray lotr = new StringArray(lotrCharacters);

        Person sauron = new Person("Sauron");
        Person gandalf = new Person("Gandalf");
        Person theoden = new Person("Théoden");


        System.out.println("lotr size: " + lotr.size());
        System.out.println(lotr);
        lotr.add("Sauron");
        System.out.println(lotr);
        lotr.add(5, "Théoden");
        System.out.println(lotr);
        lotr.reverse();
        System.out.println(lotr);

        new BigO();

    }
}