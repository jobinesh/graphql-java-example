package demo;

/**
 *
 * @author Jobinesh
 */
public class Location {

    private Integer locationId;
    private String city;
    private String country;

    public Location() {
    }

    public Location(Integer locationId, String city, String country) {
        this.locationId = locationId;
        this.city = city;
        this.country = country;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
