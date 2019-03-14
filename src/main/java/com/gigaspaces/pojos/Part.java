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
public class Part  implements java.io.Serializable {


     private int PPartkey;
     private String PName;
     private String PMfgr;
     private String PBrand;
     private String PType;
     private int PSize;
     private String PContainer;
     private BigDecimal PRetailprice;
     private String PComment;
     private Set partsupps = new HashSet(0);

    public Part() {
    }

	
    public Part(int PPartkey, String PName, String PMfgr, String PBrand, String PType, int PSize, String PContainer, BigDecimal PRetailprice, String PComment) {
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
    public Part(int PPartkey, String PName, String PMfgr, String PBrand, String PType, int PSize, String PContainer, BigDecimal PRetailprice, String PComment, Set partsupps) {
       this.PPartkey = PPartkey;
       this.PName = PName;
       this.PMfgr = PMfgr;
       this.PBrand = PBrand;
       this.PType = PType;
       this.PSize = PSize;
       this.PContainer = PContainer;
       this.PRetailprice = PRetailprice;
       this.PComment = PComment;
       this.partsupps = partsupps;
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
    public BigDecimal getPRetailprice() {
        return this.PRetailprice;
    }
    
    public void setPRetailprice(BigDecimal PRetailprice) {
        this.PRetailprice = PRetailprice;
    }
    public String getPComment() {
        return this.PComment;
    }
    
    public void setPComment(String PComment) {
        this.PComment = PComment;
    }
    public Set getPartsupps() {
        return this.partsupps;
    }
    
    public void setPartsupps(Set partsupps) {
        this.partsupps = partsupps;
    }




}


