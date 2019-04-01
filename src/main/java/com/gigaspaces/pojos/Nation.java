package com.gigaspaces.pojos;



import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.util.HashSet;
import java.util.Set;

/*
 *@author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Nation  implements java.io.Serializable {


     private int NNationkey;
     private int NRegionkey;
     private String NName;
     private String NComment;

    public Nation() {
    }

	
    public Nation(int NNationkey, int NRegionkey, String NName) {
        this.NNationkey = NNationkey;
        this.NRegionkey = NRegionkey;
        this.NName = NName;
    }
    public Nation(int NNationkey, int NRegionkey, String NName, String NComment) {
       this.NNationkey = NNationkey;
       this.NRegionkey = NRegionkey;
       this.NName = NName;
       this.NComment = NComment;
    }
    @SpaceId
    public int getNNationkey() {
        return this.NNationkey;
    }
    
    public void setNNationkey(int NNationkey) {
        this.NNationkey = NNationkey;
    }
    public int getNRegionkey() {
        return this.NRegionkey;
    }
    
    public void setNRegionkey(int NRegionkey) {
        this.NRegionkey = NRegionkey;
    }
    public String getNName() {
        return this.NName;
    }
    
    public void setNName(String NName) {
        this.NName = NName;
    }
    public String getNComment() {
        return this.NComment;
    }

    public void setNComment(String NComment) {
        this.NComment = NComment;
    }
}


