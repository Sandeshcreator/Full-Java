public class Chw_7_methods {
    static int add(int a, int b){
        int c=0;

        if (a>b) {
            c=(a+b);
        }else{
            c=(a+b)*5;
        }
        return c;
    }

    void  multi(int a,int b){


        for (int i = 1; i <= b; i++) {
            System.out.println(a +"*" +i +"="+(a*i));

        }

    }
    public static void main(String[] args) {
//        int a =20;
//        int b=2;
//        int c=0;
//           if (a>b) {
//         c=(a+b);
//        }else{
//                c=(a+b)*5;
//        }
//
//        System.out.println(c);
        int e=add(2,3);
        System.out.println(e);



        Chw_7_methods nm =new Chw_7_methods();
        nm.multi(5,10);
    }
}
