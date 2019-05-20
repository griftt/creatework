import com.griftt.biz.entity.Activity;
import com.griftt.biz.servcie.ActivityService;
import com.griftt.lifemix.CreateforworkApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CreateforworkApplication.class)
public class TestService {


    @Autowired
    private ActivityService activityService;

    @Test
    public  void testMapper(){
        List<Activity> actictyList = activityService.getActictyList();
        List<Activity> actictyListMapper = activityService.getActictyListMapper();
        System.out.println(actictyList);
        System.out.println(actictyListMapper);
    }
}
