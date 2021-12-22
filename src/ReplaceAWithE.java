public class ReplaceAWithE {

    /*
        Schreiben Sie eine Methode, die einen String als Parameter übergeben bekommt und jedes auftretende 'a' durch
        ein 'e' ersetzt.
    */
    public static String stringReplaceAWithE(String str) {
        return "";
    }

    public static void main(String[] args) {
        String toReplace = "Anna mag Apfel am meisten mit Mais.";

        String replaced = stringReplaceAWithE(toReplace);

        if(replaced.equals("Anne meg Apfel em meisten mit Meis.")) {
            System.out.print("Correct!");
        } else {
            System.out.println("Your String contains \"" + replaced + "\" but it should contain \"Anne meg Apfel em meisten mit Meis.\"");
        }
    }
}
