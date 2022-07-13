import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int m;
        m=in.nextInt();
        in.nextLine();
        String temp;
        char arr[][]=new char[m][2];
        for(int i=0;i<m;i++){
            temp=in.nextLine();
            arr[i][0]=temp.charAt(0);
            arr[i][1]=temp.charAt(2);
        }
        temp=in.nextLine();
        int i=0;
        while(i<temp.length()){
            int tempCount=0;
            int j=0;
            while(j<m){
                if(temp.charAt(i)==arr[j][0]){
                    System.out.print(arr[j][1]);
                    tempCount++;
                }
                else if(temp.charAt(i)==arr[j][1]){
                    System.out.print(arr[j][0]);
                    tempCount++;
                }
                j++;
            }
            if(tempCount==0){
                System.out.print(temp.charAt(i));
            }
            i++;
        }
        in.close();
    }
}