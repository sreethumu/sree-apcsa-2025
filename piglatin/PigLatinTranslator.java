package piglatin;

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

        String result = input;
        String first = input.substring(0,1);
        boolean vowel = first.equals("a") || first.equals("A") || first.equals("e") || first.equals("E") || first.equals('i') || first.equals('I') || first.equals("o") || first.equals("O") || first.equals("u") || first.equals("U");

        if(vowel){
            result += "ay";
        }else{
            
            while(!vowel){
                result = result.substring(1, result.length()) + result.substring(0,1);
                first = result.substring(0,1);
                vowel = first.equals("a") || first.equals("A") || first.equals("e") || first.equals("E") || first.equals('i') || first.equals('I') || first.equals("o") || first.equals("O") || first.equals("u") || first.equals("U");
                if(!vowel){
                    break;
                }
            }
            result += "ay";
        }
        // TODO: Replace this code to correctly translate a single word.
        // Start here first!
        // This is the first place to work.
        // delete this line

        return result;
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)

}
