public class Khinkali extends Food {
    public Khinkali(int portions, int price) {
        super("Khinkali", portions, price, FoodType.SPICCY);
    }

    @Override
    int getCreationYear() {
        return 1234;//მახსოვს მე მოვახვიე
    }
}
