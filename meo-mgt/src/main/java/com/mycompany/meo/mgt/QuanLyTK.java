/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meo.mgt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLyTK {
    private List<TaiKhoan> ds = new ArrayList<>();
    
    public void themTK(TaiKhoan... a) {
        ds.addAll(Arrays.asList(a));
    }
    
    public void hienThiTK() {
        this.ds.forEach(tk -> tk.hienThi());
    }
}
