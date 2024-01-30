package javatestcase;

//MathUtils.java
public class MathsUtils {
 public int add(int a, int b) {
     return a + b;
 }

 public int subtract(int a, int b) {
     return a - b;
 }

 public int multiply(int a, int b) {
     return a * b;
 }

 public double divide(int a, int b) {
     if (b == 0) {
         // Handle division by zero
         return -1.0;
     }
     return (double) a / b;
 }
}
