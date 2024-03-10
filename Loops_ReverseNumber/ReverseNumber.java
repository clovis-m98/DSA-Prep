import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
         //print last digit
            System.out.print(num%10); 
         //remove last digit
            num=num/10;
        }
    }
}
