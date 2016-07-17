package Y;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by malle on 17/07/2016.
 */
public class MainTest {


    public static void main(String argv[]){

        ApplicationContext context = context = new ClassPathXmlApplicationContext("Y/test.xml");
        Test test = context.getBean("test", Test.class);
        System.out.printf(" NOM "+test.getNom());
        Utilis utilis = test.getUtilis();

        System.out.printf(" VALEUR UTILISE "+utilis.addition());
    }

}
