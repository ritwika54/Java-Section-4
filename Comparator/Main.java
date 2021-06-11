public class Main {

    public static void main(String[] args) {
        boolean areEqualByThreeDecimalPlaces = DecimalComparator.areEqualByThreeDecimalPlaces(3.985, 3.155);
        System.out.println(areEqualByThreeDecimalPlaces);

        areEqualByThreeDecimalPlaces = DecimalComparator.areEqualByThreeDecimalPlaces(9.0, 9.0);
        System.out.println(areEqualByThreeDecimalPlaces);
    }
}
