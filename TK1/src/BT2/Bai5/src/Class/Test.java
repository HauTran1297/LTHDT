package BT2.Bai5.src.Class;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhuPho qlkp = new KhuPho();

		qlkp.nhapDanhSach(sc);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp.timKiemThongTin();
	}

}
