package solution;

import java.time.LocalDate;
import java.util.Scanner;

public class Solution {
    public int solution(int age) {
        LocalDate today = LocalDate.now();
        int year = today.getYear() - age - 1;
        return year;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        scanner.close();
        int result = solution.solution( age ); //사용자로부터 입력받은 나이
        System.out.println( result );



    }
}
