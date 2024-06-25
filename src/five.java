//import  java.util.*;
public class five {
    public static void main(String[]args){
    //    Scanner sc = new Scanner(System.in);
        //pattern
      //  Question1
        /*
        int n = 4;
        int m = 5;
        // outer loops
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        * */
        /*
        // question2
        int n = 4;
        int m = 5;
        //outer loops
        for(int i=1;i<=n;i++){
            //inner loops
            for(int j=1;j<=m;j++){
                // cell -> (i,j)
                if(i == 1 || j==1 || i==n || j== m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       **/
        /*
        // print the pattern 3
        int n = 4;
        for(int i=1; i<=n;i++){
            //inner loops
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        * */
        /*
        // pattern the pattern 4
        int n = 4;
        for(int i=n; i>=1;i--){
            //inner loops
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        * */
        /*
        // pattern the 6
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(  );
        }
         **/
        // pattern 7
        /*
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println(  );
        }
        **/
        /*
        //pattern 8
        int n = 5;
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
        **/
        // pattern 9
        int n = 5;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                int sum = i+j;
                if(sum % 2==0){   //even
                    System.out.print("1 ");
                }else{ //odd
                    System.out.print("o ");
                }
            }
            System.out.println();
        }
    }
}
