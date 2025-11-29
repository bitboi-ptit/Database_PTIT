package DataAccess.DataAccessObject;

import DataTransfer.NhaCungCap;

import java.util.List;

public class TaiKhoanDAO extends AbstractAccessData<NhaCungCap.TaiKhoan> implements ISimpleAccess<NhaCungCap.TaiKhoan, Integer>{
    {
        setClazz(NhaCungCap.TaiKhoan.class);
    }
    @Override
    public boolean insert(NhaCungCap.TaiKhoan taiKhoan) {
        return executeUpdate("INSERT INTO TAIKHOAN(TENTK,MATKHAU,MANV,SOLANSAI,NGAYTAO,IS_DELETED) VALUES(?,?,?,?,?,?)",
        taiKhoan.getTenTK(),taiKhoan.getMatKhau(),taiKhoan.getMaNV(),taiKhoan.getSoLanSai(),taiKhoan.getNgayTao(),taiKhoan.isDeleted());
    }

    @Override
    public boolean update(Integer soTaiKhoan, NhaCungCap.TaiKhoan taiKhoan) {
        return executeUpdate("UPDATE TAIKHOAN SET TENTK = ?, MATKHAU = ?, MANV = ?, SOLANSAI = ?, NGAYTAO = ?, IS_DELETED = ? WHERE SOTK = ?",
                taiKhoan.getTenTK(),taiKhoan.getMatKhau(),taiKhoan.getMaNV(),taiKhoan.getSoLanSai(),taiKhoan.getNgayTao(),taiKhoan.isDeleted(),soTaiKhoan);
    }

    @Override
    public boolean delete(Integer soTaiKhoan) {
        return executeUpdate("DELETE FROM TAIKHOAN WHERE SOTK = ?", soTaiKhoan);
    }

    @Override
    public NhaCungCap.TaiKhoan select(Integer soTaiKhoan) {
        return executeQuery("SELECT * FROM TAIKHOAN WHERE SOTK = ?", soTaiKhoan);
    }

    @Override
    public List<NhaCungCap.TaiKhoan> selectAll() {
        return executeQueryList("SELECT * FROM TAIKHOAN WHERE IS_DELETED = 0");
    }

    public NhaCungCap.TaiKhoan selectByTenTK(String username){
        return executeQuery("SELECT * FROM TAIKHOAN WHERE TENTK = ? AND IS_DELETED = 0",username);
    }
}
