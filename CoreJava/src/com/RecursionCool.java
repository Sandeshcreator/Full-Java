public class RecursionCool {
    public static void main(String[] args) {
//        recurse(20);

        System.out.println(facto(10));


    }



//    public static void recurse(int numb) {
//        if ( numb== 0) {
//            System.out.println("hello mf");
//        }else {
//            System.out.println(numb);
//            numb--;
//            recurse(numb);
//
//
//        }
//
//
//    }


    public static int facto(int numbo) {
        if (numbo == 1) {
            return 1;
        }else {
            return  numbo*facto(numbo-1);
        }


    }
}
