import java.util.Random;
import java.util.Scanner;

public class Tablica {

    public static void main(String[] args) {
        int[] anArrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] anArrayTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int answer;
        int firstNumber = new Random().nextInt(anArrayOne.length);
        int secondNumber = new Random().nextInt(anArrayTwo.length);

    System.out.println("Ile jest " + firstNumber + " razy " + secondNumber + "? ");

    Scanner result = new Scanner(System.in);
    answer = result.nextInt();
//zrób while ??
    if (answer == (firstNumber*secondNumber)){
        System.out.println("Brawo!!!");
        }
        else{
        System.out.println("ŹlE :( ");
        //System.exit(0);
    }
    }


}

