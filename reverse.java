import java.util.Scanner;
   class Reverse{
       int reverse(int num){
           int reversed=0;
           while(num!=0){
               int digit=num%10;
               reversed=reversed*10+digit;
               num=num/10;
           }
          return reversed;
      }
  }
 class RevMain{
      public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter a number: ");
          int n=sc.nextInt();
          Reverse rev=new Reverse();
          int res=rev.reverse(n);
          System.out.println("Reversed Number: "+res);
      }
  }

