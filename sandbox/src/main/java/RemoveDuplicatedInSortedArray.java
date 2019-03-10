import java.util.*;

public class RemoveDuplicatedInSortedArray {


    public static void main(String[] args) {

        int[] nums = new int[]{0,0,1,1,1,2,3,4,4,5,6,6};
        // nums is passed in by reference. (i.e., without making a copy)
        int len = removeDuplicates(nums);

        // any modification to nums in your function would be known by the caller.
        // using the length returned by your function, it prints the first len elements.
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {

        int l = nums.length;
        int i = 0;
        SortedSet<Integer> set = new TreeSet<Integer>();
        while (i < l -1) {
           set.add(nums[i]);
           i++;
        }
        int j = 0;
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext() && j < l -1 ) {

            nums[j] = itr.next();
            j++;
        }
        return set.size();
    }
}
