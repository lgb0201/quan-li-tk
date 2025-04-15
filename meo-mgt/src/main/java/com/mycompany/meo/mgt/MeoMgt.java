/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meo.mgt;

/**
 *
 * @author admin
 */
public class MeoMgt {

    public static void main(String[] args) {
        QuanLyTK ql = new QuanLyTK();
        ql.themTK(new TkCoKyHan("Nguyen Van A", 5000, KyHan.MOT_NAM));
        ql.themTK(new TkKhongKyHan("Nguyen Van B", 7000));
        ql.hienThiTK();
        
    }
}
