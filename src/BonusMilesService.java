public class BonusMilesService {
    public int calculate (int price) {

        int forBonus = 20;
        int miles = price / forBonus;

        return miles;
    }
}
