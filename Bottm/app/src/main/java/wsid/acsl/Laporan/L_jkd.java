package wsid.acsl.Laporan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wsid.acsl.R;

public class L_jkd extends Fragment {

    public L_jkd() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.l_fpga, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]
                {
                        "\n \n LP1 | 3 JKD-A,B,C\n" +
                                "1.\tApa itu Subnetting ? \n" +
                                "2.\tApa itu CIDR ? \n" +
                                "3.\tApa itu VLSM ? \n" +
                                "4.\tSebutkan aturan dalam membuat subnet mask ? \n"+
                        "1.\t Jika diketahui network 192.168.1.0 /25. Berapa : \n" +
                                "a.\tJumlah Subnet \n" +
                                "b.\tJumlah Host Per Subnet \n" +
                                "c.\tNilai Blok Subnet \n" +
                                "d.\tBuatlah tablenya \n" +
                                "2.\tKerjakan latihan halaman 31 !\n"+
                        "\n \n LP2 | 3 JKD-A,B,C\n" +
                                "\n" +
                                " \n 1.Apa itu Crimping ? \n" +
                                "2. Ada berapa jenis kabel yang digunakan pada jaringan ? sebutkan ! \n" +
                                "3. Apa konfigurasi warna kabel Straight dan Cross Over ?\n"+
                        "\n LA2 | 3 JKD-A,B,C\n" +
                                "\n 1.Berikan kesimpulan pada praktikum bab Crimping ! \n" +
                                "2. Menurut kalian pentingkah penentuan warna dalam crimping cable ? \n" +
                                "3. Pada percobaan file sharing di dalam widows XP, apa saja yang perlu diperhatikan ? \n" +
                                "4. Kerjakan latihan soal pada modul praktikum halaman 44 ! \n",

                        "\n \n LP1 | 3 JKD-D,E,F\n" +
                                "\n 1.Apa itu Subnetting ? \n" +
                                "2. Apa itu CIDR dan VLSM ? \n" +
                                "3. Apa manfaat VLSM ? \n" +
                                "4. Sebutkan dan jelaskan aturan dalam membuat subnet mask ! \n"+
                                "\n LA1 | 3 JKD-D,E,F\n" +
                                "\n" +
                                " \n 1.Apa kesimpulan dari bab 1! \n" +
                                "2. Subnetting apa yang terjadi pada IP address kelas C 192.168.1.0/27?Tentukanlah : \n" +
                                "a) jumlah subnet \n" +
                                "b) jumlah host per subnet \n" +
                                "c) nilai blok subnet \n" +
                                "d) subnet map & alamat Broadcast \n" +
                                "3. Sebuah perusahaan memiliki network address 170.202.64.0/22 dan terbagi menjadi 3 buah devisi," +
                                " masing-masing divisi memiliki jumlah host yang berbeda, yaitu sebanyak : " +
                                "- Divisi A = 30 host" +
                                "- Divisi B = 80 host " +
                                "- Divisi C = 50 host " +
                                "tentukan : - buatlah subnet map dan alamat Broadcast!\t\n"+
                                "\n \n LP2 | 3 JKD-D,E,F\n" +
                                "\n" +
                                "\n 1.Apa itu Crimping dan alat yang digunakan untuk crimping apa saja ? \n" +
                                "2. Ada berapa jenis kabel yang digunakan pada jaringan ? sebutkan ! \n" +
                                "3. Apa konfigurasi warna kabel Straight dan Cross Over ?\n"+
                                "\n LA2 | 3 JKD-D,E,F\n" +
                                " \n 1.Buat kesimpulan dari masing masing percobaan? \n" +
                                "2. Lengkapi kotak-kotak pada modul praktikum halaman 44? (wajib digambar)\n",

                        "\n \n LP1 | 3 JKD-G,H,I\n" +
                                "1.\tApa itu subnetting ? \n" +
                                "2.\tApa itu IPv 4 dan IPv 6? \n" +
                                "3.\tApa itu CIDR dan VLSM ? \n" +
                                "4.\tApa yang dimaksud dengan network dan broadcast ! \n"+
                                "\n LA1 | 3 JKD-G,H,I\n" +
                                "\n 1.VLSM kepanjangan dari ? \n" +
                                "2. Apa kepanjangan dari CIDR ? \n" +
                                "3. Tuliskan contoh ip address dari kelas A, B, C masing-masing 2 !\n"+
                                "\n \n LP2 | 3 JKD-G,H,I\n" +
                                "\n" +
                                "\n 1.Jelaskan apa yang dimaksud dengan Straight Trough Cable! dan sebutkan konfigurasi warna dari Straight Trought Cable ! \n" +
                                "2. Jelaskan apa yang dimaksud dengan Cross Over Cabel! dan sebutkan konfigurasi warna dari Cross Over Cable ! \n" +
                                "3. Jelaskan apa yang dimaksud dengan Roll Over Cable! dan sebutkan konfigurasi warna dari Roll Over Cable ! \n"+
                                "\n LA2 | 3 JKD-G,H,I\n" +
                                "\n 1.Berikan kesimpulan pada praktikum bab Crimping ! \n" +
                                "2. Menurut kalian pentingkah penentuan warna dalam crimping cable ? \n" +
                                "3. Pada percobaan file sharing di dalam widows XP, apa saja yang perlu diperhatikan ? \n" +
                                "4. Kerjakan latihan soal pada modul praktikum halaman 44 ! \n",

                        "\n \n LP1 | 3 JKD-J,K,L\n" +
                                "\n 1.Jelaskan pengertian dari subnetting dan subnet mask ! \n" +
                                "2. Jelaskan konsep dari subnetting ! \n" +
                                "3. Sebutkan dan jelaskan aturan dalam membuat subnet mask ! \n"+
                                "\n LA1 | 3 JKD-J,K,L\n" +
                                "\n 1.Kerjakan soal latihan pada CIDR no 1 \n" +
                                "2. Berikan kesimpulan dari praktikum!\n"+
                                "\n \n LP2 | 3 JKD-J,K,L\n" +
                                "\n" +
                                " \n 1.Apa yang dimaksud dengan crimping ? \n" +
                                "2. Sebutkan peralatan dan bahan yang digunakan dalam crimping ? \n" +
                                "3. Sebutkan 3 type kabel yang digunakan untuk \n LAN ? \n" +
                                "4. Buatlah tabel konfigurasi warna kabel straight trought ?\n"+
                                "\n LA2 | 3 JKD-J,K,L\n" +
                                "\n 1.Tuliskan kesimpulan dari masing-masing percobaan ! (Ada 3 percobaan) \n" +
                                "2. Gambarkan tabel warna kabel Straight , CrossOver , dan RollOver !\n",

                        "\n \n LP1 | 3 JKD-M,N,O\n" +
                                "\n 1.Apa yang dimaksud dengan subnetting ? \n" +
                                "2. Apa pengertian subnet mask ? \n" +
                                "3. Sebutkan aturan dalam membuat subnet mask ? \n" +
                                "4. Apa yang dimaksud dengan prefiks ? \n" +
                                "5. Buatlah tabel format pada notasi desimal bertitik ? \n"+
                                "\n LA1 | 3 JKD-M,N,O\n" +
                                "\n 1.Apa kepanjangan dari CIDR ? \n" +
                                "2. Apa kepanjangan dari VLSM ? \n" +
                                "3. Tuliskan contoh ip address dari kelas A, B, C masing-masing 2 !\n"+
                                "\n \n LP2 | 3 JKD-M,N,O \n" +
                                "1.\tJelaskan apa yang dimaksud dengan Straight Trough Cable! dan sebutkan konfigurasi warna dari Straight Trought Cable ! \n" +
                                "2.\tJelaskan apa yang dimaksud dengan Cross Over Cabel! dan sebutkan konfigurasi warna dari Cross Over Cable ! \n" +
                                "3.\tJelaskan apa yang dimaksud dengan Roll Over Cable! dan sebutkan konfigurasi warna dari Roll Over Cable !\n"+
                                "\n LA2 | 3 JKD-M,N,O\n" +
                                " \n 1.Berikan kesimpulan dari percobaan crimping dan peer to peer! \n" +
                                "2. Jelaskan langkah untuk membuat Shared Folder! \n" +
                                "3. Gambarkan sebuah topologi dan tuliskan keterangan kabel yang digunakan!(seperti latihan soal pada buku praktikum)\n",

                        "\n \n LP1 | 3 JKD-P,Q,R\n" +
                                "\n 1.Jelaskan pengertian dari subnetting dan subnet mask ! \n" +
                                "2. Jelaskan konsep dari subnetting ! \n" +
                                "3. Apa yang dimaksud dengan prefiks ? \n" +
                                "4. Sebutkan dan jelaskan aturan dalam membuat subnet mask ! \n"+
                                "\n LA1 | 3 JKD-P,Q,R\n" +
                                "\n 1.Tentukan subnet mask dari 11111111.11111111.11111111.11100000 ? \n" +
                                "2. Tentukan subnet prefix lenght dari 255.255.255.252 ? \n" +
                                "3. Buatlah kesimpulan dari bab 1 ?\n"+
                                "\n \n LP2 | 3 JKD-P,Q,R\n" +
                                "\n 1.Jelaskan pengertian dari Crimping ! \n" +
                                "2. Sebutkan 3 jenis kabel yang biasa dibuat menggunakan teknik Crimping ! \n" +
                                "3. Sebutkan 3 peralatan Crimping !\n"+
                                "\n LA2 | 3 JKD-P,Q,R\n" +
                                "\n 1.Berikan kesimpulan pada praktikum bab Crimping ! \n" +
                                "2. Menurut kalian pentingkah penentuan warna dalam crimping cable ? \n" +
                                "3. Pada percobaan file sharing di dalam widows XP, apa saja yang perlu diperhatikan ? \n" +
                                "4. Kerjakan latihan soal pada modul praktikum halaman 44 ! \n",

                        "\n \n LP1 | 3 JKD-S,T,U\n" +
                                "\n 1.Jelaskan apa yang dimaksud dengan subnetting ! \n" +
                                "2. Apa itu VLSM ? \n" +
                                "3. Jelaskan tentang CIDR ! \n" +
                                "4. Buatlah tabel format pada notasi desimal bertitik ? \n"+
                                "\n LA1 | 3 JKD-S,T,U\n" +
                                "\n 1.Tentukan subnet mask dari 11111111.11111111.11111111.11100000 ? \n" +
                                "2. Tentukan prefix length dari 255.255.255.128 ? \n" +
                                "3. Buatlah kesimpulan dari bab 1 ?\n"+
                                "\n \n LP2 | 3 JKD-S,T,U\n" +
                                "\n 1.Jelaskan apa itu pengertian creamping ! \n" +
                                "2. Apakah perbedaan dari kabel straght dan cross ! \n" +
                                "3. Sebutkan 3 tipe kabel yang digunakan untuk \n LAN ! \n" +
                                "4. Gambarkan tabel warna Roll Over !\n"+
                                "\n LA2 | 3 JKD-S,T,U\n" +
                                "\n 1.Tuliskan kesimpulan dari masing-masing percobaan ! (Ada 3 percobaan) \n" +
                                "2. Gambarkan tabel warna kabel Straight , CrossOver , dan RollOver !\n",

                        "\n \n LP1 | 3 JKD-V,W,X\n" +
                                "\n 1.Apa yang dimaksud dengan VLSM dan CIDR, jelaskan ! \n" +
                                "2. Sebutkan kegunaan IPv4 di masing-masing class ! \n" +
                                "3. Jelaskan perbedaan dari IPv4 dan IPv6 ! \n" +
                                "4. Apa yang dimaksud dengan network dan broadcast ! \n"+
                                "\n LA1 | 3 JKD-V,W,X\n" +
                                "1.\tKerjakan Soal No \n" +
                                "2.\t2 hal.25 pada buku praktikum! 2. Kerjakan Soal Latihan No \n" +
                                "3.\t1 hal.31 pada buku praktikum! 3. Berikan kesimpulan dari praktikum bab 1!\n" +
                                "\n \n LP2 | 3 JKD-V,W,X\n" +
                                "\n 1.Jelaskan mengenai kabel lan, coaxial, fiber optik ? \n" +
                                "2. Jelaskan tentang : 10basef, 10baset, 10base5, 10base2 ? \n" +
                                "3. Buatlah tabel kategori kabel utp ?\n"+
                                "\n LA2 | 3 JKD-V,W,X\n" +
                                "\n 1.Tuliskan kesimpulan dari masing-masing percobaan ! (Ada 3 percobaan) \n" +
                                "2. Gambarkan tabel warna kabel Straight , CrossOver , dan RollOver !\n",
                });
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

}