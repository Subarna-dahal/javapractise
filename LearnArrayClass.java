import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
//        int[] numbers={1,2,3,4,5,6,7,8};
//        int index= Arrays.binarySearch(numbers,2);
//        System.out.println(index);
        int[] nums={3,6,4,22,77,33,12,68,90,56,46};
//        Arrays.fill(nums,50);
        Arrays.sort(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }
}
