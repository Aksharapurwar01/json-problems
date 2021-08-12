package bridgelabz.JavaSamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;

public class InventoryManager {
	public static void main( String[] args ) throws IOException, ParseException,FileNotFoundException{   
		

	       Long total  = 0l;   
	       Long total3 = 0l;
	       Long total1 = 0l;
	       Long finaltotal = 0l;
		
		// parsing file "JSONExample.json"
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\JavaSamples\\src\\main\\java\\bridgelabz\\JavaSamples\\inventory.json"));
          
        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;
        
        // getting Rice
        JSONArray jsonArray = (JSONArray) jo.get("rice");
       
   
       for(int i = 0 ; i<jsonArray.size() ; i++) {
    	   
    	   JSONObject a =  (JSONObject) jsonArray.get(i);
    	   String name = (String) a.get("name");
    	   Long price = (Long) a.get("price_per_kg");
    	   Long weight  = (Long) a.get("weight");
    	
    	   total  = total + (price * weight);
    	 
    	   
    	   
       }
       System.out.println("Price of Rice "  +total); 
       
       // getting Pulses
        JSONArray jsonArrayy = (JSONArray) jo.get("pulses");
     
        for(int i = 0 ; i<jsonArrayy.size() ; i++) {
     	   
     	   JSONObject b =  (JSONObject) jsonArrayy.get(i);
     	   String name = (String) b.get("name");
     	   Long price = (Long) b.get("price_per_kg");
     	   Long weight  = (Long) b.get("weight");
     	 
     	   total1  = total1 + (price * weight);
        }
        
        System.out.println("Price of Pulses " +total1);
        
     // getting Wheats
        JSONArray jsonArray2 = (JSONArray) jo.get("wheats");
      
        for(int i = 0 ; i<jsonArray2.size() ; i++) {
     	   
     	   JSONObject c =  (JSONObject) jsonArray2.get(i);
     	   String name = (String) c.get("name");
     	   Long price = (Long) c.get("price_per_kg");
     	   Long weight  = (Long) c.get("weight");
     	  
     	   total3  = total3 + (price * weight);
        }
        System.out.println("Price of Wheats " +total3);
        
        finaltotal = total+total1+total3;
       
        System.out.println("Total Price " +finaltotal);
       
       }
}