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
public class Partsupp  implements java.io.Serializable {


     private PartsuppId id;
     private Part part;
     private Supplier supplier;
     private int psAvailqty;
     private BigDecimal psSupplycost;
     private String psComment;
     private Set lineitems = new HashSet(0);

    public Partsupp() {
    }

	
    public Partsupp(PartsuppId id, Part part, Supplier supplier, int psAvailqty, BigDecimal psSupplycost, String psComment) {
        this.id = id;
        this.part = part;
        this.supplier = supplier;
        this.psAvailqty = psAvailqty;
        this.psSupplycost = psSupplycost;
        this.psComment = psComment;
    }
    public Partsupp(PartsuppId id, Part part, Supplier supplier, int psAvailqty, BigDecimal psSupplycost, String psComment, Set lineitems) {
       this.id = id;
       this.part = part;
       this.supplier = supplier;
       this.psAvailqty = psAvailqty;
       this.psSupplycost = psSupplycost;
       this.psComment = psComment;
       this.lineitems = lineitems;
    }
    @SpaceId
    public PartsuppId getId() {
        return this.id;
    }
    
    public void setId(PartsuppId id) {
        this.id = id;
    }
    public Part getPart() {
        return this.part;
    }
    
    public void setPart(Part part) {
        this.part = part;
    }
    public Supplier getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public int getPsAvailqty() {
        return this.psAvailqty;
    }
    
    public void setPsAvailqty(int psAvailqty) {
        this.psAvailqty = psAvailqty;
    }
    public BigDecimal getPsSupplycost() {
        return this.psSupplycost;
    }
    
    public void setPsSupplycost(BigDecimal psSupplycost) {
        this.psSupplycost = psSupplycost;
    }
    public String getPsComment() {
        return this.psComment;
    }
    
    public void setPsComment(String psComment) {
        this.psComment = psComment;
    }
    public Set getLineitems() {
        return this.lineitems;
    }
    
    public void setLineitems(Set lineitems) {
        this.lineitems = lineitems;
    }




}


