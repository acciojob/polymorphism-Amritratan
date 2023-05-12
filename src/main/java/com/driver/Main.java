package com.driver;

public class Main {
    //Task 1
    public static class Product{
        //Task 3
        public  int product(int x, int y) { //call to main function object p and return a value

            return x;
        }
        //Task 4
        public int product(int x, int y, int z) {  //call to main function object p and return a value
            return x;
        }
        //Task 5
        public double product(double x, double y) {   //call to main function object p and return the return a value
            return x;
        }
    }
    public static void main(String[] Args) {
        //Task 2
        Product p=new Product();
        p.product(1,2); //Task 3, called value by product method
        p.product(1,2,3); //Task 4, called value by product method
        p.product(0.2,0.8);  //Task 5, called value by product method
    }

}