package lesson12_interfaces.II_YearSeasons;

public class Main {
    public static void printSeasonMessage(Seasons.Season season) {
        switch (season) {
            case WINTER:
                System.out.println("I like winter.");
                break;
            case SPRING:
                System.out.println("I like spring.");
                break;
            case SUMMER:
                System.out.println("I like summer.");
                break;
            case AUTUMN:
                System.out.println("I like autumn.");
                break;
        }
    }

    public static void main(String[] args) {
        //set favorite season
        Seasons.Season favoriteSeason = Seasons.Season.SUMMER;

        //output of favorit season info
        System.out.println("My favorite season is: " + favoriteSeason);
        System.out.println("Average temperature is: " + favoriteSeason.getAverageTemperature());
        System.out.println("Description: " + favoriteSeason.getDescription());

        //switch method
        System.out.println();
        printSeasonMessage(favoriteSeason);

        // loop for all seasons' info
        System.out.println();
        System.out.println("Seasons description:");
        for (Seasons.Season season : Seasons.Season.values()) {
            System.out.println(season + ":" +
                    "\n\tTemperature: " + season.getAverageTemperature() + "°C." +
                    "\n\tDescription: " + season.getDescription());
        }
    }
}
