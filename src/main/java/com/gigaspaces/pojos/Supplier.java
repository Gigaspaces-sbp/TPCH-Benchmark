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
public class Supplier  implements java.io.Serializable {


     private int SSuppkey;
     private Nation nation;
     private String SName;
     private String SAddress;
     private String SPhone;
     private BigDecimal SAcctbal;
     private String SComment;
     private Set partsupps = new HashSet(0);

    public Supplier() {
    }

	
    public Supplier(int SSuppkey, Nation nation, String SName, String SAddress, String SPhone, BigDecimal SAcctbal, String SComment) {
        this.SSuppkey = SSuppkey;
        this.nation = nation;
        this.SName = SName;
        this.SAddress = SAddress;
        this.SPhone = SPhone;
        this.SAcctbal = SAcctbal;
        this.SComment = SComment;
    }
    public Supplier(int SSuppkey, Nation nation, String SName, String SAddress, String SPhone, BigDecimal SAcctbal, String SComment, Set partsupps) {
       this.SSuppkey = SSuppkey;
       this.nation = nation;
       this.SName = SName;
       this.SAddress = SAddress;
       this.SPhone = SPhone;
       this.SAcctbal = SAcctbal;
       this.SComment = SComment;
       this.partsupps = partsupps;
    }
    @SpaceId
    public int getSSuppkey() {
        return this.SSuppkey;
    }
    
    public void setSSuppkey(int SSuppkey) {
        this.SSuppkey = SSuppkey;
    }
    public Nation getNation() {
        return this.nation;
    }
    
    public void setNation(Nation nation) {
        this.nation = nation;
    }
    public String getSName() {
        return this.SName;
    }
    
    public void setSName(String SName) {
        this.SName = SName;
    }
    public String getSAddress() {
        return this.SAddress;
    }
    
    public void setSAddress(String SAddress) {
        this.SAddress = SAddress;
    }
    public String getSPhone() {
        return this.SPhone;
    }
    
    public void setSPhone(String SPhone) {
        this.SPhone = SPhone;
    }
    public BigDecimal getSAcctbal() {
        return this.SAcctbal;
    }
    
    public void setSAcctbal(BigDecimal SAcctbal) {
        this.SAcctbal = SAcctbal;
    }
    public String getSComment() {
        return this.SComment;
    }
    
    public void setSComment(String SComment) {
        this.SComment = SComment;
    }
    public Set getPartsupps() {
        return this.partsupps;
    }
    
    public void setPartsupps(Set partsupps) {
        this.partsupps = partsupps;
    }




}


