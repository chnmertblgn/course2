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
        System.out.println("��karma:" + difference);
        System.out.println("�arpma:" + multiplication);
        System.out.println("B�lme:" + division);
    }
}
