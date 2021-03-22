
package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.PaymentDao;
import com.model.Payment;

@Controller
public class PaymentController {
	
	@Autowired
	private PaymentDao payDao;

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	String add(@ModelAttribute Payment payment) {
		payDao.send(payment);
			return "success";	
	}
	@RequestMapping("/view")
	 public String view(Model m){    
       List<Payment> payment=payDao.getPayment();
       m.addAttribute("payment",payment);
        return "view";    
    }   
	
	
	@RequestMapping("/checkview")
    public String viewHomePage(Model model, @RequestParam("searchString") String keyword) {
		 System.out.println("keword"+keyword);
	     Payment obj = payDao.findAll(keyword);
        //model.addAttribute("listProducts", listProducts);
        model.addAttribute("object", obj);
         System.out.println(obj);
         
        return "index";
    }
}
