package hom.controller.prctc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@ResponseBody
	@RequestMapping("/greeting")
    public String greeting() {
        return "Oh yeeaah !!";
    }
	}
