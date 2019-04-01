package com.gigaspaces;

import org.openspaces.core.GigaSpace;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
public class InitialLoader {


    @Autowired
    private GigaSpace gigaspace;

    public void init() throws Exception {
        System.out.println("Data Loaded...");
    }
}
