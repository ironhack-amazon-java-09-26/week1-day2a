public class HelloLoops {

    public static void main(String[] args) throws InterruptedException {

//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");

//        for (int i = 0; i < 12; i++){
//            System.out.println("hello: " + i);
//        }
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("hello: " + i);
//        }

//
//        for (int i = 3; i >= 0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//
//        System.out.println("GO!!");


//        for (int i = 0; i < 60; i++) {
//            Thread.sleep(1000);
//            System.out.println(i);
//        }




//        int subscriptionsPayed = 4;
//
//        for (int i = 0; i < subscriptionsPayed; i++){
//            System.out.println("Enviando orden");
//            System.out.println("quedan aun:  " + (subscriptionsPayed - i) + " ordens por enviar" );
//            Thread.sleep(1000);
//            System.out.println("Ha pasado un mes");
//        }


        int sipInMilliliters = 15;
        int coffeeInMilliliters = 200;

        for (int i = 0; i < coffeeInMilliliters; i += sipInMilliliters){
            System.out.println("drinking my " + (i / sipInMilliliters) + "sip");
            Thread.sleep(1000);
        }

        System.out.println("No more coffee, need more coffee");


    }
}
