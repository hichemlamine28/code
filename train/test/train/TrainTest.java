package train;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Hichem
 */
public class TrainTest {

    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
    }

    @Test
    @SuppressWarnings("empty-statement")
    public void testreadjson2() throws IOException, ParseException{
        
        JSONParser parser = new JSONParser();
        JSONObject taps = (JSONObject) parser.parse(new FileReader("./inputtestunit"));
        String json = (String) taps.toString();
String expected = "{\"taps\":[{\"unixTimestamp\":1,\"customerId\":1,\"station\":\"A\"},{\"unixTimestamp\":2,\"customerId\":1,\"station\":\"D\"}]}";
 
//System.out.println("json=    "+json);
//System.out.println("expected="+expected);

assertTrue(json.equals(expected));
        assertTrue(json.equals(expected));
       
    }

    /**
     * Test of main method, of class Train.
     */
    @Test
    public void testMain() throws Exception {

        JSONParser parser = new JSONParser();
        JSONObject taps = (JSONObject) parser.parse(new FileReader("./outputtestunit"));
        String json = (String) taps.toString();
        System.out.println(json);
        
        String expected="{\"customerSummaries\":[{\"totalCostInCents";
        
        String expected2="\"Trips\":[{\"costInCents\"";
        
        //B\",\"stationEnd\":\"C\",\"startedJourneyAt\":2,\"costInCents\":240,\"zoneFrom\":1,\"zoneTo\":2},{\"stationStart\":\"H\",\"stationEnd\":\"G\",\"startedJourneyAt\":3,\"costInCents\":200,\"zoneFrom\":4,\"zoneTo\":4},{\"stationStart\":\"D\",\"stationEnd\":\"F\",\"startedJourneyAt\":20,\"costInCents\":280,\"zoneFrom\":2,\"zoneTo\":3}]},{\"customerId\":3,\"totalCostInCents\":440,\"Trips\":[{\"stationStart\":\"H\",\"stationEnd\":\"E\",\"startedJourneyAt\":3,\"costInCents\":200,\"zoneFrom\":4,\"zoneTo\":3},{\"stationStart\":\"E\",\"stationEnd\":\"A\",\"startedJourneyAt\":30,\"costInCents\":240,\"zoneFrom\":2,\"zoneTo\":1}]},{\"customerId\":4,\"totalCostInCents\":500,\"Trips\":[{\"stationStart\":\"A\",\"stationEnd\":\"I\",\"startedJourneyAt\":41,\"costInCents\":300,\"zoneFrom\":1,\"zoneTo\":4},{\"stationStart\":\"E\",\"stationEnd\":\"F\",\"startedJourneyAt\":70,\"costInCents\":200,\"zoneFrom\":4,\"zoneTo\":4}]}]}";
        
        
        //assertTrue( (json.contains(expected)) );
        assertTrue( (json.contains(expected2))&&(json.contains(expected)) );
    }

  
    
    
    
}
