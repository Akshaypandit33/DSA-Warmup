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
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int ele : this.items)
        {
            s.append(ele).append(",");
        }
        s.append("\b").append("]");
        return s.toString();
    }


}

