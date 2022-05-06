public abstract class Food {
    enum FoodType{SPICCY,NORMAL,SWEET}
    String name;
    int portions, price;
    FoodType foodType;

    public Food(String name, int portions, int price, FoodType foodType) {
        this.name = name;
        this.portions = portions;
        this.price = price;
        this.foodType = foodType;
    }

    abstract int getCreationYear();

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", portions=" + portions +
                ", price=" + price +
                ", foodType=" + foodType +
                '}';
    }

    public class FoodPriceCalculator{
        public FoodPriceCalculator() {
        }
        public double calculateTotalPrice(){
            return portions*price;
        }
    }
}