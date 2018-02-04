package AnikeenkoHw2;

public class City {
	private String city;

    public City(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
    	String result=" " + city +" " ;
        return result;
    }
}
