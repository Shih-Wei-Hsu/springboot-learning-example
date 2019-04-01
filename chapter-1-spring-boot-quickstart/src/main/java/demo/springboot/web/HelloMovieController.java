package demo.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xuxiansheng on 2019/3/27.
 */
@Controller
public class HelloMovieController {

    @RequestMapping(value = "/movie/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        return "Hello , the movie is OK   ! ";
    }
}
