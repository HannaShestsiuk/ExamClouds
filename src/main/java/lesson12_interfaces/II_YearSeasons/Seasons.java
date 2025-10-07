package lesson12_interfaces.II_YearSeasons;

public class Seasons {
    public enum Season {
        WINTER(-10),
        SPRING(10),
        SUMMER(25) {
            @Override
            public String getDescription() {
                return "This is Warm Season.";
            }
        },
        AUTUMN(8);

        private final int averageTemperature;

        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return "This is Cold Season.";
        }
    }
}
