public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        int sum;
        int difference;
        int multiplication;
        double division;

        sum = math.Addition(2, 3);
        difference = math.Subtract(2,3);
        multiplication = math.Multiply(2,3);
        division = math.Divide(5,3);

        System.out.println("Toplama:" + sum);
        System.out.println("Çýkarma:" + difference);
        System.out.println("Çarpma:" + multiplication);
        System.out.println("Bölme:" + division);
    }
}
