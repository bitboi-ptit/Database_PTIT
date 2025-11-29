
package BUS.BusAccessor;
import DataAccess.DataAccessObject.PhieuHuyDAO;
import DataAccess.DataAccessObject.ISimpleAccess;
import DataTransfer.ChiTietPhieuHuy;
import DataTransfer.PhieuHuy;
import java.util.List;

public class PhieuHuyBUS extends AbstractBUSAccessor<PhieuHuy, Integer, PhieuHuyDAO>{
    public PhieuHuyBUS(){
        setDao(new PhieuHuyDAO());
    }
    
    public List<PhieuHuy> getFilter(String maNV, String maPN, String ngayBD, String ngayKT) {
        return dao.selectAndFilter(maNV, maPN, ngayBD, ngayKT);
    }
    
    public List<PhieuHuy> getPhieuHuyInTime(String ngayBD, String ngayKT) {
        return dao.selectAndFilter("", "", ngayBD, ngayKT);
    }
    
    @Override
    public boolean remove(Integer key) {// khi xoa phieu huy thi se cap nhat lai so luong san pham
        CTPhieuHuyBUS ctHuy = new CTPhieuHuyBUS();
        List<ChiTietPhieuHuy> list = ctHuy.getByKey1(key);
        SanPhamBUS spBus = new SanPhamBUS();
        if (list != null && !list.isEmpty()){
            for (ChiTietPhieuHuy ph: list){
               int maSP = ph.getMaSP();
               spBus.thayDoiSoLuong(maSP, ph.getSoLuong());
            }
        }
        return dao.delete(key);
    }
    
    @Override
    public PhieuHuy getNewest(){
        return dao.selectNewest();
    }
    
}
