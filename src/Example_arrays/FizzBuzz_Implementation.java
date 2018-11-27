package Example_arrays;

import com.oracle.tools.packager.Log;

//Write a program that prints the numbers from 1 to 100
//and for multiples of '3' print "Fizz" instead of the number
//and for the multiples of '5' print "Buzz".

public class FizzBuzz_Implementation {
    public static void main (String ... args){


fizzyBuzzer(2);

    }
    public static void fizzyBuzzer(int number){
        for(int i =1; i <= 100 ; i++){

            if(i%15==0){
               System.out.println("vidoori");
            }
            else if(i%7==0){
        System.out.println("doori");
    }
            else if(i%9==0){
        System.out.println("vi");
    }
            else{
        System.out.println(i+ " ");
    }


}
    }
}
