public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        int total = returnTotal(5, 6);
        String city = returnCity();
        int total2 = returnTotal2(2, 3, 4, 5, 6);

        System.out.println(total);
        System.out.println(city);
        System.out.println(total2);
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

    public static int returnTotal(int number, int number2) {
        return number + number2;
    }

    public static int returnTotal2(int... numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    public static String returnCity() {
        return "Ankara";
    }
}