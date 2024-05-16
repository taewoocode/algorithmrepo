package datastructure;


public class HappyNumberCalculator {

    public static void main(String[] args) {
        int range = 9999;
        int happyCount = 0;
        int happySum = 0;

        for (int i = 1; i <= range; i++) {
            int num = i;
            int sum = num;
            while (sum != 1 && sum != 4) {
                sum = 0;
                while (num > 0) {
                    int digit = num % 10;
                    sum += digit * digit;
                    num /= 10;
                }
                num = sum;
            }
            if (sum == 1) {
                happyCount++;
                happySum += i;
            }
        }
        System.out.printf("1 ~ %d 범위의 행복 수는 %d개이고 총합은 %d이므로 두 수의 곱은 %d입니다.",
                range, happyCount, happySum, happyCount * happySum);
    }
}

