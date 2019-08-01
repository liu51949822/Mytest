import static org.junit.Assert.*;

import java.util.List;

import javax.xml.stream.events.StartDocument;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.mapper.LoginMapper;
import com.test.pojo.User;
import com.test.service.LoginService;
import com.test.service.login;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicateion.xml")
public class testLogin {
    @Autowired
    private LoginMapper login;
    @Autowired
    private login lo;
    @BeforeClass
    public static void begin() {
		// TODO Auto-generated method stub
    	System.out.println("开始测试");
    	System.out.println(".");
    	System.out.println("..");
    	System.out.println("...");
    	  }
    @Before
    public  void StartDocument() {
    	System.out.println("测试@before方法");
    }
    

	@Test(timeout = 9000)
	public void test() {
	User user = new User();
	user.setuName("abc");
	user.setuPassword("123456");
	int s = login.addUser(user);
    assertEquals(1, s);
	System.out.println(s);
	}
	@Test
	public void tt() {
		User use = new User();
		use.setuName("abc");
		use.setuPassword("123456");
		int a = lo.Register(use);
		assertEquals(1,a);
	}
    @Test
    public void login() {
    	User user = new User();
    	user.setuName("abc");
    	user.setuPassword("123456");
    	List<User> as = lo.login(user);
    	as.stream().forEach(S->{System.out.println(S);});
        
    }
}
