public class Bouncer {
    public static void main(String[] args) {
       /*int age = 23;
        double temp = 3.5;
        boolean isMember = true;
        char first = 'A';


       check user and psw combination input by the user [x]
       if ok let enter and show an option [x]
       else says enter denied [x]
       and after 3 wrong input shutdown the program
       and before that flag the user

         */

        String username = "user1";
        String pwd = "1234";

        String inputUsername = args[0];

        String inputPwd = args[1];

        int accessTentative = 0;

        boolean isUserFlagged = false;

        if (inputUsername.equals(username)){// estamnos checkeando si el username que no has pasado el usuario es el que tenemos guardado
            if (isUserFlagged){
                System.out.println("User flagged. Shutting down!");
                System.exit(0);
            }

            if (accessTentative >= 3 ){
                System.out.println("Too many tentatives. Shutting down!");
                isUserFlagged = true;
                System.exit(0);
            }
            if (inputPwd.equals(pwd)){ // estamos comprobando si la pwd es correcta
                System.out.println("ACCESS GRANTED");
                System.out.println("please select you coffee beverage:");
                System.out.println("1) Espresso");
                System.out.println("2) Latte");
                System.out.println("3) Flat white");
            } else {
                System.out.println("ACCESS DENIED");
                accessTentative++; // es igual a hacer:  accessTentative = accessTentative + 1;
            }
        }




    }
}
