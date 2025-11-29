
package BUS.BusAccessor;

import DataAccess.DataAccessObject.CTPhieuHuyDAO;
import DataTransfer.ChiTietPhieuHuy;
import java.util.List;
public class CTPhieuHuyBUS implements IBusAccessDetail<ChiTietPhieuHuy>{
    private CTPhieuHuyDAO dao = new CTPhieuHuyDAO();
    private SanPhamBUS spBUS = new SanPhamBUS();
    
    @Override
    public ChiTietPhieuHuy get(int key1, int key2) {
        return dao.select(key1, key2);
    }

    @Override
    public List<ChiTietPhieuHuy> getByKey1(int key1) {
        return dao.selectAllById1(key1);
    }

    @Override
    public List<ChiTietPhieuHuy> getByKey2(int key2) {
        return dao.selectAllById2(key2);
    }

    @Override
    public List<ChiTietPhieuHuy> getAll() {
        return dao.selectAll();
    }

    @Override
    public boolean add(ChiTietPhieuHuy data) {
        spBUS.thayDoiSoLuong(data.getMaSP(), -data.getSoLuong());
        return dao.insert(data);
    }

    @Override
    public boolean edit(int key1, int key2, ChiTietPhieuHuy data) {
        ChiTietPhieuHuy ct = this.get(key1, key2);
        spBUS.thayDoiSoLuong(key2, ct.getSoLuong() - data.getSoLuong());
        return dao.update(key1, key2, data);
    }

    @Override
    public boolean remove(int key1, int key2) {
        ChiTietPhieuHuy ct = this.get(key1, key2);
        spBUS.thayDoiSoLuong(key2, ct.getSoLuong());
        return dao.delete(key1, key2);
    }

    
    
}
