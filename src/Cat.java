public class Cat implements Files {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void flies() {
        System.out.println("Cat now Flies");
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name: " + name + "\n" +
                "age: " + age +"\n"+
                "color: " + color + "\n";
    }
}
