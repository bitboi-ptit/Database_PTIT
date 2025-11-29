
package GUI.ManageGroup.ManageItem.ManagerPanel;
import com.raven.datechooser.DateChooser;
import BUS.BusAccessor.HoaDonBUS;
import BUS.BusAccessor.KhachHangBUS;
import BUS.BusAccessor.NhanVienBUS;
import BUS.BusAccessor.SanPhamBUS;
import BUS.SaleServices.Money;
import DataAccess.DataAccessObject.ChiTietHoaDonDAO;
import DataTransfer.ChiTietHoaDon;
import DataTransfer.HoaDon;
import DataTransfer.KhachHang;
import DataTransfer.NhanVien;
import DataTransfer.SanPham;
import GUI.ManageGroup.Theme.NhapXuatTheme;
import com.raven.datechooser.DateChooser;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import javax.swing.JFrame;


public class HoaDonJPanel extends javax.swing.JPanel {
    private final ChiTietHoaDonDAO cthoaDonDAO = new ChiTietHoaDonDAO();
    private final  HoaDonBUS hoaDonBUS =new HoaDonBUS();
    private final  NhanVienBUS nhanVienBUS=new NhanVienBUS();
    private final  KhachHangBUS khachHangBUS=new KhachHangBUS();
    private final  SanPhamBUS sanPhamBUS=new SanPhamBUS();
    private List<HoaDon> hdList=hoaDonBUS.getAll();
    
    DefaultTableModel modelJTABLE2;
        DefaultTableModel modelJTABLE1;
    public HoaDonJPanel() {
        NhapXuatTheme.setup();
        initComponents();
        CustomHeader(jTable1);
        CustomHeader(jTable2);
        modelJTABLE2 = (DefaultTableModel) jTable2.getModel();
        DatatoTable();
        setUpPanel();
    }
    private void setUpPanel() {
        JMenuItem itemNhap1 = new JMenuItem("Xem/Sửa thông tin");
        JMenuItem itemNhap2 = new JMenuItem("Xóa phiếu nhập");
//        JPopupMenu
       dateChooserNhapBd = new DateChooser();
        dateChooserNhapBd.setForeground(Color.decode("#800000"));
         dateChooserNhapKt = new DateChooser();
         dateChooserNhapKt.setForeground(Color.decode("#800000"));
         dateChooserHuyBd = new DateChooser();
         dateChooserHuyBd.setForeground(Color.decode("#800000"));
         dateChooserHuyKt = new DateChooser();
         dateChooserHuyKt.setForeground(Color.decode("#800000"));
        dateChooserNhapBd.setTextRefernce(jTextField5);
        dateChooserNhapKt.setTextRefernce(jTextField17);
        

    }

    public void CustomHeader(JTable jt){
        jt.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,15));
        jt.getTableHeader().setOpaque(false);
        jt.getTableHeader().setBackground(new Color(128,0,0));
        jt.getTableHeader().setForeground(new Color(255,255,255));
    }
    public void DatatoTable(){
        int i=0;
        if (hdList == null)
            return;
        for(HoaDon hd:hdList){
            hd=hdList.get(i);
            NhanVien nv= nhanVienBUS.get(hd.getMaNV());
            KhachHang kh= khachHangBUS.get(hd.getMaKH());
            modelJTABLE2.addRow(new Object[]{hd.getMaHD(),hd.getMaKH(),kh.getTenKH(),hd.getMaNV(),nv.getTenNV(),hd.getNgayHD()});
            i++;
        }
        jTable2.setModel(modelJTABLE2);
    }
    
    public void reFreshTable(){
        hdList = hoaDonBUS.getAll();
        modelJTABLE2.setRowCount(0);
        DatatoTable();
    }

  
    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        jLabel104 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        button18 = new GUI.LoginGUI.Component.Button();
        shape40 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel3 = new javax.swing.JLabel();
        shape42 = new GUI.ManageGroup.BackgroundShape.Shape();
        jLabel90 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        button19 = new GUI.LoginGUI.Component.Button();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabel104.setForeground(new java.awt.Color(128, 0, 0));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ManageGroup/ManagerIcon/info.png")));
        jLabel104.setText("Thông tin chi tiết");
        add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 940, 30));

        jLabel108.setFont(new java.awt.Font("Segoe UI", 3, 18));
        jLabel108.setForeground(new java.awt.Color(128, 0, 0));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Danh sách hóa đơn");
        add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 180, 30));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 190, 30));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel109.setForeground(new java.awt.Color(128, 0, 0));
        jLabel109.setText("QUẢN LÝ HÓA ĐƠN");
        add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 50));

        jPanel21.setBackground(new java.awt.Color(128, 0, 0));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 10, 30));

        button18.setBackground(new java.awt.Color(128, 0, 0));
        button18.setForeground(new java.awt.Color(255, 255, 255));
        button18.setText("TÌM KIẾM");
        button18.setFont(new java.awt.Font("Segoe UI", 1, 12));
        button18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18ActionPerformed(evt);
            }
        });
        add(button18, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 90, 30));

        shape40.setBackground(new java.awt.Color(128, 0, 0));
        shape40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHI TIẾT HÓA ĐƠN");
        shape40.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        shape42.setBackground(new java.awt.Color(255, 255, 255));
        shape42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setBackground(new java.awt.Color(0, 0, 0));
        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel90.setText("GIÁ TRỊ HÓA ĐƠN");
        shape42.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 6, -1, 27));

        jLabel117.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel117.setText("Giá trị đơn hàng :");
        shape42.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 45, -1, -1));

        jLabel118.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel118.setText("Số tiền giảm :");
        shape42.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel119.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel119.setText("TỔNG :");
        shape42.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel121.setText("Tổng số lượng :");
        shape42.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("jLabel4");
        shape42.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel1.setText("jLabel1");
        shape42.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 46, 140, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel2.setText("jLabel2");
        shape42.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 120, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel5.setText("jLabel5");
        shape42.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 160, 20));

        shape40.add(shape42, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 290, 220));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(128, 0, 0));//test mau
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable1);

        shape40.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 560, 200));

        add(shape40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 950, 240));
//cho can them 
        jTable2.setBackground(new java.awt.Color(128, 0, 0));
        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTable2.setForeground(Color.WHITE);//set mau trang cho chu trong bang 2

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã khách hàng", "Tên khách hàng", "Mã nhân viên", "Tên nhân viên", "Ngày hóa đơn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        jTable2.setSelectionBackground(new java.awt.Color(232, 57, 95));//set mau cho vùng chon
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable2mouseclick(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 960, 270));

        jLabel8.setBackground(new java.awt.Color(0, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel8.setForeground(new java.awt.Color(128, 0, 0));
        jLabel8.setText("Từ ngày:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 80, 30));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 160, 30));
        add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 160, 30));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel7.setForeground(new java.awt.Color(128, 0, 0));
        jLabel7.setText("Đến ngày:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 70, 30));

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel6.setForeground(new java.awt.Color(128, 0, 0));
        jLabel6.setText("Mã NV:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 120, 30));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 140, 30));
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 140, 30));

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel9.setForeground(new java.awt.Color(128, 0, 0));
        jLabel9.setText("Mã KH:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 120, 30));

        button19.setBackground(new java.awt.Color(128, 0, 0));
        button19.setForeground(new java.awt.Color(255, 255, 255));
        button19.setText("LỌC");
        button19.setFont(new java.awt.Font("Segoe UI", 1, 12));
        button19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button19ActionPerformed(evt);
            }
        });
        add(button19, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 100, 30));

        jButton1.setBackground(new java.awt.Color(128, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void JTable2mouseclick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable2mouseclick
        // TODO add your handling code here:
        int soluong=0;
        String i=String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),0));
        jLabel1.setText("");
        jLabel2.setText("");
        jLabel5.setText("");
        jLabel4.setText("");
        jTable1.setModel(new DefaultTableModel(null,new String[]{"Mã sản phẩm","Tên sản phẩm","Số lượng","Giá"}));
        modelJTABLE1= (DefaultTableModel) jTable1.getModel();
        HoaDon hd= hoaDonBUS.get(Integer.parseInt(i));
        List<ChiTietHoaDon> listChiTiet = cthoaDonDAO.selectAllById1(hd.getMaHD());
        for (ChiTietHoaDon cthd : listChiTiet) {
            SanPham sp = sanPhamBUS.get(cthd.getMaSP());
            soluong+=cthd.getSoLuong();
            modelJTABLE1.addRow(new Object[]{cthd.getMaSP(),sp.getTenSP(),cthd.getSoLuong(),cthd.getGiaTien()});
            jLabel1.setText(Money.format(hd.getTongTien()));
            jLabel5.setText(Money.format(hd.getTienGiam()));
            jLabel2.setText(String.valueOf(soluong));
            jLabel4.setText(Money.format(hd.getTongTien()-hd.getTienGiam()));
            
         }
        jTable1.setModel(modelJTABLE1);
        
        
    }

    private void button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button18ActionPerformed
        // Tìm kiếm theo mã hóa đơn
        boolean test = false;
        
        if(jTextField9.getText().equals("")){
            JOptionPane.showMessageDialog(null, "NHẬP MÃ HÓA ĐƠN VÀO MỤC TÌM KIẾM");
        }
        else{
            for(HoaDon hd:hdList){
                if(jTextField9.getText().equals(String.valueOf(hd.getMaHD())) ){
                    jTable2.setModel(new DefaultTableModel(null,new String[]{"Mã hóa đơn","Mã khách hàng","Tên khách hàng","Mã nhân viên","Tên nhân viên","Ngày hóa đơn"}));
                    modelJTABLE2= (DefaultTableModel) jTable2.getModel();
                    NhanVien nv= nhanVienBUS.get(hd.getMaNV());
                    KhachHang kh= khachHangBUS.get(hd.getMaKH());
                    modelJTABLE2.addRow(new Object[]{hd.getMaHD(),hd.getMaKH(),kh.getTenKH(),hd.getMaNV(),nv.getTenNV(),hd.getNgayHD()});
                    test=true;
                }
            }
            if(!test) JOptionPane.showMessageDialog(null, "KOTIMTHAY");
            jTable2.setModel(modelJTABLE2);
        }
        
    }
    
    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {
        // reset table:
        if(jTextField9.getText().equals("")){
            jTable2.setModel(new DefaultTableModel(null,new String[]{"Mã hóa đơn","Mã khách hàng","Tên khách hàng","Mã nhân viên","Tên nhân viên","Ngày hóa đơn"}));
             modelJTABLE2= (DefaultTableModel) jTable2.getModel();
             DatatoTable();
        }
    }

    private void button19ActionPerformed(java.awt.event.ActionEvent evt) {
        // so sánh ngày
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

        jTable2.setModel(new DefaultTableModel(null,new String[]{"Mã hóa đơn","Mã khách hàng","Tên khách hàng","Mã nhân viên","Tên nhân viên","Ngày hóa đơn"}));
        modelJTABLE2= (DefaultTableModel) jTable2.getModel();
        try {
            Date sDate=sdf.parse(jTextField5.getText());
            Date eDate=sdf.parse(jTextField17.getText());
            if (sDate.compareTo(eDate)>0) JOptionPane.showMessageDialog(this, "Ngày kết thúc phải lớn hơn ngày bắt đầu","Thời gian lọc sai",JOptionPane.OK_OPTION);
            if (jTextField6.getText().isEmpty() && jTextField8.getText().isEmpty()){
                for (HoaDon hd : hdList) {
                    String reDate = sdf.format(hd.getNgayHD());
                    Date requiredDate = sdf.parse(reDate);
                    if (requiredDate.compareTo(sDate) >= 0 && requiredDate.compareTo(eDate) <= 0) {

                        NhanVien nv = nhanVienBUS.get(hd.getMaNV());
                        KhachHang kh = khachHangBUS.get(hd.getMaKH());
                        modelJTABLE2.addRow(new Object[]{hd.getMaHD(), hd.getMaKH(), kh.getTenKH(), hd.getMaNV(), nv.getTenNV(), hd.getNgayHD()});

                    }
                }
            }
            else if (jTextField6.getText().isEmpty()){// loc theo ma khach hang
                KhachHang kh = khachHangBUS.get(Integer.parseInt(jTextField8.getText()));
                for (HoaDon hd : hdList) {
                    String reDate = sdf.format(hd.getNgayHD());
                    Date requiredDate = sdf.parse(reDate);
                    if (hd.getMaKH() == kh.getMaKH() && requiredDate.compareTo(sDate) >= 0 && requiredDate.compareTo(eDate) <= 0) {
                        NhanVien nv = nhanVienBUS.get(hd.getMaNV());
                        modelJTABLE2.addRow(new Object[]{hd.getMaHD(), hd.getMaKH(), kh.getTenKH(), hd.getMaNV(), nv.getTenNV(), hd.getNgayHD()});

                    }
                }
            }
            else if (jTextField8.getText().isEmpty()){
                NhanVien nv= nhanVienBUS.get(Integer.parseInt(jTextField6.getText()));
                for (HoaDon hd : hdList) {
                    String reDate = sdf.format(hd.getNgayHD());
                    Date requiredDate = sdf.parse(reDate);
                    if (hd.getMaNV()== nv.getMaNV()&& requiredDate.compareTo(sDate) >= 0 && requiredDate.compareTo(eDate) <= 0) {
                        KhachHang kh= khachHangBUS.get(hd.getMaKH());
                        modelJTABLE2.addRow(new Object[]{hd.getMaHD(), hd.getMaKH(), kh.getTenKH(), hd.getMaNV(), nv.getTenNV(), hd.getNgayHD()});
                    }
                }
            }//loc theo ma nv
            else {
                NhanVien nv= nhanVienBUS.get(Integer.parseInt(jTextField6.getText()));
                KhachHang kh = khachHangBUS.get(Integer.parseInt(jTextField8.getText()));
                for (HoaDon hd : hdList) {
                    String reDate = sdf.format(hd.getNgayHD());
                    Date requiredDate = sdf.parse(reDate);
                    if (hd.getMaKH() == kh.getMaKH() && hd.getMaNV()== nv.getMaNV() &&requiredDate.compareTo(sDate) >= 0 && requiredDate.compareTo(eDate) <= 0) {
                        modelJTABLE2.addRow(new Object[]{hd.getMaHD(), hd.getMaKH(), kh.getTenKH(), hd.getMaNV(), nv.getTenNV(), hd.getNgayHD()});

                    }
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(HoaDonJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        reFreshTable();
    }

    public static void main(String[] argv){
        JFrame f = new JFrame();
        HoaDonJPanel km = new HoaDonJPanel();
        f.add(km);
        f.setLayout(new FlowLayout());
        f.setSize(1100,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
    }
   
    private GUI.LoginGUI.Component.Button button18;
    private GUI.LoginGUI.Component.Button button19;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private GUI.ManageGroup.BackgroundShape.Shape shape40;
    private GUI.ManageGroup.BackgroundShape.Shape shape42;

     private DateChooser dateChooserNhapBd;
    private DateChooser dateChooserNhapKt;
    private DateChooser dateChooserHuyBd;
    private DateChooser dateChooserHuyKt;
}
