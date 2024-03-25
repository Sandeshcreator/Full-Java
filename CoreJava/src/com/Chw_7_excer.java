public class Chw_7_excer {
 /*   static  void starrr() {
        int n = 4;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 4; j >i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }*/



    /*static  void multi(int numb){



        for (int i = 1; i <=10 ; i++) {

          //  System.out.println(numb+"\t*\t"+i+"\t=\t"+ numb*i);
            System.out.format("%d x %d = %d\n",numb,i ,numb*i);
        }

    }*/
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }



    public static void main(String[] args) {
//        starrr();
//        multi(5);


        int n = 5;
        int fib = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is " + fib);




    }
}
