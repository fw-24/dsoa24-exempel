public class Person implements Comparable<Person> {
    String name;
    int rank;

    public Person(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person otherPerson) {
        //return rank - otherPerson.getRank();
        return name.compareTo(otherPerson.getName());
    }

    private int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return name + " " + rank;
    }
}
