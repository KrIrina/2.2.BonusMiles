public class BonusMilesService {
    public int calculate(int cost) {
        int bonusMile = 20;
        int totalMiles = cost / bonusMile;
        return totalMiles;
    }
}
