public class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private int speed;

    private String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    private float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    private float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // ===============    Methods of robot    ====================
    public void move() {
        System.out.println(getModelName() + " can move " + getSpeed() + " km/h");
    }

    public String call() {
        return (getModelName() + " mark: " + getMark());
    }

    public void robotSize() {
        System.out.println(getModelName() + " has: " + getHeight() + "m height and " + getWeight() + " tons weight");
    }
}