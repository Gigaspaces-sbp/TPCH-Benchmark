package com.gigaspaces.pojos;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Customer  implements java.io.Serializable {


     private int CCustkey;
     private int CNationkey;
     private String CName;
     private String CAddress;
     private String CPhone;
     private Double CAcctbal;
     private String CMktsegment;
     private String CComment;

    public Customer() {
    }

	
    public Customer(int CCustkey, int CNationkey, String CName, String CAddress, String CPhone, Double CAcctbal, String CMktsegment, String CComment) {
        this.CCustkey = CCustkey;
        this.CNationkey = CNationkey;
        this.CName = CName;
        this.CAddress = CAddress;
        this.CPhone = CPhone;
        this.CAcctbal = CAcctbal;
        this.CMktsegment = CMktsegment;
        this.CComment = CComment;
    }

    @SpaceId
    public int getCCustkey() {
        return this.CCustkey;
    }
    
    public void setCCustkey(int CCustkey) {
        this.CCustkey = CCustkey;
    }
    public int getCNationkey() {
        return this.CNationkey;
    }
    
    public void setCNationkey(int CNationkey) {
        this.CNationkey = CNationkey;
    }
    public String getCName() {
        return this.CName;
    }
    
    public void setCName(String CName) {
        this.CName = CName;
    }
    public String getCAddress() {
        return this.CAddress;
    }
    
    public void setCAddress(String CAddress) {
        this.CAddress = CAddress;
    }
    public String getCPhone() {
        return this.CPhone;
    }
    
    public void setCPhone(String CPhone) {
        this.CPhone = CPhone;
    }
    public Double getCAcctbal() {
        return this.CAcctbal;
    }
    
    public void setCAcctbal(Double CAcctbal) {
        this.CAcctbal = CAcctbal;
    }
    public String getCMktsegment() {
        return this.CMktsegment;
    }
    
    public void setCMktsegment(String CMktsegment) {
        this.CMktsegment = CMktsegment;
    }
    public String getCComment() {
        return this.CComment;
    }
    
    public void setCComment(String CComment) {
        this.CComment = CComment;
    }
}


