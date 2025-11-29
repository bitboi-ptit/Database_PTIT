package DataTransfer;

import java.sql.Timestamp;

public class NhaCungCap {
    private int maNCC;
    private String tenNCC;
    private String diaChi;
    private String sdt;
    private String email;
    private boolean isDeleted;

    public NhaCungCap() {
    }

    public NhaCungCap(int maNCC, String tenNCC, String diaChi, String sdt, String email, boolean isDeleted) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.isDeleted = isDeleted;
    }

    public int getMaNCC() {
        return this.maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return this.tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsDeleted() {
        return this.isDeleted;
    }

    public boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "NhaCungCap{" +
                "maNCC=" + maNCC +
                ", tenNCC='" + tenNCC + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public static class TaiKhoan {
        private int soTK;
        private String tenTK;
        private String matKhau;
        private int maNV;
        private int soLanSai;
        private Timestamp ngayTao;
        private boolean isDeleted;
        public TaiKhoan() {
        }

        public TaiKhoan(int soTK, String tenTK, String matKhau, int maNV, int soLanSai, Timestamp ngayTao, boolean isDeleted) {
            this.soTK = soTK;
            this.tenTK = tenTK;
            this.matKhau = matKhau;
            this.maNV = maNV;
            this.soLanSai = soLanSai;
            this.ngayTao = ngayTao;
            this.isDeleted = isDeleted;
        }

        public int getSoTK() {
            return soTK;
        }

        public String getTenTK() {
            return tenTK;
        }

        public String getMatKhau() {
            return matKhau;
        }

        public int getMaNV() {
            return maNV;
        }

        public int getSoLanSai() {
            return soLanSai;
        }

        public Timestamp getNgayTao() {
            return ngayTao;
        }

        public boolean isDeleted() {
            return isDeleted;
        }

        public void setSoTK(int soTK) {
            this.soTK = soTK;
        }

        public void setTenTK(String tenTK) {
            this.tenTK = tenTK;
        }

        public void setMatKhau(String matKhau) {
            this.matKhau = matKhau;
        }

        public void setMaNV(int maNV) {
            this.maNV = maNV;
        }

        public void setSoLanSai(int soLanSai) {
            this.soLanSai = soLanSai;
        }

        public void setNgayTao(Timestamp ngayTao) {
            this.ngayTao = ngayTao;
        }

        public void setDeleted(boolean deleted) {
            isDeleted = deleted;
        }

        @Override
        public String toString() {
            return "TaiKhoan{" +
                    "soTK=" + soTK +
                    ", tenTK='" + tenTK + '\'' +
                    ", matKhau='" + matKhau + '\'' +
                    ", maNV=" + maNV +
                    ", soLanSai=" + soLanSai +
                    ", ngayTao=" + ngayTao +
                    ", isDeleted=" + isDeleted +
                    '}';
        }
    }
}
