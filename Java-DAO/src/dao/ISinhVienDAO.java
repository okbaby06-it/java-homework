package dao;

import model.SinhVien;

public interface ISinhVienDAO extends IGenericDAO<SinhVien, String>{
    //chi can them phuong thuc can thiet, rieng cua sinh vien
    SinhVien findSinhVien(String id);
}
