import java.util.Scanner;
     class Sum{
            int num;
           Sum(int n){
                num=n;
            }
            int getSum(){
                int s=0;
                int temp=num;
              while(temp !=0){
                 s+=temp%10;
                  temp/=10;
               }
              return s;
           }
       }
 class SMain{
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter a number: ");
          int n=sc.nextInt();
          Sum obj=new Sum(n);
          System.out.println("Sum of digits: "+ obj.getSum());
      }
  }
 
