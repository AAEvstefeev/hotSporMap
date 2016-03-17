package com.bane.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.MyObject;
import model.User;
import model.spot;
import service.UserService;
import utils.SpotDAOImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(value = "/first")
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
    
    @RequestMapping(method=RequestMethod.GET, value="/spots/", headers="Accept=application/json")
    public @ResponseBody List<spot> getAllSpots() {
    	
    try {
		return (List<spot>) new SpotDAOImpl().getAllSpots();
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
    
    @RequestMapping(method=RequestMethod.POST, value="/add_spot/", headers="Accept=application/json")
    public @ResponseBody boolean addSpot(@RequestBody spot s) {
    	 try {
			new SpotDAOImpl().addSpot(s);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return false;
    
    }
    
    
    @RequestMapping(method=RequestMethod.GET, value="/my_object/", headers="Accept=application/xml")
    public @ResponseBody MyObject getMap() {
    MyObject myObject = new MyObject("my super obeject", 4, true);
    myObject.setLatitude(0.3);
    myObject.setLongitute(0.4f);
    //employeeDS.get(Long.parseLong(id));
    return myObject;
    }
    
    
    
   /* 	
    @RequestMapping(method=RequestMethod.GET, value="/emps", headers="Accept=application/json")
    public @ResponseBody spotListinggetAllEmp() {
    List<spot> spots = spotDS.getAll();
    spotListinglist = new EmployeeList(spots);
    return list;
    }
    */
}
