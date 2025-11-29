/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DataAccess.DataAccessObject.ChucVuDAO;
import DataTransfer.ChucVu;

/**
 *
 * @author MY ACER
 */
public class ChucVuBUS extends AbstractBUSAccessor<ChucVu, Integer, ChucVuDAO>{

    public ChucVuBUS() {
        setDao(new ChucVuDAO());
    }
   
}
