package Example_arrays;

import java.util.Scanner;

public class FindHighestNumber {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            String str="";
            int n=s.length();
            int x=(int)s.charAt(n-1)-48;
            //System.out.println(x);
            int f=0;
            for(int j=0;j<n-1;j++){
                int y=(int)s.charAt(j)-48;
                if((y < x )&&(y%2==0)){
                    str = s.substring(0,j)+x+s.substring(j+1,n-1)+y;
                    f=1;
                    break;
                }
            }
            for(int j=n-2;j>=0 && f!=1;j--){
                int y=(int)s.charAt(j)-48;
                if(y%2==0){
                    str=s.substring(0,j)+x+s.substring(j+1,n-1)+y;
                    f=1;
                    break;
                }
            }
            if(f==1)
                System.out.println(str);
            else
                System.out.println(s);
        }
    }
}