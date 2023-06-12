import java.util.ArrayList;

/**
 * Array based list.
 *
 * @author Josh Hug
 */

public class AList {
    private int size = 100;
    private int[] arr;
    private int lastIndex = 0;

    /**
     * Creates an empty list.
     */
    public AList() {
        this.arr = new int[this.size];
    }

    /**
     * Inserts X into the back of the list.
     */
    public void addLast(int x) {
        if (lastIndex > size - 1) {
            int newSize = this.size * 2;
            int[] newArr = new int[newSize];
            System.arraycopy(this.arr, 0, newArr, 0, this.size);
            this.size = newSize;
            this.arr = newArr;
        }
        this.arr[lastIndex] = x;
        this.lastIndex++;
    }

    /**
     * Returns the item from the back of the list.
     */
    public int getLast() {
        return this.arr[lastIndex];
    }

    /**
     * Gets the ith item in the list (0 is the front).
     */
    public int get(int i) {
        return this.arr[i];
    }

    /**
     * Returns the number of items in the list.
     */
    public int size() {
        return this.lastIndex + 1;
    }

    /**
     * Deletes item from back of the list and
     * returns deleted item.
     */
    public int removeLast() {
        int lastItem = this.arr[lastIndex];
        this.arr[lastIndex] = 0;
        this.lastIndex--;
        return lastItem;
    }
} 