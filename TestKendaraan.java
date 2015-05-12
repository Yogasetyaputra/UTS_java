public class TestKendaraan
{
	public static void main(String[] args)
	{
		Mobil31 porsche = new Mobil31(200, 5000, 2, 4);
		porsche.CetakSpesifikasi();
		porsche.Jalankan(100);
		porsche.Jalankan(180);
	}
}
