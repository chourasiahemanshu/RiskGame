import Controller.ReadMap;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * This class read the map file and tells whether it's whether
 * the map file is valid or invaild
 *
 * @author Vikram
 * @version 1.0.0
 */


public class TestMapFile {

    static String filename;
    static boolean value;

    @BeforeClass
    public static void BeforeClass() {

    }


    @Before
    public void BeforeTestCase() {
        filename = "./assets/maps/trial.map";
        value = ReadMap.readMap(filename);
    }

    @Test
    public void TestCase1() {
        //String mapName="trial";

        //boolean value= ValidateMap.validateMap();
        String s1 = Boolean.toString(value);

        assertEquals("false", s1);
    }



}
