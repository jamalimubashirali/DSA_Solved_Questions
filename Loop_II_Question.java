import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<=n-1;j++){
                int temp = 0;
                int mul=1;
                for(int k=0;k<=j;k++){
                    temp+=(mul*b);
                    mul*=2;
                }
                System.out.print(a+temp+" ");
                if(j==n-1)
                System.out.println();
            }
        }
        in.close();
    }
}
