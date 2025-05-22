package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreams {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
        List<String> vehiclesListUpperCase = new ArrayList<String>();

//        without streams'

      /*  for(String name: vehicles){
            vehiclesListUpperCase.add(name.toUpperCase());
        }
        System.out.println(vehiclesListUpperCase);

       */

       vehiclesListUpperCase = vehicles.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesListUpperCase);
    }
}
