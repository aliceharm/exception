import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw2 {
    public static void main(String[] args) {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       
        while(work){
        System.out.print("Введите дробное число: ");
        try{
        float fNumber = Float.parseFloat(reader.readLine());
        System.out.printf("Введенное число равно %f\n", fNumber);
        work = false;
        } catch (IOException|NumberFormatException e) {
        System.out.println("Не вариант. Введите дробное число!");
                   }
       
               }

               foo1();
               try {
               int a = 90;
               int b = 3;
               System.out.println(a / b);
               printSum(23, 234);
               int[] abc = { 1, 2};
               abc[3] = 9;
               } catch (NullPointerException ex) {
               System.out.println("Голактеко опасносте! Указатель не может указывать на пустое!");
               } catch (IndexOutOfBoundsException ex) {
               System.out.println("Голактеко опасносте! Массив выходит за пределы своего размера!");
               } catch (Throwable ex) {
               System.out.println("Что-то пошло не так...");
                      }
              
                  }
               public static void printSum(Integer a, Integer b){
               System.out.println(a + b);
                  }
              
              
               // Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
               public static void foo1(){
               try {
               int[] intArray = {1,2,3,4,5,6,7,8,9};
               int d = 0;
               double catchedRes1 = intArray[8] / d;
               System.out.println("catchedRes1 = " + catchedRes1);
               } catch (ArithmeticException e) {
               System.out.println("Catching exception: " + e);
                      }
              
                  

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Введите любой текст кроме пустой строки");
 try {
 String result = reader.readLine();
 if(result.equals("")) throw new RuntimeException("Голактеко опасносте! Пустую строку вводить нельзя");

 System.out.println(result);
 } catch (IOException e) {
 throw new RuntimeException(e);
        }
    }
}     





    

