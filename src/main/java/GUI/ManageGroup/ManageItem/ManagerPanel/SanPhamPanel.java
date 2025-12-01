
package GUI.ManageGroup.ManageItem.ManagerPanel;

import BUS.BusAccessor.CTHoaDonBUS;
import BUS.BusAccessor.LoaiSanPhamBUS;
import BUS.BusAccessor.SanPhamBUS;
import DataTransfer.LoaiSanPham;
import DataTransfer.SanPham;
import GUI.ManageGroup.ManageItem.FrameAdd.FrameAdd.SanPhamAdd;
import GUI.ManageGroup.ManageItem.FrameAdd.FrameSua.SanPhamSua;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

public class SanPhamPanel extends javax.swing.JPanel {
    SanPhamBUS spBUS = new SanPhamBUS();
    SanPham sp = new SanPham();
    LoaiSanPhamBUS maloaiBUS = new LoaiSanPhamBUS();
    CTHoaDonBUS ctBUS = new CTHoaDonBUS();

    DefaultTableModel tableModel;

    /**
     * Creates new form SanPhamPanel
     */
    public SanPhamPanel() {
        initComponents();
        loadTable();
        LoadComboBox();

    }

    // Tạo Item Combobox
    public void LoadComboBox() {
        List<LoaiSanPham> iSP = maloaiBUS.getAll();
        if (iSP == null || iSP.isEmpty())
            return;
        for (int i = 0; i < iSP.size(); i++) {
            jComboBox1.addItem(GetLoai(iSP.get(i).getMaLoai()));
        }
        jComboBox1.setSelectedItem("Tất cả");
        // System.out.println("Load combobox thành công");
    }

    // Search Text Field
    public void FilterTF(String a) {
        tableModel = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(tableModel);
        jTable1.setRowSorter(tableRowSorter);
        int index = jComboBox2.getSelectedIndex();
        tableRowSorter.setRowFilter(RowFilter.regexFilter(a, index));
    }

    // Search Combobox
    public void FilterComboBox(String a) {

        tableModel = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(tableModel);
        jTable1.setRowSorter(tableRowSorter);
        if (a.equals("Tất cả")) {
            jTable1.setRowSorter(tableRowSorter);
        } else {
            tableRowSorter.setRowFilter(RowFilter.regexFilter(a, 4));
        }
    }

    // Get tên loại
    public String GetLoai(int maLoai) {
        return maloaiBUS.get(maLoai).getTenLoai();
    }

    // Load Table
    public void loadTable() {
        tableModel = (DefaultTableModel) jTable1.getModel();
        jTable1.getTableHeader().setEnabled(false); // không sửa được header
        List<SanPham> sp;
        if (jRadioButton1.isSelected()) {
            sp = spBUS.getAllSanPham();
            if (sp == null || sp.isEmpty())
                return;
            for (int i = 0; i < sp.size(); i++) {
                Object[] sanpham = { sp.get(i).getMaSP(), sp.get(i).getTenSP(), sp.get(i).getSoLuong(),
                        sp.get(i).getGiaTien(), GetLoai(sp.get(i).getMaLoai()),
                        spBUS.getSoLuongDaBan(sp.get(i).getMaSP()) };
                tableModel.addRow(sanpham);
            }

            TableColumn column = null;
            for (int i = 0; i < tableModel.getColumnCount(); i++) {
                column = jTable1.getColumnModel().getColumn(i);
                switch (i) {
                    case 0 -> column.setPreferredWidth(30);
                    case 1 -> column.setPreferredWidth(50);
                    case 2 -> column.setPreferredWidth(50);
                    case 3 -> column.setPreferredWidth(50);
                    default -> {
                    }
                }
            }
        }

        else {
            sp = spBUS.getAll();
            if (sp == null || sp.isEmpty())
                return;
            for (int i = 0; i < sp.size(); i++) {
                Object[] sanpham = { sp.get(i).getMaSP(), sp.get(i).getTenSP(), sp.get(i).getSoLuong(),
                        sp.get(i).getGiaTien(), GetLoai(sp.get(i).getMaLoai()),
                        spBUS.getSoLuongDaBan(sp.get(i).getMaSP()) };
                tableModel.addRow(sanpham);
            }

            TableColumn column = null;
            for (int i = 0; i < tableModel.getColumnCount(); i++) {
                column = jTable1.getColumnModel().getColumn(i);
                // Xét độ rộng culumn
                switch (i) {
                    case 0 -> column.setPreferredWidth(30);
                    case 1 -> column.setPreferredWidth(50);
                    case 2 -> column.setPreferredWidth(50);
                    case 3 -> column.setPreferredWidth(50);
                    default -> {
                    }
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp = new javax.swing.JPopupMenu();
        Sửa = new javax.swing.JMenuItem();
        Xóa = new javax.swing.JMenuItem();
        jLabel81 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        button6 = new GUI.LoginGUI.Component.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        productDetailPanel1 = new GUI.ManageGroup.ComponentPanel.ProductDetailPanel();
        jTextField1 = new javax.swing.JTextField();
        button2 = new GUI.LoginGUI.Component.Button();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();

        Sửa.setText("Sửa");
        Sửa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SửaActionPerformed(evt);
            }
        });
        popUp.add(Sửa);

        Xóa.setText("Xóa");
        Xóa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XóaActionPerformed(evt);
            }
        });
        popUp.add(Xóa);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 760));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(128, 0, 0));
        jLabel81.setText("QUẢN LÝ SẢN PHẨM");
        add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 50));

        jPanel6.setBackground(new java.awt.Color(128, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 10, Short.MAX_VALUE));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 10, 30));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(128, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png"))); // NOI18N
        jLabel47.setText("Thông tin chi tiết");
        add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 170, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(128, 0, 0));
        // jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/list-icon.png"))); // NOI18N
        jLabel48.setText("Danh sách sản phẩm");
        add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        button6.setBackground(new java.awt.Color(128, 0, 0));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("+THÊM SẢN PHẨM");
        button6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
        });
        add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, 30));

        jTable1.setBackground(new java.awt.Color(128, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Mã sản phẩm", "Tên sản phẩm", "Số lương", "Đơn giá", "Loại sản phẩm", "Đã bán"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 960, 270));
        add(productDetailPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 950, -1));

        jTextField1.setText("");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 240, 30));

        button2.setBackground(new java.awt.Color(128, 0, 0));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("LOAD TABLE");
        button2.setContentAreaFilled(false);
        button2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 140, 30));

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 200, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sản phẩm", "Tên sản phẩm" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 140, 30));

        jRadioButton1.setText("Hiện các sản phẩm đã ẩn"); // Hiện cả những sản phẩm đã xóa mềm (IS_DELETED = 1)
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Click Table
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked

        tableModel = (DefaultTableModel) jTable1.getModel();
        int maSP = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
        sp = spBUS.get(maSP);
        System.out.println(sp.toString());
        productDetailPanel1.setSanpham(sp); // Sau khi lấy được sp từ db thì set vào panel bên phải

    }// GEN-LAST:event_jTable1MouseClicked
     // Turn on Frame Add

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_button6MouseClicked
        SanPhamAdd spAdd = new SanPhamAdd();
        spAdd.setVisible(true);
        spAdd.setLocationRelativeTo(this);
    }// GEN-LAST:event_button6MouseClicked

    // Load Again Table
    private void button2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_button2MouseClicked

        tableModel.setRowCount(0);
        loadTable();

    }// GEN-LAST:event_button2MouseClicked
     // Search Combobox

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_jComboBox1ItemStateChanged
        String a = jComboBox1.getSelectedItem().toString();
        FilterComboBox(a);

    }// GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyReleased
        String a = jTextField1.getText();
        FilterTF(a);
    }// GEN-LAST:event_jTextField1KeyReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (evt.isPopupTrigger() && jTable1.getSelectedRowCount() != 0) {
                popUp.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }

    }// GEN-LAST:event_jTable1MouseReleased

    private void SửaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SửaActionPerformed
        SanPhamSua spSua = new SanPhamSua();
        int maSP = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
        spSua.setVisible(true);
        spSua.setLocationRelativeTo(this);
        spSua.Sua(spBUS.get(maSP));
    }// GEN-LAST:event_SửaActionPerformed

    private void XóaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_XóaActionPerformed
        int maSP = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
        SanPham spTemp = new SanPham();
        spTemp = spBUS.get(maSP);
        spTemp.setDeleted(true);
        spBUS.edit(maSP, spTemp);
    }// GEN-LAST:event_XóaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Sửa;
    private javax.swing.JMenuItem Xóa;
    private GUI.LoginGUI.Component.Button button2;
    private GUI.LoginGUI.Component.Button button6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPopupMenu popUp;
    private GUI.ManageGroup.ComponentPanel.ProductDetailPanel productDetailPanel1;
    // End of variables declaration//GEN-END:variables
}
