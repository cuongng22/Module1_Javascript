public class Dog extends Animal implements InterfaceAnimal {

    @Override
    public int run() {
        return 60;
    }

    @Override
    public String makeSound() {
        return "gau gau";
    }

    public Dog() {
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void trongNha() {
        System.out.println("đang trông nhà nha anh zai");
    }


}