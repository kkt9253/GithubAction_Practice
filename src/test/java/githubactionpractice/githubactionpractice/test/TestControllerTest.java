package githubactionpractice.githubactionpractice.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TestControllerTest {

    @Test
    void health_returns_OK() {
        TestController c = new TestController();
        assertThat(c.testMethod()).isEqualTo("TEST1! Hi! This is GithubAction test api request! success!!");
    }

//    @Test
//    void health_returns_Fail() {
//        TestController c = new TestController();
//        assertThat(c.testMethod()).isEqualTo("Fail");
//    }
}