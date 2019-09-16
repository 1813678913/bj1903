import com.dao.AdminlogDao;
import com.entity.Adminlog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations = {"classpath:spring/ApplicationContext-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class aaa {
    @Autowired
    private AdminlogDao dao;
    @Test
    public void aaa(){
        Adminlog adminlog = dao.selectAdminlogById(1);
        System.out.println(adminlog);

    }


}
