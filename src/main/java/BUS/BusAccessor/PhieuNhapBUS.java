
package BUS.BusAccessor;

import DataAccess.DataAccessObject.PhieuNhapDAO;
import DataTransfer.ChiTietPhieuHuy;
import DataTransfer.ChiTietPhieuNhap;
import DataTransfer.PhieuNhap;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhieuNhapBUS extends AbstractBUSAccessor<PhieuNhap, Integer, PhieuNhapDAO>{
    public PhieuNhapBUS(){
        setDao(new PhieuNhapDAO());
    }
    
    public List<PhieuNhap> getFilter(String maNV, String maPN, String ngayBD, String ngayKT) {
        return dao.selectAndFilter(maNV, maPN, ngayBD, ngayKT);
    }
    
    public List<PhieuNhap> getPhieuNhapInTime(String ngayBD, String ngayKT) {
        return dao.selectAndFilter("", "", ngayBD, ngayKT);
    }
    
    @Override
    public boolean remove(Integer key) {
        CTPhieuNhapBUS ctNhap = new CTPhieuNhapBUS();
        List<ChiTietPhieuNhap> list = ctNhap.getByKey1(key);
        SanPhamBUS spBus = new SanPhamBUS();
        if (list != null && !list.isEmpty()){
            for (ChiTietPhieuNhap ph: list){
               int maSP = ph.getMaSP();
               spBus.thayDoiSoLuong(maSP, -ph.getSoLuong());
            }
        }
        return dao.delete(key);
    }
    
    @Override
    public PhieuNhap getNewest(){
        return dao.selectNewest();
    }
    
    public List<PhieuNhap> locPhieuNhap(int maNV, int maPhieuNhap, String ngayBD, String ngayKT){
        List<PhieuNhap> list = this.getAll();
        List<PhieuNhap> tempList = new ArrayList<>();
        if (maPhieuNhap > 0){
            for (PhieuNhap ph : list){
                if (ph.getMaPhieu() == maPhieuNhap)
                    tempList.add(ph);
            }
            if (tempList.isEmpty()) return null;
        }
        if (maNV >0){
            if (tempList.isEmpty()) tempList = list;
            List<PhieuNhap> storeTemp = new ArrayList<>();
            for (PhieuNhap ph: tempList){
                if (ph.getMaNV() == maNV)
                    storeTemp.add(ph);
            }
            if (storeTemp.isEmpty()) return null;
            tempList = storeTemp;
        }
        
        if (tempList.isEmpty()){
            tempList = list;
        }
        
        try {
            Date bd = new SimpleDateFormat("dd-MM-yyyy").parse(ngayBD);
            Date kt = new SimpleDateFormat("dd-MM-yyyy").parse(ngayKT);
            List<PhieuNhap> storeTemp = new ArrayList<>();
            for (PhieuNhap ph: tempList){
                if (ph.getNgayLap().compareTo(bd)>=0 && ph.getNgayLap().compareTo(kt) <=0){
                    storeTemp.add(ph);
                }
            }
            return storeTemp;
        } catch (ParseException ex) {
        }
        return null;
    }
}
