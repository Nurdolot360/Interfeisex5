public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Kuku",3,"blue");
        parrot.flies();
        System.out.println(parrot);

        Eagle eagle = new Eagle("Xishi",6,"brown");
        eagle.flies();
        System.out.println(eagle);

        Cat cat = new Cat("mimi",4,"white");
        cat.flies();
        System.out.println(cat);


    }
}