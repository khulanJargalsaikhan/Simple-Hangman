import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args){

        ArrayList<Double> temperatureList = new ArrayList<Double>();
        //Adding items to your ArrayList is simple and fun with the add method.
        temperatureList.add(40.5);
        temperatureList.add(33.9);
        temperatureList.add(37.8);
        temperatureList.add(15.3);
        temperatureList.add(25.6);


        System.out.println(temperatureList);

        for (Double temp : temperatureList) {
            System.out.println(temp);
        }

        Collections.sort(temperatureList);

        int searchIndex = Collections.binarySearch(temperatureList, 33.9);
        if(searchIndex >=0){
            System.out.println("Temperature found." + searchIndex);
        }else{
            System.out.println("Temperature not found." + searchIndex);
        }





    }




}
