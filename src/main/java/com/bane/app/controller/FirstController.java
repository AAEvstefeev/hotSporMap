package com.bane.app.controller;

import model.Spot;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.UserService;
import utils.SpotDAOImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(value = "/spot")
public class FirstController {

    @RequestMapping(value = "/random", method = RequestMethod.GET)
    public @ResponseBody Object getRandomNumber() {
        Random random = new Random();
        int max = 10;
        int min = 1;
        return String.valueOf(random.nextInt((max - min) + 1) + min);
    }
    int i = 0;
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public @ResponseBody Object getCount() {
    	return String.valueOf(i++);
    	
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/list", headers="Accept=application/json")
    public @ResponseBody List<Spot> getAllSpots() {
    	
    try {
		return (List<Spot>) new SpotDAOImpl().getAllSpots();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return null;
    }
    
    
    @RequestMapping(method=RequestMethod.GET, value="/users/", headers="Accept=application/json")
    public @ResponseBody List<User> getAllUsers() {
    	
    List<User> userList = (List<User>) new UserService().listUser();
	return userList;
  
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/add", headers="Accept=application/json")
    public @ResponseBody boolean addSpot(@RequestBody Spot s) {
    	 try {
			new SpotDAOImpl().addSpot(s);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return false;
    
    }
    
    

    
    
    
   /* 	
    @RequestMapping(method=RequestMethod.GET, value="/emps", headers="Accept=application/json")
    public @ResponseBody spotListinggetAllEmp() {
    List<Spot> spots = spotDS.getAll();
    spotListinglist = new EmployeeList(spots);
    return list;
    }
    */
}
