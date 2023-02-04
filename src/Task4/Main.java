package Task4;

public class Main {
    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation min = (x, y) -> x - y;
        Operation mul = (x, y) -> x * y;
        Operation dev = (x, y) -> x / y;
        System.out.println("\"(x, y) -> x + y\" (10, 20) = " + add.calculate(10,20));
        System.out.println("\"(x, y) -> x - y\" (10, 20) = " + min.calculate(10,20));
        System.out.println("\"(x, y) -> x * y\" (10, 20) = " + mul.calculate(10,20));
        System.out.println("\"(x, y) -> x / y\" (10, 20) = " + dev.calculate(10,20));
    }
}
interface Operation {
    int calculate(int x, int y);
}