package login.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import login.dto.MemInfoDTO;
import login.service.MemService;
import lombok.RequiredArgsConstructor;


@Controller
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {
	private static final Logger log = Logger.getLogger(AccountController.class);
	private final MemService service;
	
	@GetMapping("/login")
	public String loginForm() {
		log.info("login access");
		return "login/loginForm";
	}
	
	@PostMapping("/login")
	public String login(String id,String password,RedirectAttributes redirectAttributes) {
//		1:login success 2:password incorrect 0:member not found
		int chk= service.loginChk(id, password);
		if(chk==1) {
			redirectAttributes.addAttribute("id", id);
			return "redirect:/home?id={id}";
		}else if(chk==0) {
			
		}else {
			
		}
		return "home";
	}
	
	
	@GetMapping("/signup")
	public String signupForm() {
		return "login/signUpForm";
	}
	
	@PostMapping("/signup")
	public String signup(@ModelAttribute MemInfoDTO dto) {
		if(service.save(dto)==null) {
			return "login/signUpForm";
		}else {
			return "redirect:/account/login";
		}
		
	}
	
	@GetMapping("/edit/{id}")
	public String editInfoForm(Model model,@PathVariable String id) {
		model.addAttribute("dto",service.findById(id));
		return "login/editInfoForm";
	}
	
	@PostMapping("/edit")
	public String editInfo(@ModelAttribute MemInfoDTO dto,RedirectAttributes redirectAttributes) {
		log.info("dto id="+dto.getId());
		log.info("dto email="+dto.getEmail());
		log.info("dto pw="+dto.getPassword());
		log.info("dto username="+dto.getUsername());
		service.updateInfo(dto);
		log.info("here?1");
		redirectAttributes.addAttribute("id",dto.getId());
		log.info("here?2");
		return "redirect:/home?id={id}";
	}
}
