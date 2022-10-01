public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 9, 0};
        int destinationNumber = 8;
        boolean exist = false;

        for (int number : numbers) {
            if (number == destinationNumber) {
                exist = true;
                break;
            }
        }

        if (exist) {
            printMessage("Say� var:"+destinationNumber);
        } else {
            printMessage("Say� yok:"+destinationNumber);
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}