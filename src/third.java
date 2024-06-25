import java.util.*;
public class third {
    public static void main(String[]args){
        // conditional statement
        Scanner sc = new Scanner(System.in);
        /*
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are Adult");
        }else{
            System.out.println("you are not adult");
        }
        **/
        // odd and even
        /*
        int num = sc.nextInt();
        if(num %2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
        **/
        /*
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }else if(a>b){
            System.out.println(" a is greater");
        }else{
            System.out.println(" a is lesser");
        }
        **/
        // print the greeting
        /*
        int button = sc.nextInt();
        if(button ==1){
            System.out.println("hello");
        }else if(button == 2){
            System.out.println("Namaste");
        }else if(button==3){
            System.out.println("bonjour");
        }else{
            System.out.println("invalid button");
        }
        **/
        // switch in java
        int button = sc.nextInt();
        switch (button){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
                case 3:
                    System.out.println("bonjour");
                    break;
            case 4:
                System.out.println("invalid");
        }


    }
}
