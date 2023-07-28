package HW02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
        /*
        Task 01:
        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        и возвращает введенное значение.
        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
        необходимо повторно запросить у пользователя ввод данных.

         */
        public static void main(String[] args) {
//            String s = "a";
//            Integer i = Integer.parseInt(s);
            System.out.println(returnValue());
        }
        public static float returnValue(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter float: ");
            while (true){
                String input = scan.next();
                try{
                    return Float.parseFloat(input);
                } catch (NumberFormatException | InputMismatchException e){
                    System.err.println("Please enter float: ");
                }
            }
        }
}
