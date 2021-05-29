package homeWork.March_30;

public class CountUpperLowerLettersAndNumbers {
    public static void main(String[] args){
        String word = "2juMp41EEkd4s4";
        int upper = 0, lower = 0, numbers = 0;
        //int total = 0;
        for (int i = 0; i < word.length(); i++){
          char total = word.charAt(i);

        if (total >= 'A' && total <= 'Z'){
            upper++;
        }else if(total >= 'a' && total <= 'z'){
            lower++;
        }else if (total >= '0' && total <= '9') {
            numbers++;
        }
        }
        System.out.println(upper + " uppercase letters");
        System.out.println(lower + " lowercase letters");
        System.out.println(numbers + " numbers");
    }
}
