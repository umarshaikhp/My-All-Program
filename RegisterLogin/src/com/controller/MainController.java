package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.RegisterDao;
import com.register.RegisterUser;

@SuppressWarnings("unused")
@Controller
public class MainController {

	@Autowired
	private RegisterDao registerDao;

	@RequestMapping("/")
	public String home() {
		return "index";

	}

	@RequestMapping("/register-form")
	public String registerForm(Model m) {
		m.addAttribute("title", "registeration");
		return "registeration";

	}

	@RequestMapping(value = "/handle-form", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("sorry") RegisterUser register, HttpServletRequest request,
			HttpServletResponse response, Model m) {
		System.out.println(register);

		String email = register.getEmail();

		if (email.equals(email)) {
			boolean check = registerDao.checDuplicate(email);
			if (check) {
				System.out.println("u have already registered");
				m.addAttribute("sorry", "You have already registered");
				return "registeration";
			} else {
				registerDao.createRegister(register);
			}
		}
		// registerDao.createRegister(register);
		// m.addAttribute("message", message);
		/*
		 * RedirectView redirectView= new RedirectView();
		 * redirectView.setUrl(request.getContextPath() + "/");
		 */
		return "index";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginForm(@ModelAttribute RegisterUser register, Model model,SessionStatus ststus) {
		System.out.println("loginForm");
		String email = register.getEmail();
		String pass = register.getPassword();
		System.out.println(email + "" + pass);

		if (!email.isEmpty() && !pass.isEmpty()) {
			System.out.println("login");
			boolean validate = registerDao.findUser(email, pass);
			if (validate) {
				// fetch the data
				List<RegisterUser> register1 = registerDao.getRegsiterUsers();
				model.addAttribute("register1", register1);
				return "login";
			}
		} else {
			System.out.println("error");
			return "index";
		}
		
		return "redirect:/";
	}

	@GetMapping("/display")
	public String displayData(Model model) {
		List<RegisterUser> register1 = registerDao.getRegsiterUsers();
		model.addAttribute("register1", register1);
		return "login";

	}

//delete handler
	@RequestMapping("/delete/{registerId}")
	public String deleteUser(@PathVariable("registerId") int rid, HttpServletRequest request, Model model) {
		registerDao.delete(rid);
		List<RegisterUser> register1 = registerDao.getRegsiterUsers();
		model.addAttribute("register1", register1);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/login");
		return "login";

	}
	// update controller

	@RequestMapping("/update{registerId}")
	public String updateForm(@PathVariable("registerId") int rid, Model m, HttpServletRequest request) {

		RegisterUser reg = this.registerDao.getRegisterUser(rid);
		m.addAttribute("reg", reg);
		// this.registerDao.updateReg(reg);

		/*
		 * RedirectView view = new RedirectView(); view.setUrl(request.getContextPath()
		 * + "/update");
		 */

		return "update";

	}

	@PostMapping("/update-form")
	public String updateRegisterForm(@ModelAttribute RegisterUser register, Model m, HttpServletRequest request) {
		this.registerDao.updateReg(register);

		return "redirect:/display";

	}
	
	/*
	 * @RequestMapping("/logout") public String logout() {
	 * 
	 * return "index"; }
	 */

}
