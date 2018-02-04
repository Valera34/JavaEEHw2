package AnikeenkoHw2;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("AnikeenkoHw2")
public class Configurate {
	 
	@Bean
    public Human human() {
        return new Human ("Denis", "Simka");
    }
	 
	    @Bean
	    public Age age() {
	        return new Age ( 15 );
	    }
	   @Bean
	    public City city() {
	        return new City ( "Kyiv" );
	    }
	   @Bean
	    public Grades grades() {
		   ArrayList<Integer> list = new ArrayList<Integer>();
		   list.add(5);
		   list.add(4);
		   list.add(3);
		   list.add(2);
	        return new Grades ( list);
	    }
	
}
