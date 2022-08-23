public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = 25;  

        String forecast = "";

        if (temp >= -15 && temp < -1) {
             forecast = "The forecast is FREEZING! Stay home!";
        }
        else if (temp >= 0 && temp <= 10) {
            forecast = "The forecast is CHILLY. Wear a coat!";
        }
        else {
            forecast = "It's WARM. Go outside!";
        }

        System.out.println(forecast);
    }
}
