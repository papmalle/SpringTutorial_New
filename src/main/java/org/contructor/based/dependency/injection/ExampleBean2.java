package org.contructor.based.dependency.injection;


public class ExampleBean2  extends AbstractLogger {
	
	private int years;
	
	private String ultimateAnswer;
	
	public ExampleBean2(int years, String ultimateAnswer){
		log.info("Begin example contructor ");
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}	
	
	public void showAnswer(){
		log.info("Begin showAnswer()");
		System.out.println(" Answer is : "+years + " ultimate Answer :"+ultimateAnswer);
		
	}

}
