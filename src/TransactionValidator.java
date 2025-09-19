public class TransactionValidator {
    // объявите константы
    public static final double MIN_AMOUNT = 1.0;
    public static final double MAX_AMOUNT  = 5000.0;
    public static boolean isValidAmount(Double amount){
        if (amount == null){
            return false;
        }
        if (amount >= MIN_AMOUNT && amount<= MAX_AMOUNT){
            return true;
        }
        else {
            if (amount<MIN_AMOUNT){
                System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            }
            if (amount>MAX_AMOUNT){
                System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            }
            return false;
        }
    }
    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода


}
