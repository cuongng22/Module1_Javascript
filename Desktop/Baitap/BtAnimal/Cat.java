public class Cat extends Animal implements InterfaceAnimal{

    public Cat(String name, int age, double weight) {
    }

    public Cat(String name, int age, double weight, String color) {
        super(name, age, weight);
    }

    public void eatMouse() {
        System.out.println("a bắt dc rùi nha");
    }

    @Override
    public int run() {
        return 30;
    }

    @Override
    public String makeSound() {
        return "meowww";
    }


}
