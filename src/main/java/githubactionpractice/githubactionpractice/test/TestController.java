package githubactionpractice.githubactionpractice.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testMethod() {
        return "TEST1! Hi! This is GithubAction test api request! success!!";
    }
}
