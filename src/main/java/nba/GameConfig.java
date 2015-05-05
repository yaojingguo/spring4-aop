package nba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class GameConfig {

  @Bean
  public Game getGame() {
    return new GameImpl();
  }

  @Bean
  public Fans getFans() {
    return new Fans();
  }
}