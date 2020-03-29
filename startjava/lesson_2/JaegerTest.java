// Модифицируйте класс Jaeger, сделав его универсальным (без инициализации полей в самом классе,
// как мы это делали в уроке).
// Это позволит на его основе создавать любого робота:
public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Avenger");
        jaegerOne.setMark("Mark-6");
        jaegerOne.setHeight(81.77f);
        jaegerOne.setWeight(2000.4f);
        jaegerOne.setSpeed(200);

        jaegerOne.move();
        System.out.println(jaegerOne.call());
        jaegerOne.robotSize();

        System.out.println();

        Jaeger jaegerTwo = new Jaeger();
        jaegerOne.setModelName("Saber Athena");
        jaegerOne.setMark("Mark-7");
        jaegerOne.setHeight(76.91f);
        jaegerOne.setWeight(1.628f);
        jaegerOne.setSpeed(220);

        jaegerOne.move();
        System.out.println(jaegerOne.call());
        jaegerOne.robotSize();
    }
}