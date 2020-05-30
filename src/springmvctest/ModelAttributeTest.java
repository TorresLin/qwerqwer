package springmvctest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
@RequestMapping(value="Model")
public class ModelAttributeTest {

    @ModelAttribute
    public void init(Model mode) {
        PojoTest pojo = new PojoTest(null, "小明", "男");
        System.out.println("first in");
        mode.addAttribute("pojo", pojo);
    }
    
    @ModelAttribute
    public void init2() {
        System.out.println("second in");
    }
    
    @RequestMapping(value="modelTest.do")
    public String modelTest() {
        System.out.println("then in");
        return "modelAttribute";
    }
    
    @ModelAttribute
    public void init03() {
        System.out.println("third in");
    }
}
