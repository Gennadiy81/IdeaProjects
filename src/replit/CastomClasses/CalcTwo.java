package replit.CastomClasses;

public class CalcTwo {

    private int y;
    private int x;
    private int result;

    public int setY(int one) {
        y = one;
        return y;
    }

    public int setX(int two) {
        x = two;
        return x;
    }

    public void plus() {
        result = y + x;
    }

    public void minus() {
        result = x - y;
    }

    public int getResult() {
        if (result == y + x) {
            return result;
        } else if (result == x - y) {
        }
        return result;
    }
}







