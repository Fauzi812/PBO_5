public class mahasiswa {
	private String nama;
	private int umur;

	public mahasiswa(String n, int u){
		nama = n;
		umur = u;
	}

	public void CetakBiodata(){
		System.out.println("=== BIODATA ===");
		System.out.println("Nama Mahasiswa = " +nama);
		System.out.println("Umur Mahasiswa = " +umur);
	}

	public String getNama(){
		return nama;
	}

	public void setNama(String n){
		this.nama = n;
	}

	public int getUmur(){
		return umur;
	}

	public void setUmur(int u){
		this.umur = u;
	}
}