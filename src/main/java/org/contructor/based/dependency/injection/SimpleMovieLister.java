package org.contructor.based.dependency.injection;

public class SimpleMovieLister extends AbstractLogger{

	MovieFinder movieFinder;

	public SimpleMovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}	
	
	public void calculeSimpleMovie(int value1, int value2){
		log.info(" Begin calculeSimpleMovie()");
		movieFinder.calculSomme(value1, value2);
	}

}
