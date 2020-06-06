package CodingBlackFemales1;

public class Vampire {
    public static void main(String[] args) {
        String food = "flesh";
        String drink = "blood";
        Animal vampire = new Animal(food,drink);
        vampire.drink();
        vampire.eat();
    }

}
