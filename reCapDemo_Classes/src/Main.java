public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        int sum;
        int difference;
        int multiplication;
        double division;

        sum = math.addition(2, 3);
        difference = math.subtract(2,3);
        multiplication = math.multiply(2,3);
        division = math.divide(5,3);

        System.out.println("Toplama:" + sum);
        System.out.println("Çýkarma:" + difference);
        System.out.println("Çarpma:" + multiplication);
        System.out.println("Bölme:" + division);
    }
}
