/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meo.mgt;

/**
 *
 * @author admin
 */
public class TkKhongKyHan extends TaiKhoan{

    public TkKhongKyHan(String tenTK, int soTien) {
       super(tenTK, soTien);
    } 

    @Override
    public boolean isDaoHan() {
        return true;
    }

    @Override
    public double tinhLai() {
        return this.soTien*0.1/100;
    }
    
    
}
