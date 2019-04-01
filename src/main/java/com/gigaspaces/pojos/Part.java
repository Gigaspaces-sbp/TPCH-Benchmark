package com.gigaspaces.pojos;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Part  implements java.io.Serializable {


     private int PPartkey;
     private String PName;
     private String PMfgr;
     private String PBrand;
     private String PType;
     private int PSize;
     private String PContainer;
     private Double PRetailprice;
     private String PComment;

    public Part() {
    }


    public Part(int PPartkey, String PName, String PMfgr, String PBrand, String PType, int PSize, String PContainer, Double PRetailprice, String PComment) {
        this.PPartkey = PPartkey;
        this.PName = PName;
        this.PMfgr = PMfgr;
        this.PBrand = PBrand;
        this.PType = PType;
        this.PSize = PSize;
        this.PContainer = PContainer;
        this.PRetailprice = PRetailprice;
        this.PComment = PComment;
    }

    @SpaceId
    public int getPPartkey() {
        return this.PPartkey;
    }

    public void setPPartkey(int PPartkey) {
        this.PPartkey = PPartkey;
    }
    public String getPName() {
        return this.PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }
    public String getPMfgr() {
        return this.PMfgr;
    }

    public void setPMfgr(String PMfgr) {
        this.PMfgr = PMfgr;
    }
    public String getPBrand() {
        return this.PBrand;
    }

    public void setPBrand(String PBrand) {
        this.PBrand = PBrand;
    }
    public String getPType() {
        return this.PType;
    }

    public void setPType(String PType) {
        this.PType = PType;
    }
    public int getPSize() {
        return this.PSize;
    }

    public void setPSize(int PSize) {
        this.PSize = PSize;
    }
    public String getPContainer() {
        return this.PContainer;
    }

    public void setPContainer(String PContainer) {
        this.PContainer = PContainer;
    }
    public Double getPRetailprice() {
        return this.PRetailprice;
    }

    public void setPRetailprice(Double PRetailprice) {
        this.PRetailprice = PRetailprice;
    }
    public String getPComment() {
        return this.PComment;
    }
    
    public void setPComment(String PComment) {
        this.PComment = PComment;
    }
}


