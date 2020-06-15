
/**
 * This is the solution to a question that came in Google Kickstart
 * The question was to accept an array of integers and calculate how many countdowns of x are there
 * 
 * Input format  = 
 * <test cases>
 * ...
 * <size of array let it be n> <value of countdown number let it be x>
 * <n integers>
 * 
 * Output format = 
 * Case #1:<number of countdowns>
 * ...
 * 
 * Example : 
 * 1
 * 8 3
 * 1 3 2 1 1 3 2 1
 * 
 * Output : 
 * Case #1
 *
 */

import java.util.Scanner;

public class Countdown {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sol[] = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int c = 0;
            int array[] = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();

            }
            for (int j = 0; j < n; j++) {
                try {
                    if (array[j] == x && array[j + (x - 1)] == 1) {
                        c++;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
            sol[i] = c;
        }
        sc.close();
        for (int i = 0; i < t; i++) {
            System.out.println("Case #" + (i + 1) + ":" + sol[i]);
        }
    }
}


/*
for (int j = 0; j < n; j++) {
try {
if (array[j] == x && array[j + (x - 1)] == 1) {
c++;
}
} catch (ArrayIndexOutOfBoundsException e) {
continue;
}
}
 */