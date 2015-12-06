package D.org.springframework.dependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("D/datasource.xml");
		//LoolClass loolClass =context.getBean("Lool", LoolClass.class);
		//System.out.println(loolClass.getProperties().getProperty("jdbc.driver.className"));
		
	BasicDataSource dataSource = context.getBean("myDataSource", BasicDataSource.class);
	System.out.println("----------------------ddsss--------------1");
	System.out.println(dataSource.getUsername());
dataSource.setUsername("yaya");
System.out.println(dataSource.getUsername());
BasicDataSource dataSource1 = context.getBean("myDataSource", BasicDataSource.class);
System.out.println("--------------ff----------------------2");
System.out.println(dataSource1.getUsername());
dataSource.setUsername("yayssa toooo");
System.out.println(dataSource1.getUsername());
System.out.println("------------------------------fghjh------1");
System.out.println(dataSource.getUsername());
dataSource.setUsername("yayxxxa");
System.out.println("dddddd"+dataSource.getUsername());
//		LoolClass loolClass = dataSource.getLool();
//			
//		System.out.println(dataSource.toString());
//		System.out.println(loolClass.getProperties().getProperty("jdbc.driver.className"));

	}

}
