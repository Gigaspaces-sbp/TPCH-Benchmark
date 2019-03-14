package com.gigaspaces.pojos;



import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.util.HashSet;
import java.util.Set;

/*
 *@author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Nation  implements java.io.Serializable {


     private int NNationkey;
     private Region region;
     private String NName;
     private String NComment;
     private Set suppliers = new HashSet(0);
     private Set customers = new HashSet(0);

    public Nation() {
    }

	
    public Nation(int NNationkey, Region region, String NName) {
        this.NNationkey = NNationkey;
        this.region = region;
        this.NName = NName;
    }
    public Nation(int NNationkey, Region region, String NName, String NComment, Set suppliers, Set customers) {
       this.NNationkey = NNationkey;
       this.region = region;
       this.NName = NName;
       this.NComment = NComment;
       this.suppliers = suppliers;
       this.customers = customers;
    }
    @SpaceId
    public int getNNationkey() {
        return this.NNationkey;
    }
    
    public void setNNationkey(int NNationkey) {
        this.NNationkey = NNationkey;
    }
    public Region getRegion() {
        return this.region;
    }
    
    public void setRegion(Region region) {
        this.region = region;
    }
    public String getNName() {
        return this.NName;
    }
    
    public void setNName(String NName) {
        this.NName = NName;
    }
    public String getNComment() {
        return this.NComment;
    }
    
    public void setNComment(String NComment) {
        this.NComment = NComment;
    }
    public Set getSuppliers() {
        return this.suppliers;
    }
    
    public void setSuppliers(Set suppliers) {
        this.suppliers = suppliers;
    }
    public Set getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Set customers) {
        this.customers = customers;
    }




}


