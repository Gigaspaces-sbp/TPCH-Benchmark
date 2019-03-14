package com.gigaspaces.pojos;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Orders  implements java.io.Serializable {


     private int OOrderkey;
     private Customer customer;
     private char OOrderstatus;
     private BigDecimal OTotalprice;
     private Date OOrderdate;
     private String OOrderpriority;
     private String OClerk;
     private int OShippriority;
     private String OComment;
     private Set lineitems = new HashSet(0);

    public Orders() {
    }

	
    public Orders(int OOrderkey, Customer customer, char OOrderstatus, BigDecimal OTotalprice, Date OOrderdate, String OOrderpriority, String OClerk, int OShippriority, String OComment) {
        this.OOrderkey = OOrderkey;
        this.customer = customer;
        this.OOrderstatus = OOrderstatus;
        this.OTotalprice = OTotalprice;
        this.OOrderdate = OOrderdate;
        this.OOrderpriority = OOrderpriority;
        this.OClerk = OClerk;
        this.OShippriority = OShippriority;
        this.OComment = OComment;
    }
    public Orders(int OOrderkey, Customer customer, char OOrderstatus, BigDecimal OTotalprice, Date OOrderdate, String OOrderpriority, String OClerk, int OShippriority, String OComment, Set lineitems) {
       this.OOrderkey = OOrderkey;
       this.customer = customer;
       this.OOrderstatus = OOrderstatus;
       this.OTotalprice = OTotalprice;
       this.OOrderdate = OOrderdate;
       this.OOrderpriority = OOrderpriority;
       this.OClerk = OClerk;
       this.OShippriority = OShippriority;
       this.OComment = OComment;
       this.lineitems = lineitems;
    }
    @SpaceId
    public int getOOrderkey() {
        return this.OOrderkey;
    }
    
    public void setOOrderkey(int OOrderkey) {
        this.OOrderkey = OOrderkey;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public char getOOrderstatus() {
        return this.OOrderstatus;
    }
    
    public void setOOrderstatus(char OOrderstatus) {
        this.OOrderstatus = OOrderstatus;
    }
    public BigDecimal getOTotalprice() {
        return this.OTotalprice;
    }
    
    public void setOTotalprice(BigDecimal OTotalprice) {
        this.OTotalprice = OTotalprice;
    }
    public Date getOOrderdate() {
        return this.OOrderdate;
    }
    
    public void setOOrderdate(Date OOrderdate) {
        this.OOrderdate = OOrderdate;
    }
    public String getOOrderpriority() {
        return this.OOrderpriority;
    }
    
    public void setOOrderpriority(String OOrderpriority) {
        this.OOrderpriority = OOrderpriority;
    }
    public String getOClerk() {
        return this.OClerk;
    }
    
    public void setOClerk(String OClerk) {
        this.OClerk = OClerk;
    }
    public int getOShippriority() {
        return this.OShippriority;
    }
    
    public void setOShippriority(int OShippriority) {
        this.OShippriority = OShippriority;
    }
    public String getOComment() {
        return this.OComment;
    }
    
    public void setOComment(String OComment) {
        this.OComment = OComment;
    }
    public Set getLineitems() {
        return this.lineitems;
    }
    
    public void setLineitems(Set lineitems) {
        this.lineitems = lineitems;
    }




}


