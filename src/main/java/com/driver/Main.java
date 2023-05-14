package com.driver;

public class Main {
    //Task 1
    public static class Product{
        //Task 3
        public  int product(int x, int y) { //call to main function object p and return a value

            return x*y;
        }
        //Task 4
        public int product(int x, int y, int z) {  //call to main function object p and return a value
            return x*y*z;
        }
        //Task 5
        public double product(double x, double y) {   //call to main function object p and return the return a value
            return x*y;
        }
    }
    public static void main(String[] Args) {
        //Task 2
        Product p=new Product();
        System.out.println(p.product(1,2)); //Task 3, called value by product method
        System.out.println(p.product(1,2,3));; //Task 4, called value by product method
        System.out.println(p.product(0.2,0.5));  //Task 5, called value by product method
    }

}