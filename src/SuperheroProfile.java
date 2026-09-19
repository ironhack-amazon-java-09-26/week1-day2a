public class SuperheroProfile {

    /*
    Requirements

Create a class called SuperheroProfile with a main method. [x]


Declare variables for: [x]
- hero name (String),
- power level (int, 0–100),
- speed (double),
- isFlying (boolean),
- and team initial (char).

Print a formatted profile card showing all attributes. [x]

Use at least three String methods on the hero's name (e.g., length(), toUpperCase(), contains()). [x]


Calculate a "combat score" using arithmetic: powerLevel * 2 + speed. [x]

Use if / else if / else to print a threat level based on power level: [x]
80+: "Omega-level threat"
50–79: "Dangerous"
20–49: "Moderate"
Below 20: "Minimal threat"

crear variable threatLevel
hacer el if para asignar valor threat
imprimir threat level

If the hero is flying and power level is above 50, print a special message. [x]


(Bonus) Accept the hero's name as a command-line argument, with a default if none is provided.

     */

    public static void main(String[] args) {

//        Declare variables for:
//        - hero name (String),
//                - power level (int, 0–100),
//        - speed (double),
//        - isFlying (boolean),
//        - and team initial (char).
        String name;
        if(args.length >= 1){
            name = args[0];
        } else {
            name = "Tav";
        }
        int powerLevel = 65;
        double speed = 60.0;
        boolean isFlying = true;
        char teamInitial = 'd';

//        Print a formatted profile card showing all attributes.

        System.out.println("Hero profile card:");
        System.out.println("-------------");
        System.out.println("Name: " + name);
        System.out.println("Power level: " + powerLevel);
        System.out.println("Speed: " + speed);
        System.out.println("Can fly: " + isFlying);
        System.out.println("Team initial: " + teamInitial);

//        Use at least three String methods on the hero's name (e.g., length(), toUpperCase(), contains()).

        System.out.println("el nombre del super eroe empieza por: " + name.trim().toLowerCase().charAt(0));

//        Calculate a "combat score" using arithmetic: powerLevel * 2 + speed.

        double combatScore = powerLevel * 2 + speed;
        System.out.println("Combat score: " + combatScore);

//        Use if / else if / else to print a threat level based on power level:
//80+: "Omega-level threat"
//50–79: "Dangerous"
//20–49: "Moderate"
//Below 20: "Minimal threat"

        String threatLevel;

        if (powerLevel >= 80){
            threatLevel = "Omega-level threat";
        } else if (powerLevel >=  50 ){
            threatLevel = "Dangerous";
        } else if (powerLevel >=  20 ){
            threatLevel = "Moderate";
        } else {
            threatLevel = "Minimal threat";
        }
        System.out.println("Threat level: " + threatLevel);

        if (powerLevel > 50 && isFlying == true) {
            System.out.println("Vola y es super fuerte, mamma mia!");
        }
    }
}
