package CodingBlackFemales1;

public class Man {
    public static void main(String[] args) {
        String food = "meat";
        String drink = "beer";
        Animal man = new Animal(food,drink);
        man.eat();
        man.drink();
    }
}
