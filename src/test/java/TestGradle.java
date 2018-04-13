package test.java;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import main.java.TryGradle;
import static org.hamcrest.CoreMatchers.*;

public class TestGradle {
	@Test
    public void test() {
		TryGradle sample = new TryGradle();
        assertThat(sample.getMessage(), is("hello!"));
    }
}
