package BUS.BusAccessor;

import java.util.ArrayList;
import java.util.List;

import DataAccess.DataAccessObject.GiamGiaSPDAO;
import DataTransfer.GiamGiaSP;

public class GiamGiaSPBUS implements IBusAccess<GiamGiaSP, Integer>{
    private final GiamGiaSPDAO giamgiaSPDA = new GiamGiaSPDAO();

    @Override
    public GiamGiaSP get(Integer soPhieu) {
        return giamgiaSPDA.select(soPhieu);
    }

    @Override
    public List<GiamGiaSP> getAll() {
        return giamgiaSPDA.selectAll();
    }

    @Override
    public boolean add(GiamGiaSP data) {
        return giamgiaSPDA.insert(data);
    }

    @Override
    public boolean edit(Integer soPhieu, GiamGiaSP data) {
        return giamgiaSPDA.update(soPhieu, data);
    }

    @Override
    public boolean remove(Integer soPhieu) {
        return giamgiaSPDA.delete(soPhieu);
    }

    @Override
    public GiamGiaSP getNewest() {
        List<GiamGiaSP> list = getAll();
        return list == null ? null : list.get(list.size() - 1);
    }
 
    public String[][] convertToStringList(){
        List<GiamGiaSP> lsGiamGiaSP = getAll();
        if (lsGiamGiaSP == null || lsGiamGiaSP.isEmpty()) return null;
        String[][] datas = new String[lsGiamGiaSP.size()][];
        List<String> data = new ArrayList<>();
        
        int i = 0;
        for(GiamGiaSP giamGia : lsGiamGiaSP){
            data.clear();
            data.add(giamGia.getSoPhieu()+"");
            data.add(giamGia.getMaSP()+"");
            data.add(giamGia.getPtGiam()+"%");
            datas[i] = data.toArray(String[] :: new);
            i++;
        }
        return datas;
    }
    
    public GiamGiaSP getGiamGiaByMaSP(int maSP){
        return giamgiaSPDA.selectByMaSP(maSP);
    }
}
