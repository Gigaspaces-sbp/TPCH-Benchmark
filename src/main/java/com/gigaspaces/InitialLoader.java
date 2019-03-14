package com.gigaspaces;

import com.gigaspaces.pojos.*;
import org.apache.commons.collections.CollectionUtils;
import org.openspaces.core.GigaSpace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.math.MathContext;
import java.sql.Date;
import java.util.*;
import java.util.stream.Collectors;


/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
public class InitialLoader {

    private static Logger logger = LoggerFactory.getLogger(InitialLoader.class);

    @Autowired
    private GigaSpace gigaspace;

    public void init() throws Exception {

    }
}
