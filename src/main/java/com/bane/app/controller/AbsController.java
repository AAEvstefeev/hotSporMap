package com.bane.app.controller;

import dao.ObjectDAOImpl;
import model.ObjectDAO;
import model.Spot;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.UserService;
import utils.SpotDAOImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(value = "/first")
public abstract class AbsController {


    @RequestMapping(method = RequestMethod.GET, value = "/list/", headers = "Accept=application/json")
    public
    @ResponseBody
    List<ObjectDAO> getList() {

        try {
            return (List<ObjectDAO>) new ObjectDAOImpl().list();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add/", headers = "Accept=application/json")
    public
    @ResponseBody
    boolean add(@RequestBody ObjectDAO objectDAO) {
        try {
            new ObjectDAOImpl().add(objectDAO);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;

    }


    @RequestMapping(method = RequestMethod.POST, value = "/delete/", headers = "Accept=application/json")
    public
    @ResponseBody
    boolean delete(@RequestBody ObjectDAO objectDAO) {
        try {
            new ObjectDAOImpl().delete(objectDAO);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;

    }

    @RequestMapping(method = RequestMethod.POST, value = "/update/", headers = "Accept=application/json")
    public
    @ResponseBody
    boolean update(@RequestBody ObjectDAO objectDAO) {
        try {
            new ObjectDAOImpl().update(objectDAO);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;

    }

    @RequestMapping(method = RequestMethod.GET, value = "/update/{id}", headers = "Accept=application/json")
    public ObjectDAO get(@PathVariable("id") String id) {
        try {
            return new ObjectDAOImpl().get(id);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }


}
