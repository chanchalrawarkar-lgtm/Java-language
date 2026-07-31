// class hello {
//     public static void main (String[] args) {
//       int a = 5;
//       int b = a;

//       System.out.println("a" + a);
//       System.out.println("b" + b );
//     }
// }

// class hello {
//     public static void main (String[] args) {
//     int a = 5;
//     int b = 3;
//     int sum=a+b, sub=a-b, mul=a*b, div= a/b ;
//     System.out.println("Add " +sum);
//     System.out.println("sub  " +sub);
//     System.out.println("mul " +mul);
//     System.out.println("div " +div);
//     }
//   }

// import java.util.Scanner;
// class hello{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Value of a: ");
//     int a = sc.nextInt();
//     System.out.println("value of b ");
//     int b = sc.nextInt();
//     System.out.println("Value of c: ");
//     int c = sc.nextInt();
//     int add=a+b, sub=b-c;
//     System.out.println("add: "+add);
//     System.out.println("Sub: "+sub);
//   }
// }

// class hello{
//   public static void main(String[] args) {
//       int a=5;
//       float b=4.08f;
//       double c=57.900;
//       char d= 'N';
//       boolean isJavaEasy = true;
//       byte f= 20;
//       short s=500;
//       System.err.println(a);
//       System.err.println(b);
//       System.err.println(c);
//       System.err.println(d);
//       System.err.println(f);
//       System.err.println(s);
//       System.err.println(isJavaEasy);
//   }
//  }

// class hello {
//   public static void main(String[] args) {
//       int age = 18;
//       if (age >= 18) {
//         System.out.println("Eligible to vote");
//       }
//   }
// }

// import java.util.Scanner;
// class hello {
//   public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("age : ");
//       int age = sc.nextInt();
//       if(age>=18) {
//         System.err.println("Eligibile");
//       }
//   }
// }

// import java.util.Scanner;
// class hello {
//   public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("num");
//       int num=sc.nextInt();
//       if(num%2==0) {
//         System.out.println("Even");
//       }
//       else {
//         System.out.println("odd");
//       }
//   }
// }

// class hello {
//     public static void main(String[] args) {
//         int i =1;
//     while(i<=4)
//     {
//         System.out.println("hi "+i);
//         i++;
//     }    
// }
// }

// class hello{
//     public static void main(String[] args) {
//         int i=1;
//         while (i<=4)
//         {
//             System.out.println("hi");
//             int j=1;
//             while(j<=3) {
//                 System.out.println("hello");
//                 j++;
//             }
//             i++;
//         }
//             System.out.println("by");
//         }
//     }

// 
//  class hello {
//     public static void main(String[] args) {
//         for (int i = 1; i < 5; i++) {
//             System.out.println("1"); }
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         if(a>=90){
//             System.out.println("first");
//         }
//         else if(a>=80){
//             System.out.println("second");
        
//         }
//         else if(a>=70){
//             System.out.println("third");
        
//         }
//         else{
//             System.out.println("pass");
//         }
//     }
// }

// class hello{
//     public static void main(String[] args) {
//         int i=1;
//         do { 
//             System.out.println("hlo");
//         } while (i<=3);
       
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         switch(n) {
//             case 1 :
//                 System.out.println("Monday"); 
//                 break;
//             case 2 :
//                 System.out.println("tue");
//                 break;
//             case 3 :
//                 System.out.println("wed");
//                 break;
//             case 4 :
//                 System.out.println("thr");
//                 break;
//             case 5 :
//                 System.out.println("fri");
//                 break;
//             default :
//                System.out.println("sun");
//         }
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       switch(n) {
//         case 1 :
//              System.out.println("jan");
//              break;
//         case 2 :
//             System.out.println("feb");
//             break;
//         case 5 :
//             System.out.println("may");
//             break;
//         case 12 :
//             System.out.println("dec");
//             break;
//         default :
//         System.out.println("sept");
//       }

//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         char c=sc.next().charAt(0);
//         int add=a+b, sub=a-b, div=a/b, mul=a*b, mod=a%b;
//         switch(c) {
//             case '+' :
//             System.out.println("Add :"+add);
//             break;
//             case '-' :
//             System.out.println("Sub :"+sub);
//             break;
//             case '*':
//             System.out.println("Mul :"+mul);
//             break;
//             case '/' :

//             System.out.println("Div: "+div);
//             break;
//             case '%' :
//             System.out.println("Mod: "+mod);
//             break;
//             default:
//                 System.out.println("Invalid ");
//         }
//     }
// }

// class hello {
//     public static void main(String[] args) {
//         for (int i = 1; i < 5; i++) {
//           System.out.println("1"); }
//        }
//  }

// class hello {
//     public static void main(String[] args) {
//         for (int i =1; i<5;i++) {
//             System.out.println(" "+i);
//         }
//     }
// }

// class hello {
//     public static void main(String[] args) {
//         for (int i =1; i<5;i++) {           
//              System.out.println(" 1");
//         }
//     }
//  }

// class hello {
//     public static void main(String[] args) {
//         for (int i =1; i<5;i++) {           
//              System.out.println("1 ");
//         }
//     }
//  }

// class hello {
//     public static void main(String[] args) {
//         int i=1;
//         do { 
//              System.out.println("hlo");
//          } while (i>=3);
//     }
//  }

// import java.util.Scanner;
// class hello {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         long num = sc.nextLong();

//         if(num%2==0) {
//             System.out.println("Even");
//         }
//         else {
//             System.out.println("odd");
            
//         }
//     }
//  }

// import java.util.Scanner;
// class hello {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         if (num==5) {
//             System.out.println("The number is 5");
//         } else {
//             System.out.println("The number is not 5");
//         }
//     }
//  }

// class hello{
//     public static void main(String[] args) {
//         for(int x=0; x<=50; x+=3) {
//         System.out.println(x);
//         }
//     }
// }

// pattern
// class hello {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// class hello {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// class hello {
//     public static void main(String[] args) {
//         int a=6,b=4;
//         for(int i=a; i<=a*b; i+=a) {
//             if(i%b==0) {
//              System.out.print(i+" ");
//             }
//         }
// }
// }

// class hello {
//     public static void main(String[] args) {
       
//         for(int i=1; i<=5; i++) {
         
//              System.out.print(i+" ");
//             }
//         }
// }

// class hello {
//      public static void main(String[] args) {
//          int i =1;
//      while(i<=4)
//      {
//          System.out.println("hi ");
//          i++;
//      }    
//  }
//  }

// class hello {
//     public static void main(String[] args) {
//     System.out.println("Hello, World!");
// }
// }

// class hello {
//     public static void main (String args[]) {
//         int[] num= {10,20,30,40,50};
//         System.out.println(num[0]);
//         System.out.println(num[2]);
//     }
// }

//  class hello {
//         public static void main (String args[]) {
//             int[] num= {10,20,30,40,50};
//             int sum=0;
//             for(int i=0; i<num.length; i++) {
//                 sum=sum+num[i];
//             }
//                 System.out.println(sum);
//             }
//         }

// class hello {
//     public static void main (String args[]) {
//         int[] num= {10,20,30,40,70};
//         int largest=num[0];
//         for(int i=0; i<num.length; i++) {
//             if(num[i]>largest) {
//                 largest=num[i];
//             }
//         }
//             System.out.println(largest);
//         }
//     }

class hello {
        public static void main (String args[]) {
            int[] num= {10,20,30,40};
            for(int i=0;i<num.length;i++){
                System.out.println(num[i]);
            }
        }
 }

<<<<<<< HEAD
=======
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

// hello world
class hello {
    public static void main(String[] args) {
    System.out.println("Hello, World!");
}
}

// array
class hello {
    public static void main (String args[]) {
        int[] num= {10,20,30,40,50};
        System.out.println(num[0]);
        System.out.println(num[2]);
    }
}

// arrayex
class hello {
        public static void main (String args[]) {
            int[] num= {10,20,30,40,50};
            int sum=0;
            for(int i=0; i<num.length; i++) {
                sum=sum+num[i];
            }
                System.out.println(sum);
            }
        }

class hello {
        public static void main (String args[]) {
            int[] num= {10,20,30,40,50};
            int sub=0;
            for(int i=0; i<num.length; i++) {
                sub=sub+num[i];
            }
                System.out.println(sub);
            }
        }

class hello {
    public static void main (String[] args) {
     int[] num= {10,20,30,40,70};
        int largest=num[0];
        for(int i=0; i<num.length; i++) {
            if(num[i]>largest) {
                largest=num[i];
            }
        }
            System.out.println(largest);
        }
    }
        
 class hello {
        public static void main (String args[]) {
            int[] num= {10,20,30,40,50};
            for(int i=0;i<num.length;i++){
                System.out.println(num[i]);
            }
        }
 }

class hello {
        public static void main (String args[]) {
            int[] num= {10,20,40,70};
            for(int i=0;i<num.length;i++){
                System.out.println(num[i]);
            }
        }
 }

class hello {
    public static void main (String args[]) {
        int[] num= {10,20,30,40,50};
        System.out.println(num[0]);
        System.out.println(num[2]);
    }
}

class hello {
    public static void main(String[] args) {
        int a=6,b=4;
        for(int i=a; i<=a*b; i+=a) {
            if(i%b==0) {
             System.out.print(i+" ");
            }
        }
}
}

import java.util.Scanner;
class hello {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[] = new int[size];
         for(int i=0; i<size; i++) {
            num[i]=sc.nextInt();
         }
        for(int i=0; i<num.length;i++) {
            System.out.println(num[i]);
        }
    }
}

//ip op of array
import java.util.Scanner;
class hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size");
        int size=sc.nextInt();
        int marks[] = new int[size];
        for (int i = 0; i <size; i++) {
            System.out.println("input value");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<2;i++) {
        System.out.println(marks[i]);
        }
    }
}
