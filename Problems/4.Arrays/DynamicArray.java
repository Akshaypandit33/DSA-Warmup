import java.util.Arrays;

public class DynamicArray {
    private  int[] items;
    private int currentIndex;
    private int initialCapacity;

    // this is when user doesn't provide an size
    public DynamicArray() {
        initialCapacity = 10;
        this.items = new int[initialCapacity];
        currentIndex = 0;
    }

    // this is if the user provides their own size
    public DynamicArray(int initialSize) {
        this.items = new int[initialSize];
        this.initialCapacity = initialSize;
        currentIndex = 0;
    }

    public void insert(int item)
    {
        if(currentIndex < this.initialCapacity ) {
            this.items[currentIndex] = item;
        }else {
            this.items =increaseSize();
            this.items[currentIndex] = item;
        }
        currentIndex++;
    }

    // increase the size of an array automatically
    public int[] increaseSize()
    {
        this.initialCapacity = this.initialCapacity * 2;
//        int[] newArr= new int[this.initialCapacity];
        return Arrays.copyOf(this.items, this.initialCapacity);

    }

    // search index of the value
    public int indexOf(int item)
    {
        for(int i =0; i < this.currentIndex  ; i++) {
            if(this.items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    // remove item from the particular index
    public void removeAt(int index)
    {
        if(index > this.currentIndex)
        {
            System.out.println("Index out of bounds");
            return;
        }
        for(int i= index; i<this.currentIndex -1; i++) {
            this.items[i] = this.items[i+1];
        }
        this.items[this.currentIndex-1]=0;
        this.currentIndex--;
    }

    // find a maximum element from an array
    public int max()
    {
        int max = this.items[0];
        for(int i=0; i<this.currentIndex; i++) {
            if(this.items[i] > max) {
                max = this.items[i];
            }
        }
        return max;
    }

    public void reverse()
    {
        for(int i=0 ; i< this.currentIndex/2 ; i++) {
            int temp = this.items[i];
            this.items[i] = this.items[this.currentIndex-i-1];
            this.items[this.currentIndex-i-1] = temp;
        }
    }

    // find a minimum element from an array
    public int min()
    {
        int min = this.items[0];
        for(int i=0; i<this.currentIndex; i++) {
            if(this.items[i] < min) {
                min = this.items[i];
            }
        }
        return min;
    }
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i=0; i<this.currentIndex; i++)
        {
            s.append(this.items[i]).append(",");
        }
        s.append("\b").append("]");
        return s.toString();
    }


}

