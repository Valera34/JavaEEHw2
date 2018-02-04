package AnikeenkoHw2;

import java.util.List;

public class Grades {
	private List grades;

    public Grades(List  grades) {
        this.grades = grades;
    }
    
    @Override
    public String toString() {
    	String result=" " + grades +" " ;
        return result;
    }
}
