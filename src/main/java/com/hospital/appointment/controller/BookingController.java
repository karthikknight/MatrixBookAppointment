package com.hospital.appointment.controller;

import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
//	public UserService getUserService() {
//		return userService;
//	}

	@Autowired()
	public void setUserService(UserService userservice){
		this.userService = userservice;
	}
	
	@GetMapping("/booknow")
	public ModelAndView getBookingPage(@ModelAttribute("user") User u) {
		return new ModelAndView("bookingpage");
	}
	
	@GetMapping("/getAppointmentInfo")
	public ModelAndView getAppointment(HttpServletRequest request, HttpServletResponse response){
		User user = this.userService.getUserAppt(request.getParameter("confirmationNum"));
		
		System.out.println(user.toString());
		ModelAndView view = new ModelAndView("appointmentInfo");
		view.addObject("firstName", user.getFirstName());
		view.addObject("lastName", user.getLastName());
		view.addObject("dob", user.getDob());
		view.addObject("apptDate", user.getApptDate());
		view.addObject("apptTime", user.getApptTime());
        return view;
    }
	
	@PostMapping("/saveappointment")
	public ModelAndView postBookingDetails(@ModelAttribute("user") User u) throws NoSuchAlgorithmException {
		int length = 10;
	    boolean useLetters = true;
	    boolean useNumbers = true;
	    String randomConf = RandomStringUtils.random(length, useLetters, useNumbers);
	    
		String confirmationNum=randomConf.toString();
		u.setConfirmationNum(confirmationNum);
		this.userService.addUserAppt(u);
		ModelAndView view = new ModelAndView("confirmation");
		view.addObject("confNum", confirmationNum);
		return view;
	}

}
