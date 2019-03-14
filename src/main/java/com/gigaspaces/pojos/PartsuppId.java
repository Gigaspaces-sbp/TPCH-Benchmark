package com.gigaspaces.pojos;




/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
public class PartsuppId  implements java.io.Serializable {


     private int psPartkey;
     private int psSuppkey;

    public PartsuppId() {
    }

    public PartsuppId(int psPartkey, int psSuppkey) {
       this.psPartkey = psPartkey;
       this.psSuppkey = psSuppkey;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PartsuppId) ) return false;
		 PartsuppId castOther = ( PartsuppId ) other; 
         
		 return (this.getPsPartkey()==castOther.getPsPartkey())
 && (this.getPsSuppkey()==castOther.getPsSuppkey());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPsPartkey();
         result = 37 * result + this.getPsSuppkey();
         return result;
   }   


}


