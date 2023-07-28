package HW02;

import java.util.Scanner;

public class Task04 {
    /*
    4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        throwExIfEmpty(scanner.nextLine());
    }
    public static void throwExIfEmpty(String input){
        if(input.matches("\\s*")){
            throw new RuntimeException("Пустые строки вводить нельзя! :(");
        } else {
            System.out.println(":)");
        }
    }
}
