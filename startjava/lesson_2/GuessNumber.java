// GuessNumber — отвечает за сам процесс игры и логику ее работы
import java.util.*;

public class GuessNumber {
    Random random = new Random();
    public int hiddenNumber = random.nextInt(100);

    Scanner scan = new Scanner(System.in);

    public void play(Player player1, Player player2) {
        do {
            System.out.print(player1.getName() + " введите число: ");
            player1.setNumber(scan.nextInt());
            if(player1.getNumber() == hiddenNumber) {
                System.out.println(player1.getName() + " выйграл!!!");
                break;
            } 
            
            System.out.print(player2.getName() + " введите число: ");
            player2.setNumber(scan.nextInt());
            
            if(player2.getNumber() == hiddenNumber) {
                System.out.println(player2.getName() + " выйграл!!!");
                break;
            }
        } while(hiddenNumber != player1.getNumber() || hiddenNumber != player2.getNumber());
    }
}