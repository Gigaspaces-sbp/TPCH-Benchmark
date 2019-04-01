package com.gigaspaces.pojos;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.sql.Date;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Orders  implements java.io.Serializable {


     private int OOrderkey;
     private int OCustkey;
     private char OOrderstatus;
     private Double OTotalprice;
     private Date OOrderdate;
     private String OOrderpriority;
     private String OClerk;
     private int OShippriority;
     private String OComment;

    public Orders() {
    }


    public Orders(int OOrderkey, int OCustkey, char OOrderstatus, Double OTotalprice, Date OOrderdate, String OOrderpriority, String OClerk, int OShippriority, String OComment) {
        this.OOrderkey = OOrderkey;
        this.OCustkey = OCustkey;
        this.OOrderstatus = OOrderstatus;
        this.OTotalprice = OTotalprice;
        this.OOrderdate = OOrderdate;
        this.OOrderpriority = OOrderpriority;
        this.OClerk = OClerk;
        this.OShippriority = OShippriority;
        this.OComment = OComment;
    }
    @SpaceId
    public int getOOrderkey() {
        return this.OOrderkey;
    }

    public void setOOrderkey(int OOrderkey) {
        this.OOrderkey = OOrderkey;
    }
    public int getOCustkey() {
        return this.OCustkey;
    }

    public void setOCustkey(int OCustkey) {
        this.OCustkey = OCustkey;
    }
    public char getOOrderstatus() {
        return this.OOrderstatus;
    }

    public void setOOrderstatus(char OOrderstatus) {
        this.OOrderstatus = OOrderstatus;
    }
    public Double getOTotalprice() {
        return this.OTotalprice;
    }

    public void setOTotalprice(Double OTotalprice) {
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

}


