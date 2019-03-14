package com.gigaspaces.pojos;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Region  implements java.io.Serializable {


     private int RRegionkey;
     private String RName;
     private String RComment;
     private Set nations = new HashSet(0);

    public Region() {
    }

	
    public Region(int RRegionkey, String RName) {
        this.RRegionkey = RRegionkey;
        this.RName = RName;
    }
    public Region(int RRegionkey, String RName, String RComment, Set nations) {
       this.RRegionkey = RRegionkey;
       this.RName = RName;
       this.RComment = RComment;
       this.nations = nations;
    }
    @SpaceId
    public int getRRegionkey() {
        return this.RRegionkey;
    }
    
    public void setRRegionkey(int RRegionkey) {
        this.RRegionkey = RRegionkey;
    }
    public String getRName() {
        return this.RName;
    }
    
    public void setRName(String RName) {
        this.RName = RName;
    }
    public String getRComment() {
        return this.RComment;
    }
    
    public void setRComment(String RComment) {
        this.RComment = RComment;
    }
    public Set getNations() {
        return this.nations;
    }
    
    public void setNations(Set nations) {
        this.nations = nations;
    }




}


