import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestListCIty {

    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void deleteCity() {
        // Add a city
        City mockCity = new City("Halifax", "NS");
        list.addCity(mockCity);
        int listSize = list.getCount();
        list.removeCity(mockCity);
        assertEquals(list.getCount(), listSize - 1);
        assertEquals(list.hasCity(mockCity),0);     // the city is not in the list
    }



}
