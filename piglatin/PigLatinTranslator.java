package piglatin;

import java.util.Scanner;

public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();

        // TODO: Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times.
       

        return translatedBook;
    }

    public static String translate(String input) {
        System.out.println("  -> translate('" + input + "')");

        String result = "";
        
        // TODO: translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.
        result = translateWord(input);

        return result;
    }

    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");

        String result = input.trim();
        if(result.length()==0){
            return result;
        }
        String first = input.substring(0,1);
        boolean vowel;
        boolean convertUpper = false;
        if(first.compareTo(" ") + 32 <97){
            convertUpper=true;
        }
        Scanner sc = new Scanner(input);
        String finalResult = "";
        //Translate
        while(sc.hasNext()){
            result = sc.next();
            first = result.substring(0,1);
            vowel = first.equals("a") || first.equals("A") || first.equals("e") || first.equals("E") || first.equals("i") || first.equals("I") || first.equals("o") || first.equals("O") || first.equals("u") || first.equals("U");
            if(vowel){
                result += "ay";
            }else{
                result = result.substring(0,1).toLowerCase() + result.substring(1, result.length());
                //System.out.println(result.substring(0,1));
                //convertUpper=true;
                while(!vowel){
                    result = result.substring(1, result.length()) + result.substring(0,1);
                    String first1 = result.substring(0,1);
                    vowel = first1.equals("a") || first1.equals("A") || first1.equals("e") || first1.equals("E") || first1.equals("i") || first1.equals("I") || first1.equals("o") || first1.equals("O") || first1.equals("u") || first1.equals("U");
                }
                result += "ay";
            }
            finalResult += result;
        }
        for(int i = 0; i<finalResult.length()-2; i++){
            String ay = finalResult.substring(i,i+2);
            if(ay.equals("ay")){
                finalResult = finalResult.substring(0,i+2) + " " + finalResult.substring(i+2);
            }
        }
        sc.close();
        
        //Check for capitalization
        if(convertUpper){
            finalResult = finalResult.substring(0,1).toUpperCase() + finalResult.substring(1,finalResult.length());
            //System.out.println(finalResult);
            
            //finalResult = finalResult.substring(0,finalResult.indexOf(first.toUpperCase())) +  first.lowerCase;
        }
        int period = finalResult.indexOf(".");
        if(period > 0){
            finalResult = finalResult.substring(0,period) + finalResult.substring(period + 1, finalResult.length()) + ".";
        }
        

        
        

        // TODO: Replace this code to correctly translate a single word.
        // Start here first!
        // This is the first place to work.
        // delete this line

        return finalResult;
    }

    /*private static String capitalization(String input, String result){
        for(int i=0; i<input.length(); i++){
            String letter = result.substring(i, i+1);
            int ascii = letter.compareTo(" ") + 32;
            int newLetter = ascii;
            if(i==0 && ascii>96){
                newLetter = ascii - 32;
            }else if(i>0 && ascii<97){
                newLetter = ascii + 32;
            }
            result = result.substring(0, i) + (char) newLetter + result.substring(i+1, result.length());
            
        }
        int period = result.indexOf("N");
        if(period > 0){
            result = result.substring(0,period) + result.substring(period + 1, result.length()) + ".";
        }
        return result;
    }*/

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)

}
