public class Main {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(5);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);

        System.out.println(arr);
//        System.out.println(arr.indexOf(6));
//        arr.removeAt(0);
        System.out.println(arr);

        System.out.println(arr.max());
        System.out.println(arr.min());
        arr.reverse();
        System.out.println(arr);
    }
}
