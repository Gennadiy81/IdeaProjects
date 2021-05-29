package homeWork.March_22;

public class CheckName {
    public static void main(String[] args) {
        String fullName = "james bond";
        String lastName = "bond";
        if(fullName.endsWith("bond") && lastName.endsWith("bond")){
                System.out.println("Same last name");
            }else{
                System.out.println(" Not the same last name");
            }
        String fullName1 = "alex benji";
        String lastName2 = "bond";
        if(fullName.endsWith("banji") && lastName.endsWith("bond")){
            System.out.println("Same last name");
        }else{
            System.out.println("Not the same last name");
        }
        }
    }
//}
