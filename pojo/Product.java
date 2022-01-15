/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.majorproject.pojo;

/**
 *
 * @author Nikita
 */
public class Product {
//    private String prodId;
    private String prodName;
    private double prodAmt;

    
    @Override
    public String toString() {
        return "Product{" + "prodName=" + prodName + ", prodAmt=" + prodAmt + '}';
    }

//    public String getProdId() {
//        return prodId;
//    }
//
//    public void setProdId(String prodId) {
//        this.prodId = prodId;
//    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdAmt() {
        return prodAmt;
    }

    public void setProdAmt(double prodAmt) {
        this.prodAmt = prodAmt;
    }

//    public Product(String prodId, String prodName, double prodAmt) {
//        this.prodId = prodId;
//        this.prodName = prodName;
//        this.prodAmt = prodAmt;
//    }
    public Product(String prodName, double prodAmt) {
      
        this.prodName = prodName;
        this.prodAmt = prodAmt;
    }
    
}
