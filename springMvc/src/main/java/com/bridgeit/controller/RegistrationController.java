package com.bridgeit.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.dao.StudentDAO;
import com.bridgeit.pojo.Student;

@Controller
public class RegistrationController 
{
	@Autowired
	StudentDAO studentDAO;
	
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(@Valid @ModelAttribute("student") Student student, BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("register");
		}
		
		
		studentDAO.insert(student);
		
		ModelAndView mav = new ModelAndView("registerSucces");
		return mav;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("email") String email,@RequestParam("password") String password,HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("ranu");
		
		if(studentDAO.loginValidation(email, password))
		{
			System.out.println("r1");
		 Student student =studentDAO.getByEmail(email);
		 ModelAndView modelAndView=new ModelAndView("loginSucces");
		 modelAndView.addObject("student",student);
		
		 HttpSession httpSession=request.getSession();
		 System.out.println("session id "+httpSession.getId());
		 
	//	 Cookie cookie=httpSession.setAttribute("object",student);
		 Cookie cookie=new Cookie("email", email);
		 return modelAndView;
		}
		else
		{
			System.out.println("r2");
			return new ModelAndView("register");
		}
	}
	
	
	

}