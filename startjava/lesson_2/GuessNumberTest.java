// Модифицируйте программу Угадай число:
// реализуйте класс GuessNumber, Player и GuessNumberTest
// создайте двух игроков, которые по очереди будут пытаться угадать число, загаданное компьютером
// введите с клавиатуры в начале игры имена каждого игрока
// все объекты, создаваемые в программе, инициализируйте с помощью конструкторов
// для генерации компьютером псевдослучайного числа в диапазоне от 0 до 100 используйте класс Random или Math.random()
import java.util.*;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);

        String answer;

        do {
            game.play();
            game.question();
            
            answer = game.answerCall();

            if(answer.equals("no")) break;

            while (!answer.equals("yes")) {
                game.question();
                answer = game.answerCall();
            }
        } while(answer.equals("yes"));
    }
}