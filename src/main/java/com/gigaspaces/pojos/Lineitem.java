package com.gigaspaces.pojos;
// Generated 13 Mar, 2019 4:21:19 PM by Hibernate Tools 4.3.1


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Nihar_Kapadia
 * Date: 13.03.2019
 */
@SpaceClass
public class Lineitem  implements java.io.Serializable {


     private LineitemId id;
     private Orders orders;
     private Partsupp partsupp;
     private BigDecimal LQuantity;
     private BigDecimal LExtendedprice;
     private BigDecimal LDiscount;
     private BigDecimal LTax;
     private char LReturnflag;
     private char LLinestatus;
     private Date LShipdate;
     private Date LCommitdate;
     private Date LReceiptdate;
     private String LShipinstruct;
     private String LShipmode;
     private String LComment;

    public Lineitem() {
    }

    public Lineitem(LineitemId id, Orders orders, Partsupp partsupp, BigDecimal LQuantity, BigDecimal LExtendedprice, BigDecimal LDiscount, BigDecimal LTax, char LReturnflag, char LLinestatus, Date LShipdate, Date LCommitdate, Date LReceiptdate, String LShipinstruct, String LShipmode, String LComment) {
       this.id = id;
       this.orders = orders;
       this.partsupp = partsupp;
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
    @SpaceId
    public LineitemId getId() {
        return this.id;
    }
    
    public void setId(LineitemId id) {
        this.id = id;
    }
    public Orders getOrders() {
        return this.orders;
    }
    
    public void setOrders(Orders orders) {
        this.orders = orders;
    }
    public Partsupp getPartsupp() {
        return this.partsupp;
    }
    
    public void setPartsupp(Partsupp partsupp) {
        this.partsupp = partsupp;
    }
    public BigDecimal getLQuantity() {
        return this.LQuantity;
    }
    
    public void setLQuantity(BigDecimal LQuantity) {
        this.LQuantity = LQuantity;
    }
    public BigDecimal getLExtendedprice() {
        return this.LExtendedprice;
    }
    
    public void setLExtendedprice(BigDecimal LExtendedprice) {
        this.LExtendedprice = LExtendedprice;
    }
    public BigDecimal getLDiscount() {
        return this.LDiscount;
    }
    
    public void setLDiscount(BigDecimal LDiscount) {
        this.LDiscount = LDiscount;
    }
    public BigDecimal getLTax() {
        return this.LTax;
    }
    
    public void setLTax(BigDecimal LTax) {
        this.LTax = LTax;
    }
    public char getLReturnflag() {
        return this.LReturnflag;
    }
    
    public void setLReturnflag(char LReturnflag) {
        this.LReturnflag = LReturnflag;
    }
    public char getLLinestatus() {
        return this.LLinestatus;
    }
    
    public void setLLinestatus(char LLinestatus) {
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




}


