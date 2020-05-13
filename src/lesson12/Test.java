package lesson12;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(Currency.EUR); //вывод энама
        System.out.println(Arrays.toString(Currency.values())); // метод values() возвращает массив всех констант в энаме
        String usd = "USD";
        Currency usdConverted = Currency.valueOf(usd); // Converted конвертирует

        System.out.println(Currency.valueOf("USD"));// valueOf принимает стринг и возвращает тип энама

        System.out.println(usdConverted); // аналогично
    }

}
