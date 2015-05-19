public class TestMahasiswa {
	public static void main(String[] args) {
		mahasiswa mhs = new mahasiswa("Ridwan Rismanto", 20);
		mhs.CetakBiodata();

		System.out.println();

		mhs.setUmur(25);
		mhs.CetakBiodata();
	}
}