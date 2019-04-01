package com.gigaspaces.pojos;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.sql.Date;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Lineitem implements java.io.Serializable {


    private String id;
    private int LOrderkey;
    private int LLinenumber;
    private int LPartkey;
    private int LSuppkey;
    private Double LQuantity;
    private Double LExtendedprice;
    private Double LDiscount;
    private Double LTax;
    private Character LReturnflag;
    private Character LLinestatus;
    private Date LShipdate;
    private Date LCommitdate;
    private Date LReceiptdate;
    private String LShipinstruct;
    private String LShipmode;
    private String LComment;

    public Lineitem() {
    }

    public Lineitem(String id,int LOrderkey,int LLinenumber, int LPartkey, int LSuppkey, Double LQuantity, Double LExtendedprice, Double LDiscount, Double LTax, char LReturnflag, char LLinestatus, Date LShipdate, Date LCommitdate, Date LReceiptdate, String LShipinstruct, String LShipmode, String LComment) {
        this.id = id;
        this.LOrderkey = LOrderkey;
        this.LLinenumber = LLinenumber;
        this.LPartkey = LPartkey;
        this.LSuppkey = LSuppkey;
        this.LQuantity = LQuantity;
        this.LExtendedprice = LExtendedprice;
        this.LDiscount = LDiscount;
        this.LTax = LTax;
        this.LReturnflag = LReturnflag;
        this.LLinestatus = LLinestatus;
        this.LShipdate = LShipdate;
        this.LCommitdate = LCommitdate;
        this.LReceiptdate = LReceiptdate;
        this.LShipinstruct = LShipinstruct;
        this.LShipmode = LShipmode;
        this.LComment = LComment;
    }
    @SpaceId(autoGenerate = false)
    public String getId() {
        return getLOrderkey()+"_"+getLLinenumber();
    }

    public void setId(String id) {
        this.id = id;
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

    public Double getLQuantity() {return this.LQuantity; }

    public void setLQuantity(Double LQuantity) {
        this.LQuantity = LQuantity;
    }

    public Double getLExtendedprice() {
        return this.LExtendedprice;
    }

    public void setLExtendedprice(Double LExtendedprice) {
        this.LExtendedprice = LExtendedprice;
    }

    public Double getLDiscount() {
        return this.LDiscount;
    }

    public void setLDiscount(Double LDiscount) {
        this.LDiscount = LDiscount;
    }

    public Double getLTax() {
        return this.LTax;
    }

    public void setLTax(Double LTax) {
        this.LTax = LTax;
    }

    public Character getLReturnflag() {
        return this.LReturnflag;
    }

    public void setLReturnflag(Character LReturnflag) {
        this.LReturnflag = LReturnflag;
    }

    public Character getLLinestatus() {
        return this.LLinestatus;
    }

    public void setLLinestatus(Character LLinestatus) {
        this.LLinestatus = LLinestatus;
    }

    public Date getLShipdate() {
        return this.LShipdate;
    }

    public void setLShipdate(Date LShipdate) {
        this.LShipdate = LShipdate;
    }

    public Date getLCommitdate() {
        return this.LCommitdate;
    }

    public void setLCommitdate(Date LCommitdate) {
        this.LCommitdate = LCommitdate;
    }

    public Date getLReceiptdate() {
        return this.LReceiptdate;
    }

    public void setLReceiptdate(Date LReceiptdate) {
        this.LReceiptdate = LReceiptdate;
    }

    public String getLShipinstruct() {
        return this.LShipinstruct;
    }

    public void setLShipinstruct(String LShipinstruct) {
        this.LShipinstruct = LShipinstruct;
    }

    public String getLShipmode() {
        return this.LShipmode;
    }

    public void setLShipmode(String LShipmode) {
        this.LShipmode = LShipmode;
    }

    public String getLComment() {
        return this.LComment;
    }

    public void setLComment(String LComment) {
        this.LComment = LComment;
    }

    public int getLPartkey() {
        return LPartkey;
    }

    public void setLPartkey(int LPartkey) {
        this.LPartkey = LPartkey;
    }

    public int getLSuppkey() {
        return LSuppkey;
    }

    public void setLSuppkey(int LSuppkey) {
        this.LSuppkey = LSuppkey;
    }
}


