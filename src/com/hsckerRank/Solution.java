package com.hsckerRank;

import java.util.Scanner;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public static long power(int n, int p) throws Exception{
        int sum=n;
        if(n>=1 && 1<=p){
            
            for(int i=1;i<=4;i++){
                sum*=n;
            }
        }
        else  if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        else{
            if((n<0 && 0<p) || (p<0 && 0<n)||(n<0 && 0>p)){
                throw new Exception("n or p should not be negative.");
            }
        }
        
        return sum;
    }
    
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}