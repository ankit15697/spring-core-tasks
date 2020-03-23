import com.java.employeeInfo.Employee;
import com.java.spring.annotation.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// This is the beginning of the project
public class MainActivity {
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee);
    }
}
