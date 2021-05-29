package JavaClasses.day31_arrays;

import java.util.StringJoiner;

public class CharArrayImportant {
    public static void main(String[] args) {
        String word = " ";
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for (char each : letters){
            word += each;
            System.out.print(each);
        }
        String sentence = new String(letters);

        System.out.println();
        System.out.println(word);
        System.out.println(sentence);
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("item array " + itemArray.length);
        System.out.println("item.length() " + item.length());
        String fruitsStr = "";

        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};
                for (String each : fruits){
                    fruitsStr +=  each + " - ";
                }
        System.out.print(fruitsStr.substring(0, fruitsStr.length()-2));

                String[] languages = { "java", "python", "c++", "sql", "ruby"};
        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages  = String.join(" <> ", languages);
        System.out.println("joinedLanguages = " + joinedLanguages);

        }

    }

