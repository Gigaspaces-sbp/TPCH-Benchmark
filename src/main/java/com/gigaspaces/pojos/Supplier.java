package com.gigaspaces.pojos;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Supplier  implements java.io.Serializable {


     private int SSuppkey;
     private int SNationkey;
     private String SName;
     private String SAddress;
     private String SPhone;
     private Double SAcctbal;
     private String SComment;

    public Supplier() {
    }


    public Supplier(int SSuppkey, int SNationkey, String SName, String SAddress, String SPhone, Double SAcctbal, String SComment) {
        this.SSuppkey = SSuppkey;
        this.SNationkey = SNationkey;
        this.SName = SName;
        this.SAddress = SAddress;
        this.SPhone = SPhone;
        this.SAcctbal = SAcctbal;
        this.SComment = SComment;
    }

    @SpaceId
    public int getSSuppkey() {
        return this.SSuppkey;
    }

    public void setSSuppkey(int SSuppkey) {
        this.SSuppkey = SSuppkey;
    }
    public int getSNationkey() {
        return this.SNationkey;
    }

    public void setSNationkey(int SNationkey) {
        this.SNationkey = SNationkey;
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
    public Double getSAcctbal() {
        return this.SAcctbal;
    }

    public void setSAcctbal(Double SAcctbal) {
        this.SAcctbal = SAcctbal;
    }
    public String getSComment() {
        return this.SComment;
    }
    
    public void setSComment(String SComment) {
        this.SComment = SComment;
    }

}


