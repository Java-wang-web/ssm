import com.ssm.pojo.Book;
import com.ssm.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jitwxs
 * @date 2021Äê04ÔÂ27ÈÕ 17:41
 */

public class MyTest {

        @Test
        public void test(){
           ApplicationContext context=     new ClassPathXmlApplicationContext("applicationContext.xml");
         BookService bookService= (BookService) context.getBean("BookServiceImpl");
                for (Book book : bookService.queryAllBook()) {
                        System.out.println(book);
                }

        }
}
