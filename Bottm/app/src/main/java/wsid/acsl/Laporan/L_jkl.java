package wsid.acsl.Laporan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wsid.acsl.R;

public class L_jkl extends Fragment {

    public L_jkl() {
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
                        "\n \n LP1 | 3 JKL-A,B,C\n" +
                                "\n 1.\tApa yang anda ketahui tentang DNS server dan Web Server!\n" +
                                "2.\tBagaimanakah cara kerja DNS, Jelaskan!\n" +
                                "3.\tSebutkan dan Jelaskan Tipe DNS!\n"+
                                "\n LA1 | 3 JKL-A,B,C\n" +
                                "\n 1.\tJelaskan cara kerja dari DNS server !\n" +
                                "2.\tSebutkan package yang diperlukan untuk membuat sebuah DNS Server !\n" +
                                "3.\tApa fungsi dari file db.192 dan db.acsl !\n"+
                                "\n \n LP2 | 3 JKL-A,B,C\n" +
                                "\n 1.\tApakah yang anda ketahui tentang mail server !\n" +
                                "2.\tJelaskan cara kerja mail server !\n" +
                                "3.\tSebutkan apa saja aplikasi email !\n" +
                                "4.\tJelaskan tentang SMTP dan POP3 !\n"+
                                "\n LA2 | 3 JKL-A,B,C\n" +
                                "\n 1.\tBerikan kesimpulan dari praktikum yang telah dilakukan !\n" +
                                "2.\tSebutkan package-package yang diperlukan untuk melakukan instalasi Squirrelmail !\n" +
                                "3.\tApa fungsi dari package apache2 !\n" +
                                "4.\tTuliskan perintah command line linux yang berfungsi untuk menginstall semua package yang dibutuh untuk squirrelmail !\n",

                        "\n \n LP1 | 3 JKL-D,E,F\n" +
                                "\n 1.   Sebutkan tahapan konfigurasi DNS Server!\n" +
                                "2.   Tuliskan 10 perintah dasar Linux!\n" +
                                "3.   Apa yang dimaksud dengan DNS Server?\n"+
                                "\n LA1 | 3 JKL-A,B,C\n" +
                                "\n 1.\tJelaskan cara kerja dari DNS server !\n" +
                                "2.\tSebutkan package yang diperlukan untuk membuat sebuah DNS Server !\n" +
                                "3.\tApa fungsi dari file db.192 dan db.acsl !\n"+
                                "\n \n LP2 | 3 JKL-D,E,F\n" +
                                "\n 1.\tJelaskan singkat tentang sejarah mail server!\n" +
                                "2.\tJelaskan tentang IMAP!\n" +
                                "3.\tSebutkan dan jelaskan 3 klasifikasi email!\n" +
                                "4.\tSebutkan dan jelaskan 3 protokol utama pada layanan E-mail!\n"+
                                "\n LA2 | 3 JKL-D,E,F\n" +
                                "\n 1.\tJelaskan kesimpulan percobaan Mail Server (masing - masing tidak boleh sama!)!\n" +
                                "2.\tJelaskan perbedaan beberapa aplikasi web pengakses email!\n" +
                                "3.\tJelaskan kelebihan dan kekurangan Mail Server!\n",

                        "\n \n LP1 | 3 JKL-G,H,I\n" +
                                "\n 1.\tSebutkan dan jelaskan beberapa perintah dasar linux yang wajib untuk dipahami dan dipraktekkan dalam tahap awal pengenalan linux!\n" +
                                "2.\tGambarkan contoh rancangan dari topologi DNS Server!\n" +
                                "3.\tApa perbedaan antara domain dan sub domain? Berikan contohnya masing-masing minimal 2.\n"+
                                "\n LA1 | 3 JKL-G,H,I\n" +
                                "\n 1.\tBagaimana cara kerja dari DNS Server? Jelaskan. \n" +
                                "2.\tGambarkan dan jelaskan struktur database dari DNS!\n" +
                                "3.\tSebutkan beberapa peran DNS Server!\n"+
                                "\n \n LP2 | 3 JKL-G,H,I\n" +
                                "\n 1.\tApa yang kalian ketahui tentang Mail Server? Jelaskan!\n" +
                                "2.\tSebutkan dan jelaskan 3 protokol utama yang digunakan dalam pelayanan E-Mail!\n" +
                                "3.\tSebutkan dan jelaskan program atau aplikasi pada E-Mail!\n"+
                                "\n LA2 | 3 JKL-G,H,I\n" +
                                "\n 1.\tJelaskan cara kerja dari Mail Server!\n" +
                                "2.\tSebutkan dan jelaskan aplikasi web pengakses email pada linux yang kalian ketahui!\n" +
                                "3.\tApa saja kelebihan dan kekurangan Mail Server?\n",

                        "\n \n LP1 | 3 JKL-J,K,L\n" +
                                "\n 1.\tInstall ubuntu 14.04 di masing-masing komputer rumah atau melalui virtual box?*\n" +
                                "2.\tPrint Screen hostname atau nama computer dengan nama masing-masing praktikan?*\n" +
                                "3.\tJelaskan mengenai DNS , Apache2 dan phpmyadmin?\n" +
                                "* no 1 dan 2 di kumpul menggunakan format electronic .doc atau .odt\n"+
                                "\n LA1 | 3 JKL-J,K,L\n" +
                                "\n 1.\tPraktikkan membuat domain & webserver menggunakan DNS & apache2 gunakan printscreen dan kumpulkan dengan format .odt atau .doc?\n" +
                                "2.\tSebutkan kesimpulan dari praktikum Bab 1?\n" +
                                "3.\tJangan mencoba mengkopi punya teman dan printscreen dengan hostname nama masing-masing praktikan?\n"+
                                "\n \n LP2 | 3 JKL-J,K,L\n" +
                                "\n 1.\tApa yang di maksud dengan Mailserver?\n" +
                                "2.\tBuat Perkiraan topologi untuk Mailserver?\n" +
                                "3.\tApa yang dimaksud pop3 dan imap ?\n" +
                                "*kerjakan dengan jelas dan dapat dipahami\n"+
                                "",

                        "\n \n LP1 | 3 JKL-M,N,O\n" +
                                "\n 1.\tApa yang anda ketahui tentang DNS server dan Web Server!\n" +
                                "2.\tBagaimanakah cara kerja DNS, Jelaskan!\n" +
                                "3.\tSebutkan dan Jelaskan Tipe DNS!\n"+
                                "\n LA1 | 3 JKL-M,N,O\n" +
                                "\n 1.\tJelaskan cara kerja dari DNS server !\n" +
                                "2.\tSebutkan package yang diperlukan untuk membuat sebuah DNS Server !\n" +
                                "3.\tApa fungsi dari file db.192 dan db.acsl !\n"+
                                "\n \n LP2 | 3 JKL-M,N,O\n" +
                                "\n 1.\tApakah yang anda ketahui tentang mail server !\n" +
                                "2.\tJelaskan cara kerja mail server !\n" +
                                "3.\tSebutkan apa saja aplikasi email !\n" +
                                "4.\tJelaskan tentang SMTP dan POP3 !\n"+
                                "\n LA2 | 3 JKL-M,N,O\n" +
                                "\n 1.\tBerikan kesimpulan dari praktikum yang telah dilakukan !\n" +
                                "2.\tSebutkan package-package yang diperlukan untuk melakukan instalasi Squirrelmail !\n" +
                                "3.\tApa fungsi dari package apache2 !\n" +
                                "4.\tTuliskan perintah command line linux yang berfungsi untuk menginstall semua package yang dibutuh untuk squirrelmail !\n",

                        "\n \n LP1 | 3 JKL-P,Q,R\n" +
                                "\n 1.\tJika sebuah file memiliki nilai hak akses 724, apa yang bisa dilakukan oleh:\n" +
                                "a. Owner/user\n" +
                                "b. group\n" +
                                "c. other\n" +
                                "2.\tJika sebuah direktori ACSL terletak didalam direktori /etc, dan sebuah file bernama rampage.txt terletak dalam direktrori /home/lanjut. Tuliskan konfigurasi untuk menyalin file rampage.txt kedalam direktori ACSL!\n" +
                                "3.\tApa yang dimaksud dengan DNS? Jelaskan sedetail mungkiin!\n" +
                                "4.\tsebutkan package yang digunakan untuk praktikum bab 1! \n"+
                                "\n LA1 | 3 JKL-P,Q,R\n" +
                                "\n 1.\tJelaskan secara singkat cara mengubah IP address pada Ubuntu!\n" +
                                "2.\tJelaskan penggunaan DNS pada suatu website!\n" +
                                "3.\tSimpulkan percobaan bab 1 ini ?\n"+
                                "\n \n LP2 | 3 JKL-P,Q,R\n" +
                                "\n 1.\tJelaskan mail client dan mail server!\n" +
                                "2.\tJelaskan mengenai protokol email!\n" +
                                "3.\tSebutkan aplikasi yang kita pakai pada bab ini!\n"+
                                "\n LA2 | 3 JKL-P,Q,R\n" +
                                "\n 1.\tSebutkan kelebihan dan kekurangan mail server!\n" +
                                "2.\tProtokol apa yang kita gunakan pada bab ini ? Berikan penjelasannya!\n" +
                                "3.\tBerikan kesimpulan bab 2 ini!\n",

                        "\n \n LP1 | 3 JKL-S,T,U\n" +
                                "\n 1.\tJelaskan yang dimaksud dengan dns server & web server ?\n" +
                                "2.\tPackage apa saja yang dibutuhkan untuk membuat web server?\n" +
                                "3.\tTuliskan tahap-tahap konfigurasi dns server ?\n"+
                                "\n LA1 | 3 JKL-S,T,U\n" +
                                "\n 1.\tBuatlah kesimpulan beserta contoh kegunaan sehari-hari/pengaplikasian web server!\n" +
                                "2.\tJelaskan hal yang harus diperhatikan dalam pembuatan DNS server!\n" +
                                "3.\tJelaskan fungsi package apache2 dan php5 pada praktikum bab1!\n"+
                                "\n \n LP2 | 3 JKL-S,T,U\n" +
                                "\n 1.\tJelaskan pengertian dari POP3, IMAP, SMTP!\n" +
                                "2.\tSebutkan package yang digunakan pada percobaan bab 2!\n" +
                                "3.\tJelaskan pengertian dari mail server dan berikan contohnya!\n"+
                                "\n LA2 | 3 JKL-S,T,U\n" +
                                "\n 1.\tBerikan kesimpulan dari percobaan Mail Server!\n" +
                                "2.\tSebutkan contoh dari mail server minimal 5!\n" +
                                "3.\tSebutkan dan jelaskan protocol pada mail server ! (beserta gambarnya)\n",

                        "\n \n LP1 | 3 JKL-V,W,X\n" +
                                "\n 1.\tApa yang dimaksud dengan DNS\n" +
                                "2.\tMenggunakan config atau sintax apa agar bisa memasukkan DNS server\n" +
                                "3.\tApa yang dimaksud Zona data\n"+
                                "\n LA1 | 3 JKL-V,W,X\n" +
                                "\n 1.\tBuatlah Tahapan-Tahapan Instalasi Dan Konfigurasi Web Server Menggunakan Wordppress ?\n" +
                                "2.\tJelaskan Yang Dimaksud Dengan Repository ?\n" +
                                "3.\tPackage Apa Saja Yang Dibutuhkan Untuk Membuat Web Server ?\n"+
                                "\n \n LP2 | 3 JKL-V,W,X\n" +
                                "\n 1.\tJelaskan Yang Dimaksud Dengan Mail Server ?\n" +
                                "2.\tPackage Apa Saja Yang Dibutuhkan Untuk Membuat Mail Server?\n" +
                                "3.\tTuliskan Tahap-Tahap Konfigurasi Mail Server ?\n"+
                                "\n LA2 | 3 JKL-V,W,X\n" +
                                "\n 1.\tJelaskan fungsi package yang ada pada mail server ?\n" +
                                "2.\tJelaskan fungsi penggunaan domain, address, broadcast, dan network pada mail server ?\n" +
                                "3.\tBuatlah kesimpulan ?\n",
                });
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

}