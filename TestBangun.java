public class TestBangun {
	public static void main(String[] args) {
		segitiga sgt = new segitiga(3, 4, 5);
		sgt.CetakSegitiga();
		System.out.println("");
		sgt.HitungSegitiga();

		System.out.println();
		System.out.println();

		lingkaran lnk = new lingkaran(14);
		lnk.CetakLingkaran();
		System.out.println("");
		lnk.HitungLingkaran();
	}
}