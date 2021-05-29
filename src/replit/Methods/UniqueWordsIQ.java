package replit.Methods;

public class UniqueWordsIQ {
    public static void main(String[] args) {
        String[] arr = {"java", "code", "python", "code", "rust", "code", "rust"};
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)
            System.out.println(arr[i]);

        }

    }
}
