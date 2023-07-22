package com.carrays;
import java.util.Scanner;


public class ComplexArrays {

  public static void main(String[] args) {
  Scanner in = new Scanner (System.in);
int[] values = new int[5];

for(int i = 0; i<5; i++){
  System.out.printf("enter a number for the position [%d]",i+1);
  values[i] = in.nextInt();
}

int sum = 0;
for(int x = 0; x<5; x++){
  sum += values[x];
}
  
  System.out.printf("the sum of the elements is %d\n",sum);
  
  for(int x = 0; x<5; x++){
    int product = (values[x]*x);
    System.out.printf("the product of the multiplication of the numbers is %d * %d = %d\n", values[x], x, product);
  }
   
   
   double average = sum/5.0;
   System.out.printf("the average of %f", average);
   
   in.close();
  }
}
