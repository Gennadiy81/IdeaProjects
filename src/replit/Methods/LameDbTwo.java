package replit.Methods;

public class LameDbTwo {
    public static void main(String[] args) {
        String result = "";
        String db = "1etsy#2wooden#3spoon";
        String op = "add";
        String id = "1";
        String data = "aaa";
        String[] arr = db.split("#");
        int num = Integer.parseInt(id);
           if (op.equals("add")){
                switch (id){
                    case "1":
                        result +=id +  data ;
                        for (int i = 0; i < arr.length; i++) {
                            result += "#" + (i + 2) + "" + arr[i].substring(1);
                            break;

                        }
                }
            }
        System.out.println(result);
        }


    }

