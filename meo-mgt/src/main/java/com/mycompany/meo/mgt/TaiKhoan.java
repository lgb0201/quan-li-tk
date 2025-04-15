/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meo.mgt;

/**
 *
 * @author admin
 */
public abstract class TaiKhoan {
    private static int count = 0;
    private String soTk = String.format("%6d", ++count);
    private String tenTk;
    protected int soTien;

    public TaiKhoan(String tenTk, int soTien) {
        this.tenTk = tenTk;
        this.soTien = soTien;
    }
    
    
    public void hienThi() {
        System.out.printf("%s - %s - %d", this.soTk, this.tenTk, this.soTien);
    }
    
    public abstract boolean isDaoHan();
    public void nopTien(int st) {
        if(isDaoHan())
            this.soTien += st;
    }
    
    public void rutTien(int st) {
        if(st < this.soTien && isDaoHan())
            this.soTien -= st;
    }
        
   public abstract double tinhLai();

    /**
     * @return the count
     */
    public static int getCount() {
        return count;
    }

    /**
     * @param aCount the count to set
     */
    public static void setCount(int aCount) {
        count = aCount;
    }

    /**
     * @return the soTk
     */
    public String getSoTk() {
        return soTk;
    }

    /**
     * @param soTk the soTk to set
     */
    public void setSoTk(String soTk) {
        this.soTk = soTk;
    }

    /**
     * @return the tenTk
     */
    public String getTenTk() {
        return tenTk;
    }

    /**
     * @param tenTk the tenTk to set
     */
    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }
    
}
