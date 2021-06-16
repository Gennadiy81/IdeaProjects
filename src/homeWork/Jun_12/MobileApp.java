package homeWork.Jun_12;

public class MobileApp {
    String name;
    double version;
    static double budget;
    double appCost;
    double percent;
    {
        System.out.println("my name");
    }
    public MobileApp(String name, double version, double appCost){
        this.name = name;
        this.version = version;
        this.appCost = appCost;

    }
    public double percentageFee(double percent){
        this.percent = percent;
        return budget -= appCost /100 * percent;
    }

    private void payed(double cost) {
        if (budget >= cost) {
            budget -= cost;

        } else {
            System.out.print("Out of budget my budget is - " +  budget);
        }
    }

    public void setAppCost() {
        payed(appCost);
        if(appCost <= budget){
            System.out.println("Payed for - " + name + " " + appCost + "$ ");
        }else {
            System.out.println(" I can't pay for - " + name + " " + appCost);
        }



    }
}


