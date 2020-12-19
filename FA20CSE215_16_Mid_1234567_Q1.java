package fa20cse215_16_mid_1234567_q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FA20CSE215_16_Mid_1234567_Q1 {
        
        public static int[][][] sort(int A[][][]) {
                // assumed valid array passed
                int x = A.length;
                int y = 0, z = 0;
                // temporary array to put elements
                // then we will apply sort on it and then rearrange the final output array
                List<Integer> t = new ArrayList<>();
                for(int i = 0; i < x; i++) {
                        y = A[i].length;
                        for(int j = 0; j < y; j++) {
                                z = A[i][j].length;
                                for(int k = 0; k < z; k++) {
                                        t.add(A[i][j][k]);
                                }
                        }
                }
                // sort temporary array 1D array
                Collections.sort(t); // natural ordering (ascending)
                
                // now prepare final output using temporary array 1D array
                int B[][][] = new int[x][y][z]; // same dimension as A
                int idx = 0;
                for(int i = 0; i < x; i++) {
                        for(int j = 0; j < y; j++) {
                                for(int k = 0; k < z; k++) {
                                        // sequential access to A
                                        B[i][j][k] = t.get(idx++);
                                }
                        }
                }
                
                return B; // return modified array
        }
        
        // show 3D array
        public static void show(int A[][][]) {
                int x = A.length;
                for(int i = 0; i < x; i++) {
                        int y = A[i].length;
                        for(int j = 0; j < y; j++) {
                                int z = A[i][j].length;
                                for(int k = 0; k < z; k++) {
                                        System.out.print(A[i][j][k] + " ");
                                }
                                System.out.println();
                        }
                        System.out.println("\n");
                }
        }
        
        public static void main(String[] args) {
                // test
                int A[][][] = new int[][][] {
                        {
                                {5, 12, 18},
                                {1, 17, 6}
                        },
                        {
                                {2, 6, 13},
                                {3, 7, 4},
                        },
                        {
                                {15, 11, 14},
                                {9, 8, 10}
                        }
                };
                
                // before sorting
                System.out.println("Original Array.");
                show(A);
                
                // now sort it
                int B[][][] = sort(A);
                
                // print to show
                System.out.println("Modified Sorted Array.");
                show(B);
        }
}