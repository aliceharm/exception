import java.util.Random;

public class hw1 {
     public static void main(String[] args) {
 String[] sArray = {"first str", null, "third str"};
 int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
 division(10, 0);
 printValueByIndex(array,12);
 printStringArray(sArray);
 int[] firstArray = getFilledArray(10);
 int[] secondArray = getFilledArray(9);

 int[] divArray = divArrays(firstArray, secondArray);

    }
 // division by zero
 public static void division(double firstNum, double secondNum){
 if(secondNum == 0) throw new ArithmeticException("Голактеко опасносте! делим на ноль");
 double result = firstNum/secondNum;
 System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }
 // out of bounds
 public static void printValueByIndex(int[] array, int index){
 if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Голактеко опасносте! такого не существует");
 else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

 // Null pointer exception
 public static void printStringArray(String[] sArray){
 for (String item: sArray){
 if(item == null) throw new NullPointerException("Голактеко опасносте! Элемент отсутствует!!!");
 System.out.println(item);
        }
    }
   
    public static int[] divArrays(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) throw new RuntimeException("Длины массивов не равны!!!");
        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
        resultArr[i] = firstArray[i] - secondArray[i];
               }
        return resultArr;
           }
       
        public static int[] getFilledArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
        array[i] = rnd.nextInt(20);
               }
        return array;
           }



}
