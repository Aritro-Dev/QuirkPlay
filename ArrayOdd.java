import java.util.ArrayList;
/**
 * This program is the solution to a question : 
 * <Input format>
 * Input number of test cases 
 * Input size of array(=n)
 * Input n elements
 * 
 * <Output format>
 * Case #t<t is the number of test cases>:<number of pairs of the elements whose product is odd> 
 * 
 * Exception : 
 * 3 x 7 and 7 x 3 is same and will NOT be counted seperately
 * 
 */
import java.util.Scanner;

public class ArrayOdd {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sol[] = new int[sc.nextInt()];
        ArrayList<Integer> mem =new ArrayList<Integer>();
        for (int i = 0; i < sol.length; i++) {
            int array[] = new int[sc.nextInt()];
            for (int j = 0; j < array.length; j++) {
                array[j] = sc.nextInt();
            }
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (k == j || mem.contains(new Integer(Integer.parseInt(Integer.toString(array[j])+Integer.toString(array[k]))))|| mem.contains(new Integer(Integer.parseInt(Integer.toString(array[k])+Integer.toString(array[j]))))) {
                        continue;
                    } else if ((array[j] * array[k]) % 2 != 0) {
                        sol[i]++;
                        mem.add(new Integer(Integer.parseInt(Integer.toString(array[j])+Integer.toString(array[k]))));
                    }
                }
            }
        }
        for (int i = 0; i < sol.length; i++) {
            System.out.println("Case #" + (i + 1) + ":" + sol[i]);
        }
        sc.close();
    }

}
