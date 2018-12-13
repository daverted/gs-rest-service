package hello;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

  private Greeting greeting = new Greeting(1, "hello");

  @Test
  public void greetingGetId() {
    assertThat(greeting.getId(), equalTo(1L));
  }

  public void greetingGetContent() {
    assertThat(greeting.getContent(), equalTo("hello"));
  }

}