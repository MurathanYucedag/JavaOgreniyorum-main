public class PopulationCalculation {

    public static void main(String[] args) {
        int TotalSecond;
        float birth, death, immig, Population;

        TotalSecond = 365 * 5 * 86400;
        birth = TotalSecond / 7;
        death = TotalSecond / 13;
        immig = TotalSecond / 45;

        Population = 312032486 + birth + immig - death;

        System.out.println(Population);
    }

}


