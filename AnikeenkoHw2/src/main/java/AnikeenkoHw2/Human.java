package AnikeenkoHw2;

public class Human {
	private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    @Override
    public String toString() {
    	String result=" Name:" + name + " Surname:"  + surname +"." ;
        return result;
    }
}
