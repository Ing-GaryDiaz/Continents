public class Continents {

    String continentName;
    String largestCity;

    public Continents(int continent) {
        switch (continent) {
            case 1:
                continentName = "North America";
                largestCity = "Mexico City, Mexico";

                break;
            case 2:
                continentName = "South America";
                largestCity = "Sao Paulo, Brazil";

                break;
            case 3:
                continentName = "Europe";
                largestCity = "Moscow, Rusia";

                break;
            case 4:
                continentName = "Africa";
                largestCity = "Lagos, Nigeria";


                break;
            case 5:
                continentName = "Asia";
                largestCity = "Shanghai, China";

                break;
            case 6:
                continentName = "Australia";
                largestCity = "Sydney, Australia";

                break;
            case 7:
                continentName = "Antarctica";
                largestCity = "McMurdo Station, US";

            default:
                continentName = "Undefined Continent";
                largestCity = "Undefined City";

        }
    }

    public String toString() {
        return "Continent Name: " + continentName + "\nLargest City: " + largestCity;
    }

}
