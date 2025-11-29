package BUS.BusAccessor;

import java.util.ArrayList;
import java.util.List;

import DataAccess.DataAccessObject.VoucherDAO;
import DataTransfer.Voucher;

public class VoucherBUS implements IBusAccess<Voucher,String>{
    private final VoucherDAO voucherDA = new VoucherDAO();
    @Override
    public Voucher get(String maVoucher) {
        return voucherDA.select(maVoucher);
    }

    @Override
    public List<Voucher> getAll() {
        return voucherDA.selectAll();
    }

    @Override
    public boolean add(Voucher vouncher) {
        return  voucherDA.insert(vouncher);
    }

    @Override
    public boolean edit(String maVoucher, Voucher voucher) {
        return voucherDA.update(maVoucher, voucher);
    }

    @Override
    public boolean remove(String maVoucher) {
        return voucherDA.delete(maVoucher);
    }

    @Override
    public Voucher getNewest() {
       List<Voucher> list=getAll();
       return list== null ? null : list.get(list.size()-1);
    }

    public String[][] convertToStringList(){
        List<Voucher> lsVoucher = getAll();
        if (lsVoucher == null || lsVoucher.isEmpty()) return null;
        String[][] datas = new String[lsVoucher.size()][];
        List<String> data = new ArrayList<>();
        
        int i = 0;
        for(Voucher voucher : lsVoucher){
            data.clear();
            data.add(voucher.getSoVoucher()+"");
            data.add(voucher.getMaVoucher());
            data.add(voucher.getPtGiam()+"");
            data.add(voucher.getSoLuotSD()+"");
            datas[i] = data.toArray(String[] :: new);
            i++;
        }
        
        return datas;
    }
}
