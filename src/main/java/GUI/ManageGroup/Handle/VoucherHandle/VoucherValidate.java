/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.ManageGroup.Handle.VoucherHandle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import BUS.SaleServices.CheckInfoSale;
import DataTransfer.Voucher;


public class VoucherValidate {
    private Voucher validatedVoucher;
    private final CheckInfoSale checkInfoSale;

    public VoucherValidate() {
        validatedVoucher = new Voucher();
        checkInfoSale = new CheckInfoSale();
    }

    public boolean validateAll(String codeVoucher, String minimizeVoucher, String maxmizeVoucher, String startDay, String endDay, String percent, String numberUser, String describe) {
        return checkCodeVoucher(codeVoucher) 
                && checkMinimizeVoucher(minimizeVoucher) 
                && checkMaxmizeVoucher(maxmizeVoucher) 
                && checkDateLogic(startDay, endDay) // Sửa: Dùng hàm check logic ngày
                && isCheckPercent(percent) 
                && isCheckNumberUser(numberUser) 
                && isCheckDescribe(describe)
                && checkHasVoucher(codeVoucher);
    }

    public boolean validateAllExpectCodeVoucher(String minimizeVoucher, String maxmizeVoucher, String startDay, String endDay, String percent, String numberUser, String describe) {
        return checkMinimizeVoucher(minimizeVoucher) 
                && checkMaxmizeVoucher(maxmizeVoucher) 
                && checkDateLogic(startDay, endDay) 
                && isCheckPercent(percent) 
                && isCheckNumberUser(numberUser) 
                && isCheckDescribe(describe);
    }

    private boolean checkHasVoucher(String codeVoucher) {
        return !checkInfoSale.hasVoucher(codeVoucher);
    }


    private boolean checkCodeVoucher(String codeVoucher) {
        if (codeVoucher.length() > 11)
            return false;
        this.validatedVoucher.setMaVoucher(codeVoucher);
        return true;
    }

    public boolean checkMinimizeVoucher(String minimizeVoucher) {
        Long value = Long.valueOf(minimizeVoucher);
        if (value <= 0)
            return false;
        this.validatedVoucher.setGiaTriToiThieu(value);
        return true;
    }

    public boolean checkMaxmizeVoucher(String maxmizeVoucher) {
        Long value = Long.valueOf(maxmizeVoucher);
        if (value <= 0)
            return false;
        this.validatedVoucher.setKmToiDa(value);
        return true;
    }

    public boolean checkDateLogic(String startDay, String endDay) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false); // Bắt buộc đúng ngày (không chấp nhận 32/01)
        try {
            Date start = format.parse(startDay);
            Date end = format.parse(endDay);
            
            // Ngày kết thúc phải sau hoặc bằng ngày bắt đầu
            if (end.before(start)) {
                System.out.println("Lỗi: Ngày kết thúc trước ngày bắt đầu");
                return false;
            }
            return true;
        } catch (ParseException e) {
            System.out.println("Lỗi format ngày tháng");
            return false;
        }
    }

    public boolean isCheckPercent(String percent) {
        try {
            int val = Integer.parseInt(percent);
            return val > 0 && val <= 100; // Phần trăm phải từ 1-100
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isCheckNumberUser(String numberUser) {
        try {
            return Integer.parseInt(numberUser) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isCheckDescribe(String describe) {
        if (describe == null) return false;
        return describe.length() > 0;
    }

    public Voucher getValidatedVoucher() {
        return validatedVoucher;
    }

    public void setValidatedVoucher(Voucher validatedVoucher) {
        this.validatedVoucher = validatedVoucher;
    }
}

     
     
    
