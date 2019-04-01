package com.gigaspaces.pojos;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Region  implements java.io.Serializable {


     private int RRegionkey;
     private String RName;
     private String RComment;

    public Region() {
    }

	
    public Region(int RRegionkey, String RName) {
        this.RRegionkey = RRegionkey;
        this.RName = RName;
    }
    public Region(int RRegionkey, String RName, String RComment) {
       this.RRegionkey = RRegionkey;
       this.RName = RName;
       this.RComment = RComment;
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

}


