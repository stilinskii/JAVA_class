package login.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import login.service.MemService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class homeController {
	private static final Logger log = Logger.getLogger(AccountController.class);
	private final MemService service;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/home")
	public String welcome(@RequestParam(required = false) String id,Model model) {
		model.addAttribute("dto", service.findById(id));
		log.info(service.findById(id).getUsername());
		return "/welcomepage";
	}
}
