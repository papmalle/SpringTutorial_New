package org.setter.based.dependency.injection;

public class SimpleMovieLister {
	
	// the SimpleMovieLister has a dependency on the MovieFinder
    private MovieFinder movieFinder;
    private int i;

    // a setter method so that the Spring container can inject a MovieFinder
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }    
    
    public void setIntegerProperty(int i){
    	this.i=i;
    }
    
    public void testSetterDI(){
    	movieFinder.afficheSetterDI(i);
    }
    
    
    

}
