package BT2.Bai3.src.Class;

import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLySach qls = new QuanLySach();

		qls.nhapDanhSachTL(sc);

		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai = sc.nextLine();
		qls.timLoaiTL(loai);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL = sc.nextLine();
		qls.timMaTL(maTL);

		sc.close();
	}

}
