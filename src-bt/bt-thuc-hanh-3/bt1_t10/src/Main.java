public class Main {
    public static void main(String[] args) {
        //Viết chƣơng trình xây dựng lớp KhachHang với các thuộc tính: Họ tên, địa chỉ, số
        //điện thoại, email và các phƣơng thức gồm:
        //- Các toán tử tạo lập
        //- Nhập thông tin khách hàng
        //- Hiển thị thông tin khách hàng
        //- Phƣơng thức main, nhập vào thông tin của một khách hàng và hiển thị lên màn
        //hình thông tin vừa nhập


        //khoi tao doi tuong KhachHang
        KhachHang kh = new KhachHang();

        kh.InputKhachHang();
        kh.OutputKhachHang();
    }
}