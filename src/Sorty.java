import java.util.Arrays;

public class Sorty {

    private String[] values;

    public Sorty(String[] values) {
        this.values = values.clone(); // skapar en deep copy

        System.out.println("String array sort: " + Arrays.toString(this.values));
    }

    public void insertionSort() {
        int ops = 0;
        for (int i = 1; i < values.length; i++) {
            String curVal = values[i];

            int j = i-1; // vi jämför bakåt
            while (j >=0 && values[j].compareTo(curVal) > 0) {
                values[j+1] = values[j];
                j--;

                ops++;
            }
            values[j+1] = curVal;
        }

        System.out.println("insertionSorted, " + ops  + " ops " + Arrays.toString(values));



    }


    public void bubbleSort() {
        int ops = 0;
        // Yttre loop
        for (int i = 0; i < values.length; i++) {
            // Inre loop O(n2)
            for (int j = 1; j < values.length-i; j++) {
                // swappa om första i paret är större
                if (values[j-1].compareTo(values[j]) > 0)  {
                    String temp = values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                    ops++;
                }

            }
        }
        System.out.println("BubbleSorted, " + ops  + " ops " + Arrays.toString(values));
    }

    public String[] getValues() {
        return values;
    }
}
