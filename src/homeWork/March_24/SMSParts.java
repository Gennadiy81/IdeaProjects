package homeWork.March_24;

public class SMSParts {
    public static void main(String[] args) {
        String sentence = "Sender: <James Bond>. From Number: [202-123-3456]. + " +
                "Message: {I love programming and problem solving}";
        int sender = sentence.indexOf("<");
        int sender2 = sentence.indexOf(">");
        System.out.println(sentence.substring(sender+1, sender2));
        int number = sentence.indexOf("[");
        int number2 = sentence.indexOf("]");
        System.out.println(sentence.substring(number+1, number2));
        int message = sentence.indexOf("{");
        int message2 = sentence.indexOf("}");
        System.out.println(sentence.substring(message+1, message2));

    }
}
