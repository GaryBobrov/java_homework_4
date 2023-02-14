public class BonusMilesService {

    public int calculate(int price) {
        int result;
        if (price > 1000) {
            result = price / 100;
        } else {
            result = 0;
        }
        return result;
    }
}
