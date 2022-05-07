import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zahlenraten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pcNumber = (int) (Math.random() * (19) + 1);
        List<Integer> zahlen = new ArrayList<Integer>();
        boolean game = true;
        System.out.println("*** Zahlenraten ***");
        System.out.println("Ich habe mir eine Zahl zwischen 1 und 20 ausgedacht. Welche ist es wohl?");
        while (game) {
            int a = input.nextInt();
            zahlen.add(a);
            switch (numberCheck(a, pcNumber)) {
                case 0:
                    System.out.println("Gewonnen! Du hast dafür " + zahlen.size() + " Versuche gebraucht!");
                    System.out.println(zahlen.toString());
                    game = false;
                    break;
                case 1:
                    System.out.println("Nope! Meine Zahl ist kleiner!");
                    break;
                case 2: 
                    System.out.println("Nope! Meine Zahl ist größer!");
                    break;
            }
        }
    }
    
    public static int numberCheck(int a, int b) {
        if (a == b) {
            return 0;
        }
        else if (a > b) {
            return 1;
        } else {
            return 2;
        }
    }
}
