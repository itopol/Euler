package _3;

import java.util.ArrayList;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 */
public class Solution {
    public static void main(String[] args) {
        long n = 13195;
        for (int i = 2; i <= n; i++) {
           while (n%i==0) {
               if (n==i) {
                   System.out.println(n);
                   return;
               }
               n /= i;
               System.out.println(i);
           }
        }
    }


}
