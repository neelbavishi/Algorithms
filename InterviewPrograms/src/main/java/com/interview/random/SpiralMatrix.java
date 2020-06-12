package com.interview.random;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length<1 || matrix[0].length<1)
        {
            return res;
        }
        int L=0;
        int T=0;
        int B=matrix.length-1;
        int R=matrix[0].length-1;
        char curr = 'R';
        
        while(T<=B && L<=R)
        {
            if(curr == 'R')
            {
                for(int i=T; i<=R; i++)
                {
                    res.add(matrix[T][i]);
                }
                T++;
                curr='D';
            }
            
            else if(curr == 'D')
            {
                for(int i=T; i<=B; i++)
                {
                    res.add(matrix[i][R]);
                }
                R--;
                curr='L';
            }
            
            else if(curr == 'L')
            {
                for(int i=R; i>=L; i--)
                {
                    res.add(matrix[B][i]);
                }
                B--;
                curr = 'U';
            }
            
            else if(curr == 'U')
            {
                for(int i=B; i>=T; i--)
                {
                    res.add(matrix[i][L]);
                }
                L++;
                curr = 'R';
            }
        }
        return res;
    }
}
