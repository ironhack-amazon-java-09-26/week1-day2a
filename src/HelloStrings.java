public class HelloStrings {
    public static void main(String[] args) {

        String greet = "hello";
        System.out.println(greet);
        System.out.println("To uppercase: " + greet.toUpperCase());


        String email = "  Salva@mail.com";
        System.out.println(email);
        String inputMail = "  SALVA@MAIL.COM                                 ";

//        if (inputMail.equals(email.trim())){
        if (inputMail.trim().equalsIgnoreCase(email.trim())){
            System.out.println("email found");
        } else {
            System.out.println("mail not found");
        }


        String article = "Poco después del mensaje de Trump, que regresó a la Casa Blanca con la intención de comprar la isla más grande del mundo, la oficina de la primera ministra danesa, Mette Frederiksen, publicó en X un comunicado, firmado también por Groenlandia, dando por bueno el pacto. “Groenlandia, Dinamarca y Estados Unidos prevén firmar la próxima semana un acuerdo que reforzará la seguridad en el Ártico y la zona del Atlántico Norte”, dice el texto, que explica que esa firma será en el marco de la Asamblea General de las Naciones Unidas, que se celebra en Nueva York la próxima semana. “Una vez firmado, deberá someterse a los trámites parlamentarios necesarios para su entrada en vigor”, avisa el comunicado.";


        String searchWord = "Frederiksen";


        System.out.println("Este testo menciona " + searchWord + "?");
        boolean wordMatch = article.contains(searchWord);
        if (wordMatch) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }

        System.out.println();


        System.out.println(article);

        System.out.println("===============");
        System.out.println();
        System.out.println();

        System.out.println(article.replace("Groenlandia", "la isla del hielo que se encuentra en el mar del norte donde hace muy frio"));


    }
}
