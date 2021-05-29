package homeWork.March_18;

public class EligibleForLoan {
    public static void main(String[] args){
        double salary = 50_000;
        int creditScore = 600;
        String loanApprovedOrNot = (salary > 60_000) && (creditScore > 650) ?
                "Loan Approved" :  "Loan Denied";

        System.out.println(loanApprovedOrNot);
    }
}
