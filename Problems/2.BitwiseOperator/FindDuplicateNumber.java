/*
 Find the duplicate number
 condition :
    All elements appears once but only one element appear twice
 */
public class FindDuplicateNumber {
    public static int duplicateNumber(int[] arr)
    {
        int duplicate =0;
        for(int ele : arr)
        {
            duplicate = duplicate ^ ele;
        }
        for(int i =1 ; i<arr.length;i++)
        {
            duplicate = duplicate ^ i;
        }
        return  duplicate;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3,3};
        System.out.println(duplicateNumber(arr));
    }
}
