import com.java.employeeInfo.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Beginning of program
public class MainActivity {
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
        annotationContext.scan("com.java.employeeInfo");
        annotationContext.refresh();
        Employee emp = (Employee) annotationContext.getBean("employee");
        System.out.println(emp);
    }
}
