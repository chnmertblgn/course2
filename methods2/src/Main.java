public class Main {
    public static void main(String[] args) {
        String message = "Bug�n hava �ok g�zel.";
        int total = returnTotal(5, 6);
        String city = returnCity();

        System.out.println(total);
        System.out.println(city);
    }

    public static void add() {
        System.out.println("Eklendi.");
    }

    public static void delete() {
        System.out.println("Silindi.");
    }

    public static void update() {
        System.out.println("G�ncellendi.");
    }

    public static int returnTotal(int number, int number2) {
        return number + number2;
    }

    public static String returnCity() {
        return "Ankara";
    }
}