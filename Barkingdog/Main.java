public class Main {

    public static void main(String[] args) {
        boolean barking = BarkingDog.shouldWakeUp(true, 9);
        System.out.println(barking);

        barking = BarkingDog.shouldWakeUp(false, 7);
        System.out.println(barking);
    }
}
