package AnikeenkoHw2;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Information {
	private Human human;
    private Age age;
    @Autowired
    private List grades;    
    @Autowired
    private City city;

    
    public Information() {}
    @Autowired
    public Information(Human human, Age age) {
        this.human =  human;
        this.age =  age;
    }
    public void setCity(City city) {
 	   this.city = city;
 	}
  
    
    
    public void setGrades(List grades) {
        this.grades = grades;
    }
    @Override
    public String toString() {
    	String result="Info:" + human + " Age:"  + age + "City: "+city +" Grades: "+grades +" ." ;
        return result;
    }
}