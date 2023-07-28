package HW02;

import java.io.FileNotFoundException;

public class Task03 {
    /*
        3. Дан следующий код, исправьте его там, где требуется
        (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
     */
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(a,b);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль не допустимо!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NumberFormatException e){
            System.out.println("Не совместимость типов!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println("a + b = "+ (a + b));
    }


}
