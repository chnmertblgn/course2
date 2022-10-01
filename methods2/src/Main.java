public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        int sum = addition(5, 6);
        String city = returnCity();
        int sum2 = addition2(2, 3, 4, 5, 6);

        System.out.println(sum);
        System.out.println(city);
        System.out.println(sum2);
    }

    public static void add() {
        System.out.println("Eklendi.");
    }

    public static void delete() {
        System.out.println("Silindi.");
    }

    public static void update() {
        System.out.println("Güncellendi.");
    }

    public static int addition(int number, int number2) {
        return number + number2;
    }

    public static int addition2(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static String returnCity() {
        return "Ankara";
    }
}