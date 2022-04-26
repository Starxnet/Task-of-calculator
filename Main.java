public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(3, 5));
        System.out.println(intsCalc.mult(15, 45));
        System.out.println(intsCalc.pow(3, 22));
    }
}