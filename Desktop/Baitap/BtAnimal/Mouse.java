public class Mouse extends Animal implements InterfaceAnimal{
    public Mouse() {
    }

    public Mouse(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 20;
    }

    @Override
    public String makeSound() {
        return "chit chit";
    }
}
