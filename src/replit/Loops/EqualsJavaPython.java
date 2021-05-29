package replit.Loops;

public class EqualsJavaPython {
    public static void main(String[] args) {
        String sentence =" i love jova not python";
        int javaNumber = 0;
        int pythonNumber = 0;
        for(int i = 0; i <= sentence.length()-4; i++){
            String javaWord = sentence.substring(i, i + 4);
            if(javaWord.equals("java")){
                javaNumber++;
            }
        }
        for(int n = 0; n <= sentence.length()-6; n++){
            String pythonWord = sentence.substring(n, n + 6);
            if(pythonWord.equals("python")){
                pythonNumber++;
            }
        }
        if(javaNumber == pythonNumber){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    }

