package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jobinesh
 */
public class LocationRepository {

    public static int id = 4000;
    static List<Location> locations = new ArrayList<Location>() {
        {

            add(new Location(1000, "San Francisco", "US"));
            add(new Location(2000, "Los Angeles", "US"));
            add(new Location(3000, "New York City", "US"));
        }
    };

    public Location findById(Integer locationId) {
        Iterator<Location> iter = locations.iterator();
        while (iter.hasNext()) {
            Location loc = iter.next();
            if (loc.getLocationId().equals(locationId)) {
                return loc;
            }
        }
        return null;
    }

    public List<Location> getLocation() {
        return LocationRepository.locations;
    }
}
