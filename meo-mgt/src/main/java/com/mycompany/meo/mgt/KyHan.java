
package com.mycompany.meo.mgt;

import java.time.LocalDate;


public enum KyHan {
    MOT_TUAN(7, 0.5) {
        @Override
        public LocalDate tinhDaoHan(LocalDate ngayBatDau) {
            return ngayBatDau.plusDays(this.KhoangThoiGian); 
        }

        @Override
        public double tinhLai(double st) {
            return (st * this.laiSuat) / (12*100*4);
        }
    },
    MOT_THANG(1, 4.5) {
        @Override
        public LocalDate tinhDaoHan(LocalDate ngayBatDau) {
            return ngayBatDau.plusMonths(this.KhoangThoiGian); 
        }

        @Override
        public double tinhLai(double st) {
            return (st * this.laiSuat) / (12*100);
        }
    },
    MOT_NAM(1, 6.8) {
        @Override
        public LocalDate tinhDaoHan(LocalDate ngayBatDau) {
            return ngayBatDau.plusYears(this.KhoangThoiGian); 
        }

        @Override
        public double tinhLai(double st) {
            return (st * this.laiSuat) / 100;
        }
    };
    
    protected int KhoangThoiGian;
    protected double laiSuat;
    
    private KyHan(int KhoangThoiGian, double ls) {
        this.KhoangThoiGian = KhoangThoiGian;
        this.laiSuat = ls;
    }
    
    public abstract LocalDate tinhDaoHan(LocalDate ngayBatDau);
    public abstract double tinhLai(double st);
}
