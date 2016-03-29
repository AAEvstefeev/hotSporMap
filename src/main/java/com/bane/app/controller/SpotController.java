package com.bane.app.controller;

import model.ObjectDAO;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by alexanderevstefeev on 20.03.16.
 */
public class SpotController extends AbsController{
    @Override
    public boolean add(@RequestBody ObjectDAO objectDAO) {
        return super.add(objectDAO);
    }
}
