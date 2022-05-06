public class PotatoSpagetti extends Food {
    public PotatoSpagetti(int portions, int price) {
        super("PotatoSpagetti", portions, price, FoodType.NORMAL);
    }

    @Override
    int getCreationYear() {
        return 1868;
    }

}

