package InventoryDetails;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;

public class InventoryDeatils {
	public static void main( String[] args ) throws IOException, ParseException,FileNotFoundException{   
		
		// parsing file "JSONExample.json"
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\JavaSamples\\src\\main\\java\\bridgelabz\\JavaSamples\\inventory.json"));
          
        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;
        
        // getting Rice
        JSONArray jsonArray = (JSONArray) jo.get("rice");
        Object s = jsonArray.get(0);
        s = jsonArray.get(0);
        
        System.out.println(s);
        
        // getting Pulses
        JSONArray jsonArrayy = (JSONArray) jo.get("pulses");
 
        Iterator<Long> iteratorr = jsonArrayy.iterator();
        while(iteratorr.hasNext()) {
        	
           System.out.println(iteratorr.next());
        }
        
     // getting Wheats
        JSONArray jsonArray2 = (JSONArray) jo.get("wheats");
        Iterator<Long> iterator2 = jsonArray2.iterator();
        while(iterator2.hasNext()) {
           System.out.println(iterator2.next());
        }
       }
}