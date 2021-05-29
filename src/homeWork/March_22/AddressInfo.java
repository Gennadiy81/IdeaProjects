package homeWork.March_22;

public class AddressInfo {
    public static void main(String[] args) {
        String addressInfo = "300 S Fay St \nLombard, IL 60548";
        if(addressInfo.isEmpty()){
            System.out.println("No address found");
        }else{
            System.out.println(addressInfo.toUpperCase());
        }
    }
}
