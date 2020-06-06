package CodingBlackFemales1;

public class Vampire {
    public static void main(String[] args) {
        String food = "flesh";
        String drink = "blood";
        Animal vampire = new Animal(food,drink);
        vampire.drink();
        vampire.eat();
        Animal snail = new Animal();
        snail.drink = "dew";
        snail.food = "leaves";
        snail.eat();
        snail.drink();
    }





}
