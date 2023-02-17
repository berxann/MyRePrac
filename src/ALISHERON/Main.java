package ALISHERON;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    int count = scan.nextInt();
                for(int mult = 1; mult< 11; mult++) {
                    String zvezda = " * ";
                    String eql = " = ";

                    int result = mult*count;

                    System.out.println(mult+zvezda+count+eql+result);
                }
            }
        }