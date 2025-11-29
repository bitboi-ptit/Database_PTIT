/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.ManagerSale.BasicHandle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTextField;

import BUS.BusAccessor.SanPhamBUS;
import DataTransfer.SanPham;
import GUI.ManagerSale.Component.MenuPanel;
import GUI.ManagerSale.Component.MyLoaiSPComboBox;

/**
 *
 * @author huykh
 */
public class ComboBoxLoaiSPAction implements ActionListener{
    private MenuPanel menu;
    private JTextField searchField;
    private MyLoaiSPComboBox bx;
    private final SanPhamBUS spBus = new SanPhamBUS();

    public ComboBoxLoaiSPAction(MyLoaiSPComboBox bx, MenuPanel menu, JTextField searchField) {
        this.menu = menu;
        this.bx = bx;
        this.searchField = searchField;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("Click value: "+ bx.getSelectedMaLoai());
        int maLoaiHienTai = bx.getSelectedMaLoai();
        List<SanPham> list = spBus.getProductByTypeAndName(maLoaiHienTai, searchField.getText());
        menu.adDataTransferPanel(list);
    }
    
}
