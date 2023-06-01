package preparation.exercise1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int comp = rand.nextInt(9)+1;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Tell me your next number");
            int user = sc.nextInt();

            if (user == comp){
                System.out.println("Congrats");
                break;
            } else {
                System.out.println("Incorrect Number");
            }
        }while (true);



    }
}
