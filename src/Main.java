import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    String[] lotrCharacters = {"Frodo", "Samwise", "Gandalf", "Aragorn", "Legolas", "Gimli", "Boromir", "Gollum", "Saruman", "Galadriel", "Elrond", "Glorfindel", "Bilbo", "Merry", "Pippin", "Treebeard", "Faramir", "Éowyn", "Éomer", "Grima"};


        Stacky stacky = new Stacky(5);
        stacky.push(lotrCharacters[0]);
        stacky.push(lotrCharacters[5]);
        stacky.push(lotrCharacters[7]);
        System.out.println("Stacky: " + stacky);
        System.out.println("pop: " + stacky.pop());
        stacky.push("Nytt");
        System.out.println("Stacky: " + stacky);
        System.out.println("pop: " + stacky.pop());

        System.out.println("Stacky: " + stacky);

        StringArray lotr = new StringArray(lotrCharacters);

        Person sauron = new Person("Sauron");
        Person gandalf = new Person("Gandalf");
        Person theoden = new Person("Théoden");

        Linky linky = new Linky();
        linky.add(sauron);
        linky.add(gandalf);
        linky.add(theoden);
        linky.printLinky();

        System.out.printf("linky.size(): %d\n", linky.size());




        /* System.out.println("lotr size: " + lotr.size());
        System.out.println(lotr);
        lotr.add("Sauron");
        System.out.println(lotr);
        lotr.add(5, "Théoden");
        System.out.println(lotr);
        lotr.reverse();
        System.out.println(lotr);

        new BigO(); */

    }
}