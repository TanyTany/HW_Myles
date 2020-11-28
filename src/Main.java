public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

//       Код от первой задачи:
//        int price = 3500;
//        int forBonus = 20;
//        int miles = price / forBonus;
//
//        System.out.println(miles);


    }
}
