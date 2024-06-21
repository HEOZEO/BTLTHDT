package gamemodel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//
public class Main {
    public static void main(String[] args) {
        // Danh sách các KyBinh
        List<KyBinh> danhSachKyBinh = new ArrayList<>();

        // Thêm các KyBinh vào danh sách
        danhSachKyBinh.add(new KyBinh("Kỵ Binh 1", 100, 50));
        danhSachKyBinh.add(new KyBinh("Kỵ Binh 2", 90, 30));
        danhSachKyBinh.add(new KyBinh("Kỵ Binh 3", 110, 40));

        // In danh sách KyBinh để kiểm tra
        System.out.println("Danh sách KyBinh:");
        for (KyBinh kyBinh : danhSachKyBinh) {
            System.out.println(kyBinh);
        }

        // Tạo nhân vật PhuThuy
        PhuThuy phuThuy1 = new PhuThuy("Phù Thủy 1", 80, 60);
        System.out.println(phuThuy1);
        phuThuy1.suDungPhepThuat();

        // Tìm KyBinh có máu thấp nhất
        KyBinh kb_min = Collections.min(danhSachKyBinh, new Comparator<KyBinh>() {
            @Override
            public int compare(KyBinh o1, KyBinh o2) {
                return Integer.compare(o1.getMau(), o2.getMau());
            }
        });

        System.out.println("KyBinh có máu thấp nhất:");
        System.out.println(kb_min);
        
     // Sắp xếp các KyBinh theo mau từ thấp đến cao
        Collections.sort(danhSachKyBinh, new Comparator<KyBinh>() {
            @Override
            public int compare(KyBinh o1, KyBinh o2) {
                return Integer.compare(o1.getMau(), o2.getMau());
            }
        });

        // In ra danh sách KyBinh sau khi sắp xếp
        System.out.println("Danh sách KyBinh sau khi sắp xếp theo mau:");
        for (KyBinh kyBinh : danhSachKyBinh) {
            System.out.println(kyBinh);
        }

    }
    
    
}
