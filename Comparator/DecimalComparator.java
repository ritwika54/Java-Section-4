public class DecimalComparator {

    public static boolean areEqualThreeDecimalPlaces(double firstValue, double secondValue) {
        int moveThreeDecimalPlacesToright = (int) Math.pow(10, 3);
        return (int) (firstValue * moveThreeDecimalPlacestoright) == (int) (secondValue * moveThreeDecimalPlacestoright);
    }
}
