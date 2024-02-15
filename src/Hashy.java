public class Hashy {

    private Person[] hashTable;
    private int size;
    public int totCollisions = 0;

    public Hashy (int dataSize) {
        size = dataSize*10;
        hashTable = new Person[size];
    }

    public int hash(String str) {
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            ret += ((int) str.charAt(i)) * 9.8;
        }
        return ret % size;
    }

    public Person search(String name) {
        int idx = hash(name);
        int ops = 1;

        // linear probing
        while (!hashTable[idx].getName().equals(name)) {
            idx++;
            idx %= size; // gå till början vid behov

            ops++;

            // om strängen inte finns
            if (ops > size) return null;

        }
        System.out.printf("HashTable-search %s ops: %d\n",
                name,
                ops);
        return hashTable[idx];
    }

    public void add(Person person) {
        int idx = hash(person.getName());
        int collisions = 0;

        // linear probing
        while (hashTable[idx] != null) {
            idx++; // öka idx, kolla om nästa är ledig
            idx %= size; // gå till början vid behov
            collisions++;
        }
        hashTable[idx] = person;

        totCollisions += collisions;

        /* System.out.printf("Add %s at idx %d %s\n",
                person.getName(),
                idx,
                (collisions > 0) ? collisions + " COLLISIONS" : ""
        ); */

    }



}
