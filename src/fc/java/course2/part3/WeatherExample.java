package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey = "87068e8ba5230f0d5aa1ac0233e0be1f";//내 고유key 공유X
        String city = "Soul";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application");

            int responseCode = connection.getResponseCode(); //200
            if (responseCode == 200) {
                //스트림(Stream=입력,출력)의 연결
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                //HttpURLConnection을 이용하면 위와 같은 식이 전형적!
                //중간InputStreamReader는 server와 client간에 정보이동중 한글깨짐을 보완하기위해 사용
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                System.out.println("content=" + content.toString());
                //{          }를 객체로 받으려고 아래와 같이 식을 씀
                JsonObject weatherData=JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData=weatherData.getAsJsonObject("main");
                //"main":{"temp":11.89,"feels_like":11.07,"temp_min":10.69,"temp_max":12.66,"pressure":1005,"humidity":74}
                double temp=mainData.get("temp").getAsDouble();
                System.out.println("temp="+temp);
                connection.disconnect();
            } else {
                //오류
            }

        } catch (Exception e) { //예외처리
            e.printStackTrace();//에러메세지 출력
        }
    }

    //1차 결과값: content={"coord":{"lon":126.9778,"lat":37.5683},"weather":[{"id":701,"main":"Mist","description":"mist","icon":"50d"}],"base":"stations","main":{"temp":11.89,"feels_like":11.07,"temp_min":10.69,"temp_max":12.66,"pressure":1005,"humidity":74},"visibility":3500,"wind":{"speed":5.66,"deg":260},"clouds":{"all":75},"dt":1711693624,"sys":{"type":1,"id":8105,"country":"KR","sunrise":1711660921,"sunset":1711705886},"timezone":32400,"id":1835848,"name":"Seoul","cod":200}
}





