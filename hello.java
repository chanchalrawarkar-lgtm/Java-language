class hello {
    public static void main (String[] args) {
      int a = 5;
      int b = a;

      System.out.println("a" + a);
      System.out.println("b" + b );
    }
}

class hello {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.println("*");
                    }
            System.out.println();
        }
    }
}

// even or odd
import java.util.Scanner;
 class hello {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         long num = sc.nextLong();

         if(num%2==0) {
             System.out.println("Even");
         }
         else {
             System.out.println("odd");
            
         }
     }
  }

// to find num is 5 or not
import java.util.Scanner;
 class hello {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int num = sc.nextInt();
         if (num==5) {
             System.out.println("The number is 5");
         } else {
             System.out.println("The number is not 5");
         }
     }
  }

// to print hi repeatedly
class hello {
     public static void main(String[] args) {
         int i =1;
     while(i<=4)
     {
         System.out.println("hi ");
         i++;
     }    
 }
 }
