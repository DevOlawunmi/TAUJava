package CodingBlackFemales1;



public class Animal {

    String food;
    String drink;
   public Animal(){}
    public Animal(String food, String drink){
this.food = food;
this.drink = drink;
    }
//    public String getFood(){
//        return food;
//    }
//    public void setFood(String food){
//        this.food = food;
//    }
    public void eat(){
        System.out.println("I am eating " + food);
    }
    public void drink(){
        System.out.println("I am drinking " + drink);
    }
}
