// Напишите игру Угадай число:
// компьютер "загадывает" целое число от (0 до 100], которое вам необходимо угадать
// после каждой неудачной попытки выводите подсказки: 
// System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер")
// если число угадано — System.out.println("Вы угадали!")
// игра продолжается до тех пор, пока число не будет угадано
class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 50;
        System.out.println("Введите число: ");
        int playerAnswer = 20;

        do {
            if(hiddenNumber < playerAnswer) {
                System.out.println("Введеное вами число " + playerAnswer + " больше того, что загадал компьютер");
            } else if(hiddenNumber > playerAnswer) {
                System.out.println("Введеное вами число " + playerAnswer + " меньше того, что загадал компьютер");
            } 
            System.out.println("Введите число: ");
            playerAnswer = 50;
        } while(hiddenNumber != playerAnswer);

        System.out.println("Вы угадали!");

    }
}