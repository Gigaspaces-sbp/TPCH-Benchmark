package com.gigaspaces.pojos;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Partsupp  implements java.io.Serializable {


    private String id;
    private int psPartkey;
    private int psSuppkey;
    private int psAvailqty;
    private Double psSupplycost;
    private String psComment;

    public Partsupp() {
    }


    public Partsupp(String id,int psPartkey, int psSuppkey, int psAvailqty, Double psSupplycost, String psComment) {
        this.id=id;
        this.psPartkey = psPartkey;
        this.psSuppkey = psSuppkey;
        this.psAvailqty = psAvailqty;
        this.psSupplycost = psSupplycost;
        this.psComment = psComment;
    }
    @SpaceId(autoGenerate = true)
    public String getId() {
        return getPsPartkey()+"_"+getPsSuppkey();
    }

    public void setId(String id) {
        this.id = id;
    }


    public int getPsPartkey() {
        return this.psPartkey;
    }

    public void setPsPartkey(int psPartkey) {
        this.psPartkey = psPartkey;
    }

    public int getPsSuppkey() {
        return this.psSuppkey;
    }

    public void setPsSuppkey(int psSuppkey) {
        this.psSuppkey = psSuppkey;
    }

    public int getPsAvailqty() {
        return this.psAvailqty;
    }

    public void setPsAvailqty(int psAvailqty) {
        this.psAvailqty = psAvailqty;
    }
    public Double getPsSupplycost() {
        return this.psSupplycost;
    }

    public void setPsSupplycost(Double psSupplycost) {
        this.psSupplycost = psSupplycost;
    }
    public String getPsComment() {
        return this.psComment;
    }
    
    public void setPsComment(String psComment) {
        this.psComment = psComment;
    }

}


