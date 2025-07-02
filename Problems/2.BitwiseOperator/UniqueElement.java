/*
    Find the unique element from a set of an array where all elements appear twice only one element appear once
    ex {1,2,3,4,1,2,3}
*/

public class UniqueElement {
    public static int findUnique(int[] arr)
    {
        int unique =0;
        for(int ele : arr)
        {
            unique = unique^ ele;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,1,2,3};
        System.out.println(findUnique(arr));
    }
}
