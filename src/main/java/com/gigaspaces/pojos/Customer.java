package com.gigaspaces.pojos;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Customer  implements java.io.Serializable {


     private int CCustkey;
     private Nation nation;
     private String CName;
     private String CAddress;
     private String CPhone;
     private BigDecimal CAcctbal;
     private String CMktsegment;
     private String CComment;
     private Set orderses = new HashSet(0);

    public Customer() {
    }

	
    public Customer(int CCustkey, Nation nation, String CName, String CAddress, String CPhone, BigDecimal CAcctbal, String CMktsegment, String CComment) {
        this.CCustkey = CCustkey;
        this.nation = nation;
        this.CName = CName;
        this.CAddress = CAddress;
        this.CPhone = CPhone;
        this.CAcctbal = CAcctbal;
        this.CMktsegment = CMktsegment;
        this.CComment = CComment;
    }
    public Customer(int CCustkey, Nation nation, String CName, String CAddress, String CPhone, BigDecimal CAcctbal, String CMktsegment, String CComment, Set orderses) {
       this.CCustkey = CCustkey;
       this.nation = nation;
       this.CName = CName;
       this.CAddress = CAddress;
       this.CPhone = CPhone;
       this.CAcctbal = CAcctbal;
       this.CMktsegment = CMktsegment;
       this.CComment = CComment;
       this.orderses = orderses;
    }
    @SpaceId
    public int getCCustkey() {
        return this.CCustkey;
    }
    
    public void setCCustkey(int CCustkey) {
        this.CCustkey = CCustkey;
    }
    public Nation getNation() {
        return this.nation;
    }
    
    public void setNation(Nation nation) {
        this.nation = nation;
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
    public BigDecimal getCAcctbal() {
        return this.CAcctbal;
    }
    
    public void setCAcctbal(BigDecimal CAcctbal) {
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
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }




}


