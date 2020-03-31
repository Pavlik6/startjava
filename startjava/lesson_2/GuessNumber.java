// GuessNumber — отвечает за сам процесс игры и логику ее работы
import java.util.*;

public class GuessNumber {
    private String namePlayer1;
    private String namePlayer2;
    private int numPlayer1;
    private int numPlayer2;
    private int setNumPlayer1;
    private int setNumPlayer2;
    String answer;

    public GuessNumber(Player player1, Player player2) {
        this.namePlayer1 = player1.getName();
        this.namePlayer2 = player2.getName();
        this.numPlayer1 = player1.getNumber();
        this.numPlayer2 = player2.getNumber();
    }

    Random random = new Random();
    public int hiddenNumber = random.nextInt(101);

    Scanner scan = new Scanner(System.in);

    public void play() {
        do {
            System.out.print(namePlayer1 + " введите число: ");
            setNumPlayer1(scan.nextInt());
            if(numPlayer1 == hiddenNumber) {
                System.out.println(namePlayer1 + " выйграл!!!");
                System.out.print("Хотите продолжить? [yes/no]:");
                answer = scan.nextLine();

                if(answer.equals("no"))  break;
            } 
        } while(answer.equals("yes"));

        System.out.println(namePlayer1);
        System.out.println(namePlayer2);
    }
}