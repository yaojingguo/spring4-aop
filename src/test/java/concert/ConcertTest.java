package concert;

import static com.google.common.truth.Truth.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest extends AbstractJUnit4SpringContextTests {

  @Test
  public void testAudience() {
    Audience a = (Audience) applicationContext.getBean("audience");
    assertThat(a).isNotNull();
    Performance p = applicationContext.getBean(Performance.class);
    assertThat(p).isNotNull();
    p.perform();
    assertThat(a).isNotNull();
  }
  

}
