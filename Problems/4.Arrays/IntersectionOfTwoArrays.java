import java.util.*;

public class IntersectionOfTwoArrays {

    // approach 1
    public static int[] intersectionApproach1(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        boolean isNums1Larger = false;
        if(nums1.length>nums2.length){
            isNums1Larger = true;
        }
        if(isNums1Larger)
        {
            for(int i=0;i<nums1.length;i++)
                {
                map.put(nums1[i],i);
                }
            return lookup(nums2,map);
        }
        else {
            for(int i=0;i<nums2.length;i++)
            {
                map.put(nums2[i],i);
            }
            return lookup(nums1,map);
        }


    }
    public static int[] lookup(int[] arr, HashMap<Integer,Integer> map)
    {
        List<Integer> res = new ArrayList<>();
        for(int ele : arr)
        {
            if(map.containsKey(ele))
            {
                res.add(ele);
                map.remove(ele);
            }
        }
        int[] resArr = new int[res.size()];
        for(int i = 0 ;i<res.size();i++)
        {
            resArr[i]= res.get(i);
        }

        return resArr;
    }



    // approach 2

    /*
    *  sort both array - O(n)
    *  use two pointer approach
    * */
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersectionApproach1(nums1,nums2)));
    }
}
