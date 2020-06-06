package CodingBlackFemales1;

public class Bear {
    public static void main(String[] args) {
        String drink = "water";
        String food = "grass";

        Animal bear = new Animal(food,drink);
        bear.eat();
        bear.drink();
    }


}
