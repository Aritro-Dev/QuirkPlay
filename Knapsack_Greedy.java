import java.util.Scanner;
public class Knapsack_Greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sol[] = new double[sc.nextInt()];
        for (int i = 0; i < sol.length; i++) {
            int n = sc.nextInt();
            double k = sc.nextDouble();
            double tk = 0.0;
            double g[][] = new double[n][2];
            for (int j = 0; j < n; j++) {
                double w = sc.nextDouble(), p = sc.nextDouble();
                g[j][0] = w;
                g[j][1] = p;

            }
            for (int j = 0; j < n; j++) {
                int min = j;
                for (int x = j + 1; x < n; x++) {
                    if ((g[min][1] / g[min][0]) < (g[x][1] / g[x][0])) {
                        min = x;
                    }
                }
                double t[] = g[j].clone();
                g[j] = g[min].clone();
                g[min] = t.clone();
            }

            for (int j = 0; j < n; j++) {

                if (tk < k) {
                    if ((k - tk) < g[j][0]) {
                        sol[i] += g[j][1] * ((k - tk) / g[j][0]);
                        tk += g[j][0] * ((k-tk) / g[j][0]);
                    }
                    else
                    {
                        sol[i]+=g[j][1];
                        tk+=g[j][0];
                    }

                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < sol.length; i++) {
            System.out.println(sol[i]);
        }

        sc.close();

    }

}
