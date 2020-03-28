// Модифицируйте класс Wolf
// у всех полей класса напишите модификатор доступа private
// у всех методов класса напишите модификатор доступа public
// для доступа к полям создайте геттеры и сеттеры
// в сеттере поля age реализуйте проверку: если возраст волка > 8 лет, 
// то выведите сообщение "Некорректный возраст"
public class Wolf {
    private String gender;
    private String nickname;
    private int weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println(nickname + " is walking");
    }

    public void sit() {
        System.out.println(nickname + " is sitting");
    }

    public void run() {
        System.out.println(nickname + " is running");
    }

    public void howl() {
        System.out.println(nickname + " is howling");
    }

    public void hunt() {
        System.out.println(nickname + " is hunting");
    }
}