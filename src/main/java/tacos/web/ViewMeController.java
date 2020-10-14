package tacos.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
@RequestMapping("/view")
public class ViewMeController {

	@GetMapping
	public String viewMePage(Model model) {
		model.addAttribute("message", "Hello View Me Page");
		return "viewMe";
	}
}

