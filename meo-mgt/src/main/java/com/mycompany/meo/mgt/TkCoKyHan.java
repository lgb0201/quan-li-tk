/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meo.mgt;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class TkCoKyHan extends TaiKhoan{
    private KyHan kyHan;
    private LocalDate ngayDaoHan;

    public TkCoKyHan(String tenTK, int soTien, KyHan kyHan) {
        super(tenTK, soTien);
        this.kyHan = kyHan;
//        this.ngayDaoHan = LocalDate.now();
        
//        switch(kyHan) {
//            case MOT_TUAN -> this.ngayDaoHan = this.ngayDaoHan.plusDays(7);
//            case MOT_THANG -> this.ngayDaoHan = this.ngayDaoHan.plusMonths(1);
//            case MOT_NAM -> this.ngayDaoHan = this.ngayDaoHan.plusYears(1); 
//        }

        this.ngayDaoHan = kyHan.tinhDaoHan(LocalDate.now());
    }
    
    @Override
    public void hienThi() {
       super.hienThi();
        System.out.printf(" - Ky han: %s - Ngay dao han: %s\n", this.kyHan, this.ngayDaoHan.format(CauHinh.FORMATTER));
    }

    @Override
    public boolean isDaoHan() {
        return this.ngayDaoHan.compareTo(LocalDate.now()) < 0;
    }

    @Override
    public double tinhLai() {
        return this.kyHan.tinhLai(this.soTien);
    }
}
