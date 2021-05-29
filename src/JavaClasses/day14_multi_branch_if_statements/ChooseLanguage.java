package JavaClasses.day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language");
        int language = 10;
        if(language == 1){
            System.out.println("Hallo, thank for your call");

        }else if(language == 2){
            System.out.println("hola, gracias para llamar");
        }else if(language == 3){
            System.out.println( "merhaba, aradiginiz icin tesekkurler");
        }else if(language == 4){
            System.out.println("privet, spasibo za vash zvonok");
        }else if (language == 5){
            System.out.println( "Merci ,pour votre appel");
        }else{
            System.out.println( "lets talk java and english, hello");
        }
    }
}
