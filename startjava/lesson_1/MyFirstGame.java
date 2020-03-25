// Напишите игру Угадай число:
// компьютер "загадывает" целое число от (0 до 100], которое вам необходимо угадать
// после каждой неудачной попытки выводите подсказки: 
// System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер")
// если число угадано — System.out.println("Вы угадали!")
// игра продолжается до тех пор, пока число не будет угадано
class MyFirstGame {
    public static void main(String[] args) {
        int compNum = 50;
        int myNum;

        do {
            myNum = 50;
            if(myNum > compNum) {
                System.out.println("Введеное вами число больше того, что загадал компьютер");
            } else if(myNum < compNum) {
                System.out.println("Введеное вами число меньше того, что загадал компьютер");
            } else if(myNum == compNum) {
                System.out.println("Вы угадали!");
            }
        } while(myNum != compNum);
    }
}