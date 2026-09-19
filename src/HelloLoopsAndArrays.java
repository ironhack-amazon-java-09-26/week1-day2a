public class HelloLoopsAndArrays {
    public static void main(String[] args) {

        String[] countries = {"USA", "Canada", "Mexico", "Brazil", "Argentina"};
        String[] countriesCodes = { "US", "CA", "MX", "BR", "AR"};

        for (int i = 0; i < countries.length; i++) {
            System.out.println(i + ": " + countries[i] + " - " + countriesCodes[i]);
        }

        for(String country : countries){
            System.out.println(country);
        }






    }
}
