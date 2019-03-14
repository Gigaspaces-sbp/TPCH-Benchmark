package com.gigaspaces.pojos;



/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
public class LineitemId  implements java.io.Serializable {


     private int LOrderkey;
     private int LLinenumber;

    public LineitemId() {
    }

    public LineitemId(int LOrderkey, int LLinenumber) {
       this.LOrderkey = LOrderkey;
       this.LLinenumber = LLinenumber;
    }
   
    public int getLOrderkey() {
        return this.LOrderkey;
    }
    
    public void setLOrderkey(int LOrderkey) {
        this.LOrderkey = LOrderkey;
    }
    public int getLLinenumber() {
        return this.LLinenumber;
    }
    
    public void setLLinenumber(int LLinenumber) {
        this.LLinenumber = LLinenumber;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LineitemId) ) return false;
		 LineitemId castOther = ( LineitemId ) other; 
         
		 return (this.getLOrderkey()==castOther.getLOrderkey())
 && (this.getLLinenumber()==castOther.getLLinenumber());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getLOrderkey();
         result = 37 * result + this.getLLinenumber();
         return result;
   }   


}


