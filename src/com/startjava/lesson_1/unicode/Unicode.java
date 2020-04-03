// Выведите в цикле символы кодировки Unicode в диапазоне [9398, 10178].
// Если выводятся кракозябры, то [33, 126]
package com.startjava.lesson_1.unicode;

class Unicode {
    public static void main(String[] args) {
        for(int i = 33; i <= 126; i++) {
            System.out.println(i + " - " + (char)i);
        }
    }
}