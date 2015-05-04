package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class AwareTest implements ApplicationContextAware {

  private ApplicationContext ctx;

  @Override
  public void setApplicationContext(ApplicationContext ctx) throws BeansException {
    this.ctx = ctx;
  }

  @Test
  public void one() {
    Audience a = (Audience) ctx.getBean("audience");
    System.out.println(a);
  }
}
