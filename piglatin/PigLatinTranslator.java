package piglatin;

import java.util.Scanner;

public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();
        for(int i=0;i<input.getLineCount();i++){
            String translatedLine = translate(input.getLine(i));
            System.out.println(translatedLine);
            translatedBook.appendLine(translatedLine);
        }
        
        //System.out.println(input.getLine(4));
        // TODO: Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times. --> loop
      
        System.out.println("Final Translation: " + translatedBook);
        return translatedBook;
    }

    public static String translate(String input) {
        //System.out.println("hiiii");
        System.out.println("  -> translate('" + input + "')");

        String result = "";
        Scanner scan = new Scanner(input);
        while(scan.hasNextLine()){
            result += translateWord(scan.nextLine());
        }
        scan.close();
        System.out.println(result);
        // TODO: translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.

        return result;
    }

    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");

        String result = input.trim();
        if(result.length()==0){
            return result;
        }
        String vowel = "aeiouAEIOU";
        Scanner sc = new Scanner(input);
        String finalResult = "";

        while(sc.hasNext()){
            result = sc.next();
            System.out.println(result);
            char first = result.charAt(0);
            int initialLength = result.length();
            int indexOfVowel = 0;
            if(vowel.indexOf(first)>-1){
                result += "ay";
            }else{
                for(int i=0; indexOfVowel==0; i++){
                    String letter = result.substring(i,i+1);
                    if(vowel.indexOf(letter)>-1){
                        indexOfVowel = i;
                    }
                }
                result = result.substring(indexOfVowel) + result.substring(0,indexOfVowel) + "ay";
                int indexOfCons = initialLength - indexOfVowel;
                if(Character.isUpperCase(first)){
                    result = result.substring(0,1).toUpperCase() + result.substring(1,indexOfCons) + result.substring(indexOfCons,indexOfCons+1).toLowerCase() + result.substring(indexOfCons+1);
                }
            }
            if(result.indexOf(".")>-1){
                result = result.substring(0,result.indexOf(".")) + result.substring(result.indexOf(".") + 1) + ".";
            }
            
            finalResult += result;
            if(sc.hasNext()){
                finalResult += " ";
            }
        }
        //Add spaces between multiple words
        sc.close();      
        
        
        
        
        
        
        
        
        
        
        
        /*if(first.compareTo(" ") + 32 <97){
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
            if(first.compareTo(" ") + 32 <97){
                result = checkCaps(first, result);
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
        /*if(convertUpper){
            finalResult = finalResult.substring(0,1).toUpperCase() + finalResult.substring(1,finalResult.length());
            //System.out.println(finalResult);
            
            //finalResult = finalResult.substring(0,finalResult.indexOf(first.toUpperCase())) +  first.lowerCase;
        }*/
        /*int period = finalResult.indexOf(".");
        if(period > 0){
            finalResult = finalResult.substring(0,period) + finalResult.substring(period + 1, finalResult.length()) + ".";
        }*/
        

        
        

        // TODO: Replace this code to correctly translate a single word.
        // Start here first!
        // This is the first place to work.
        // delete this line

        return finalResult;
    }

    //Check capitalization
    private static String checkCaps(String first, String result){
        String result1 = first.toUpperCase() + result.substring(0,result.length());
        return result1;
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
