import java.util.*;
class FW
/**
 * This is the implementation of the Floyd-Warshall algorithm for the shortest path matrix computation
 *
 * The function to do that is also given, to be developed
  */
{
    static Scanner sc=new Scanner(System.in);
    static int am[][];
    public static int[][] Floyd_Warshall(int m[][])
    {
        int size = m[0].length;
        for(int k=0;k<size;k++)
        {
            for(int j=0;j<size;j++)
            {
                for(int l=0;l<size;l++)
                {
                    m[j][l]=(int)Math.min(m[j][l], m[j][k]+m[k][l]);
                }
            }
        }
        return m;
    }
    public static void main(String args[])
    {
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int size = sc.nextInt();
            am = new int[size][size];
            for(int j=0;j<size;j++)
            {
                for(int k=0;k<size;k++)
                {
                    am[j][k]=sc.nextInt();
                }
            }
            for(int k=0;k<size;k++)
            {
                for(int j=0;j<size;j++)
                {
                    for(int l=0;l<size;l++)
                    {
                        am[j][l]=(int)Math.min(am[j][l], am[j][k]+am[k][l]);
                    }
                }
            }
        }
        int s = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(am[s][d]);
    }
}

