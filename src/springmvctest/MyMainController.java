package springmvctest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/myMain")
public class MyMainController {
    

    @RequestMapping(value = "/show", method = RequestMethod.GET)
	    public String show(ModelMap model) {
		    model.addAttribute("message", "hi world");

		    return "hello";
	    }
}
