package solution;
import java.util.*;

public class Solution6 {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add( nums[i] );
        }
        if (n < hashSet.size()) {
            answer = n;
        }
        else {
            answer = hashSet.size();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int answer = solution6.solution( numbers );
        System.out.println( answer );
    }
}


