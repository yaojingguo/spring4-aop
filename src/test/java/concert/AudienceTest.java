package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class AudienceTest extends AbstractJUnit4SpringContextTests {

  @Test
  public void one() {
    Audience a = (Audience) applicationContext.getBean("audience");
    System.out.println(a);
   Performance p = applicationContext.getBean(Performance.class);
   System.out.println(p);
   p.perform();
  }
}
