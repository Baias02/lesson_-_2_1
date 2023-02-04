public class Main {
    public static void main(String[] args) {
        System.out.println(GoPark(54, -43));
        System.out.println(GoPark(22, 1));
        System.out.println(GoPark(18, 10));
        System.out.println(GoPark(15, -8));
        System.out.println(GoPark(10, 27));
    }

    public static String GoPark(int years, int temperatura) {
        if (years > 20 && years < 45 && temperatura > -20 && temperatura < 30) {
            return "Можно идти гулять. ";
        } else if (years < 20 && temperatura > 0 && temperatura < 28) {
            return "Можно идти гулять.";
        } else if (years > 45 && temperatura > -10 && temperatura < 25) {
            return "Можно идти гулять.";
        } else {
            return "Оставайтесь дома.";

        }
    }
}