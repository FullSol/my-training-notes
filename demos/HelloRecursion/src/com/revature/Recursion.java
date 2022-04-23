package com.revature;

public class Recursion {
    // Recursion - a mthod calls itself continuously, making our code more compact
    // Warning: if not done/handled properly, you can cause a StackOverflowErrorException
    // You will likely use recusrion with menu creation in our projects
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    public static long factorial(int n) {
        if(n == 1){
            return 1;
        } else if(n <= 0){
            return 0;
        } else {
            return n * factorial(n - 1);
        }
    }
}
