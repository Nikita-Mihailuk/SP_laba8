public class Main {
    public static void main(String[] args) {

        int money = 15;
        int price = 1;
        int chocolate = money / price;

        int allChocolate = chocolate + chocolateForWrap(chocolate);

        System.out.println(allChocolate);
    }
    public static int chocolateForWrap(int wrap){
        if (wrap < 3) {
            return 0;
        }
        int additionalChocolate = wrap / 3;
        int remainingWrappers = wrap % 3;
        return additionalChocolate + chocolateForWrap(additionalChocolate + remainingWrappers);
    }
}