public class Main {
    public static void main(String[] args) {
        String fullString = "Пример строки";
        String stringLeft;
        String stringRight;

        if (fullString.length() % 2 != 0) {
            fullString = fullString + ' ';
        }

        stringLeft = fullString.substring(0, fullString.length() / 2);
        stringRight = fullString.substring(fullString.length() / 2, fullString.length() - 1);
        stringRight = stringRight + fullString.charAt(fullString.length() - 1);
        System.out.println(stringLeft);
        System.out.println(stringRight);

    }
}