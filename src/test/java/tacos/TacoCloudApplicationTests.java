package tacos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author musekwa
 *This test class performs essential check to ensure Spring app context load successfully
 *It fails if Spring context is not created
 *
 * @RunWith: a jUnit annotation, it provides jUnit with custom testing behavior
 * SpringRunner.class : Spring-provided test runner for creation of Spring context
 * SpringRunner is an alias for SpringJUnit4ClassRunner
 * 
 * @SpringBootTes: tells jUnit to bootstrap test with Spring Boot capabilities
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class TacoCloudApplicationTests {

	/**
	 * contextLoads() : even empty, it will prompt @RunWith and @SpringBootTest to
	 * do the job and load Spring context
	 */
	@Test
	void contextLoads() {
	}

}
