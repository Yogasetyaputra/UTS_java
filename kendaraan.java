public class kendaraan {
	public int KecepatanMaks;
	public int Berat;
	public int Kapasitas;
	public int JumlahRoda;

	
	public void kendaraan(){
		KecepatanMaks =20;
		System.out.println("Kecepatan Maks Kendaraan : "+ KecepatanMaks);
	}
	}

	class Mobil31 extends kendaraan{
	public Mobil31(int km, int brt, int kpsts, int jr){
		KecepatanMaks = km;
		Berat = brt;
		Kapasitas = kpsts;
		JumlahRoda = jr;

	}
	public void CetakSpesifikasi() {
		System.out.println("Kecepatan Maks mobil : "+KecepatanMaks);
		System.out.println("Berat Mobil : "+Berat);
        System.out.println("Kapasitas Mobil : "+Kapasitas);
        System.out.println("Jumlah Mobil : "+ JumlahRoda+"\n");
	}
	 public void Upgrade(int km){
    KecepatanMaks = km;
    System.out.println("Mobil dijalankan dengan kecepatan : "+KecepatanMaks);
}
	}
