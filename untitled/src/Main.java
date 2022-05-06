public class Main {
    public static  void main(String[] args)
    {
        Food fd[] = {new Khinkali(2,3), new PotatoSpagetti(4,3)};

        for (int i=0; i<fd.length; i++){
            System.out.println(fd[i].toString());
            System.out.println(fd[i].getCreationYear());
            Food.FoodPriceCalculator fpc = fd[i].new FoodPriceCalculator() ;
            System.out.println(fpc.calculateTotalPrice());
        }
    }
}
