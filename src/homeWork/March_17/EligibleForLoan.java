package homeWork.March_17;

public class EligibleForLoan {
    public static void main(String[] args){
        int salary = 50_000, creditScore = 555;
       String goodSalary = (salary > 60_000) ? "Loan Approved" : "Loan Denied";
        System.out.println(goodSalary);
       String goodCreditScore = (creditScore > 650) ? "Loan Approved" : "Loan Denied";
        System.out.println(goodCreditScore);



    }
}
