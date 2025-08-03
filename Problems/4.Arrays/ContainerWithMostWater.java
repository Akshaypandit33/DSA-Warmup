public class ContainerWithMostWater {
   static public int maxAreaNaiveApproach(int[] height) {
       if(height.length < 3)
       {
           return Math.min(height[0],height[1]);
       }
        int max =0;
        for(int i=0; i < height.length - 1; i++)
        {
            for(int j =i+1 ; j< height.length; j++)
            {
                int width =Math.min(height[i],height[j]);
                int area = width * (j-i);
                if(max < area)
                {
                    max = area;
                }
                System.out.printf("i: %d , j: %d , max: %d",height[i],height[j],max);
                System.out.println();
            }
            System.out.println();
        }
        return max;
    }


    // Optimal solution
    static public int maxArea(int[] height){
        int maxWater =0;
        int left = 0, right = height.length - 1;
        while(left<right){

            maxWater = area(height,left,right,maxWater);
            if(height[left] < height[right]){
                left++;
            }
            else if(height[left] > height[right]){
                right--;
            }
            else {
                // when both heights are equal then
                left ++;
                right --;
            }
        }
        return maxWater;
    }

    static public int area(int[] height ,int i, int j, int maxWater)
    {
        int width =Math.min(height[i],height[j]);
        int area = width * (j-i);
        return Math.max(maxWater,area);
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
