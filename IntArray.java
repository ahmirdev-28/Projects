public class IntArray {

    private int length;
    private int[] myArray;

    // constructor
    public IntArray(int size) {
        length = size;
        myArray = new int[size];
    }

    // returns how many elements are in the array
    public int size() {
        return length;
    }

    // fills array with random numbers from 1–6
    public void fillRand() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)(Math.random() * 6) + 1;
        }
    }

    // changes value at a specific index
    public void set(int index, int value) {
        myArray[index] = value;
    }

    // returns value at index
    public int get(int index) {
        return myArray[index];
    }

    // clears array (sets everything to 0)
    public void clear() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 0;
        }
    }

    // checks if all values are 0
    public boolean isEmpty() {
        for (int num : myArray) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    // simple sort (ascending)
    public void sort() {
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }

    // prints array nicely
    public String toString() {
        String output = "";
        for (int i = 0; i < myArray.length; i++) {
            output += myArray[i];
            if (i < myArray.length - 1) {
                output += " ";
            }
        }
        return output;
    }
}