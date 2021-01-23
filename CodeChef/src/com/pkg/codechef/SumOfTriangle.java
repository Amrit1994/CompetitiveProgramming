package com.pkg.codechef;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
/**
 * Created by alde on 2/27/18.
 */
public class SumOfTriangle {
 
 
    public static void main(String a[]) {
    	SumOfTriangle sumTriangle = new SumOfTriangle();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
            String line = br.readLine();
            int T = Integer.parseInt(line.trim());
            int count = 0;
            while (line != null && count < T) {
                line = br.readLine();
                int n = Integer.parseInt(line.trim());
                int C[][] = new int[n][n];
                int m[][] = new int[n][n];
                for (int i = 0; i < n; i++) {
                    line = br.readLine();
                    String parts[] = line.trim().split(" ");
                    for (int j = 0; j <= i; j++) {
                        C[i][j] = Integer.parseInt(parts[j]);
                    }
                }
                //
                sumTriangle.solve(C, m);
                int val = C[0][0];
                for (int j = 0; j < C.length; j++) {
                    val = Integer.max(val, m[n - 1][j]);
                }
                System.out.println(val);
                //
                count++;
 
            }
        } catch (Exception exc) {
            exc.printStackTrace();
 
        }
        System.exit(0);
    }
 
    private void solve(int[][] c, int[][] m) {
        m[0][0] = c[0][0];
        printMatrix(c);
        for (int i = 1; i < c.length; i++) {
            for (int j = 0; j <= i; j++) {
                int m_i_1_j_1 = 0;
                if (j > 0) {
                    m_i_1_j_1 = m[i - 1][j - 1];
                }
                int value = Integer.max(m[i - 1][j], m_i_1_j_1
                ) + c[i][j];
                m[i][j] = value;
            }
        }
 
    }
 
    private void printMatrix(int[][] c) {
        if (true) {
            return;
        }
        for (int[] row : c) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.print("\n");
        }
    }
}
 