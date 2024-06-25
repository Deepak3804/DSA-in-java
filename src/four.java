import java.util.*;
public class four {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        // loops in java
        //  for(int i=0; i<13;i++){
        //     System.out.println("hello");
        //  }
//        for(int counter =0;counter<10;counter++ ){
        //           System.out.println(counter);
        //       }
        //while loops
        //     int i=0;
        //     while(i<=10){
        //        System.out.println("Deepak");
        //        i++;
        //  }
/*
        //do while loops.
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<11);
    **/
        // print the sum of first n Natural number
        /*
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum= sum+i;
        }
        System.out.println(sum);
        **/
        // print the table of a number input the use
        int n =  sc.nextInt();
        for(int i =1;i<11;i++){
            System.out.println(i*n);
        }

    }

}
