package springboot.web.api;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 *
 * @author LiuDecai
 * @date 2018/7/1.
 */
@RestController
@RequestMapping("/")
@Api("Hello接口")
public class HelloWorldApi {

    @GetMapping
    public ResponseEntity hello() {
        return ResponseEntity.ok("Hello Google App Engine. Author: 刘德财");
    }

}
