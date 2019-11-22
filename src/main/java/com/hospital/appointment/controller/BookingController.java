package com.hospital.appointment.controller;

import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hospital.appointment.model.User;
import com.hospital.appointment.service.UserService;


@Controller
@RequestMapping("/appointment")
public class BookingController {
	
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	@Autowired()
	public void setUserService(UserService userservice){
		this.userService = userservice;
	}
	
	@GetMapping("/booknow")
	public ModelAndView getBookingPage(@ModelAttribute("user") User u) {
		return new ModelAndView("bookingpage");
	}
	
	@GetMapping("/getAppointmentInfo/{confNum}")
	public ModelAndView getAppointment(@ModelAttribute("user") User u){
		this.userService.getUserAppt(u.getConfirmationNum());
        return new ModelAndView("appointmentInfo");
    }
	
	@PostMapping("/saveappointment")
	public String postBookingDetails(@ModelAttribute("user") User u) throws NoSuchAlgorithmException {
//		ModelAndView modelView = new ModelAndView();
//		Long randomConf = SecureRandom.getInstance("SHA1PRNG").nextLong();
//		conf_num = randomConf.toString();
//		modelView.setViewName("confirmation");
		
		int length = 10;
	    boolean useLetters = true;
	    boolean useNumbers = true;
	    String randomConf = RandomStringUtils.random(length, useLetters, useNumbers);
	    
//		User user = new User();
//		String firstName=request.getParameter("firstName");
//		String lastName=request.getParameter("lastName");
//		String dob=request.getParameter("dob");
//		String apptDate=request.getParameter("apptDate");
//		String apptTime=request.getParameter("apptTime");
		String confirmationNum=randomConf.toString();
//		user.setFirstName(firstName);
//		user.setLastName(lastName);
//		user.setDob(dob);
//		user.setApptDate(apptDate);
//		user.setApptTime(apptTime);
//		user.setConfirmationNum(confirmationNum);
		
//		u.addAttribute("confNum", confirmationNum);
		u.setId(2);
		u.setConfirmationNum(confirmationNum);
		this.userService.addUserAppt(u);
		return "confirmation";
	}

}
