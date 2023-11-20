package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        double remainder = numberToBeRounded - (int) numberToBeRounded;
        if (remainder >= 0.5) {
            numberToBeRounded = (int) numberToBeRounded + 1;
            System.out.println((int) numberToBeRounded);
        } else {
            System.out.println((int) numberToBeRounded);
        }
    }
}
