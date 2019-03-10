import java.util.*;


public class TwoSum {

    public static void main(String[] args) {

        System.out.println("Enter digits comma separated");
        Scanner in = new Scanner(System.in);
        String rawNums = in.nextLine().replace(" ","").trim();
        String[] numsString = rawNums.split(",");
        int[] nums = new int[numsString.length];
        for (int i = 0; i <= numsString.length - 1 ; i++) {
            nums[i] = Integer.valueOf(numsString[i]).intValue();
        }
        System.out.println("Enter digits comma separated");
        Scanner in2 = new Scanner(System.in);
        String target = in2.nextLine();
        target = target.replace(" ","").trim();

        int[] result = twoSum2(nums, Integer.valueOf(target).intValue());
        System.out.println("Result is [" +result[0] + "," + result[1] + "]");

    }

     public  static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        if (nums.length <= 1) {
            return  result;
        }
        for (int i = 0 ; i<= nums.length - 1; i ++ ) {
                for (int j = i  + 1; j <= nums.length - 1; j++) {
                         if (nums[i] + nums[j] == target) {
                             result[0] = i;
                             result[1] = j;
                             return result;
                         }

                }

        }
        return result;
     }

     public static int[] twoSum2(int[] nums, int target) {

         int[] result = new int[2];

         Arrays.sort(nums);
         for (int i = 0 ; i<= nums.length - 1; i ++) {
             for (int j = nums.length - 1; j > i+1 ; j--) {
                 if (nums[i] + nums[j] == target) {
                     result[0] = i;
                     result[1] = j;
                     return result;
                 }

             }

         }
         return result;
     }

}
