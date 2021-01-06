import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int i = 0;
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) { 
          i = sc.nextInt(); 
          if (i%2 == 0){
            System.out.println("Число" + " " + i + " " + "четное");
          } else {
          System.out.println("Вы ввели не четное целое число");
        }
      }
    }
}
