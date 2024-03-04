public class Person implements Comparable {
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
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return name + " " + rank;
    }
}
