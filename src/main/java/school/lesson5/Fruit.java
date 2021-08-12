package school.lesson5;

public class Fruit {
    private float weight;
    private String name;

    public Fruit(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}