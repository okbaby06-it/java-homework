public class ToanHoc {
    public static double TinhTong(int n){
        double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += (double) i / (i + 1);
        }
        return sum;
    }
}
