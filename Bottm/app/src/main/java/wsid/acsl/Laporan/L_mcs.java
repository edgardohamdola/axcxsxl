package wsid.acsl.Laporan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wsid.acsl.R;

public class L_mcs extends Fragment {

    public L_mcs() {
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
                        "\n \n LP1 | 3 MCS-A,B,C\n" +
                                "\n  1. Apa yang kalian ketahui tentang android \n" +
                                "2. Sebutkan versi android hingga saat ini \n" +
                                "3. Sebutkan emulator yg bisa digunakan untuk android \n"+
                                "\n  LA1 | 3 MCS-A,B,C\n" +
                                "\n  1. Tuliskan contoh kode untuk pindah layout menggunakan intent !\n" +
                                "2. Apa kegunaan dari folder drawable ?\n" +
                                "3. Bagaimana cara menambahkan nama classs java yang ada di folder src pada `\n" +
                                "android manifest ?\n"+
                                "\n \n LP2 | 3 MCS-A,B,C\n" +
                                "\n  1. Apa yang kalian ketahui tentang android multimedia?\n" +
                                "2. Tuliskan format audio video dan gambar yang ketahui !\n" +
                                "3. Tuliskan 5 jenis resolusi beserta ukuran dpinya !\n"+
                                "\n  LA2 | 3 MCS-A,B,C\n" +
                                "\n  1. Permission apa yang perlu ditambahkan ketika membuat aplikasi yang akan menulis pada sd card ! \n" +
                                "2. Apa fungsi dari android.media.action.IMAGE_CAPTURE? \n" +
                                "3. Pada aplikasi android multimedia terdapat fungsi ambilfoto() " +
                                "di kelas CameraActivity.java, tulis dan jelaskan fungsi ambilfoto() tersebut ! \n",

                        "\n \n LP1 | 3 MCS-D,E,F \n" +
                                "\n  1. Apa itu class pada java dan buatlah contoh dari class tersebut? \n" +
                                "2. Apa itu object orianted programming? \n" +
                                "3. Berikan contoh layout XML di android? \n"+
                                "\n  LA1 | 3 MCS-D,E,F\n" +
                                "\n  1. Jelaskan bagaimana cara berpindah activity !\n" +
                                "2. Jelaskan mengapa terkadang aplikasi langsung berhenti ketika berpindah layout !\n" +
                                "3. Buatlah sebuah program activity sederhana untuk berpindah ke activity lain !\n"+
                                "\n \n LP2 | 3 MCS-D,E,F\n" +
                                "\n  1. Apa yang dimaksud dengan multimedia ?\n" +
                                "2. Lihat buku praktikum, kira kira apa yang mau kita buat ?\n" +
                                "3. Apa yang di butuhkan di manifest yang akan membantu praktikum minggu ke dua ?\n"+
                                "\n  LA2 | 3 MCS-G,H,I \n" +
                                "\n  1. Jelaskan fungsi file R.java ! \n" +
                                "2. Buatlah sebuah program layout sederhana yang menampilkan sebuah gambar dan video ! \n" +
                                "3. Buatlah kesimpulan dari Bab 2 ! \n",

                        "\n \n LP1 | 3 MCS-G,H,I \n" +
                                "\n  1. Sebutkan komponen-komponen aplikasi pada android? \n" +
                                "2. Sebutkan komponen-komponen pada layout pada android? \n" +
                                "3. Apa fungsi android manifest? \n"+
                                "\n  LA1 | 3 MCS-G,H,I\n" +
                                "\n  1. Jelaskan secara singkat fungsi penggunaan intent !\n" +
                                "2. Jelaskan mengapa terkadang aplikasi langsung berhenti ketika berpindah layout !\n" +
                                "3. Buatlah sebuah program activity sederhana untuk berpindaj ke activity lain !\n"+
                                "\n \n LP2 | 3 MCS-G,H,I\n" +
                                "\n  1. Apa yang kalian ketahui tentang multimedia ?\n" +
                                "2. Contoh penggunaan imageview dalam layout XML ?\n"+
                                "\n  LA2 | 3 MCS-D,E,F \n" +
                                "\n  1. Berikan kesimpulan dari praktikum Bab Android Multimedia pada project yang telah dibuat ! \n" +
                                "2. Apakah fungsi dari kode <uses-permission android:name=”android.permission.WRITE_EXTERNAL_STORAGE”/> pada AndroidManifest.xml ? \n" +
                                "3. Jelaskan menurut bahasa kalian masing-masing listing program dari VideoActivity.java \n",

                        "\n \n LP1 | 3 MCS-J,K,L \n" +
                                "\n  1. Sebutkan dan jelaskan apa saja komponen utama dalam membuat sebuah aplikasi Android! \n" +
                                "2. Sebutkan dan jelaskan widget-widget dasar pada aplikasi Android! \n" +
                                "3. Jelaskan fungsi dari file AndroidManifest.xml pada aplikasi Android! \n"+
                                "\n  LA1 | 3 MCS-J,K,L\n" +
                                "\n  1. Jelaskan kesimpulan dari project yang dibuat pada BAB Android Basic\n" +
                                "Application !\n" +
                                "2. Jelaskan kegunaan dari file program berikut ini :\n" +
                                "a. AndroidManifest.xml\n" +
                                "b. Activity_main.xml\n" +
                                "c. MainActivity.java\n" +
                                "3. Tuliskan dan jelaskan secara detail kode program login.java pada project yang\n" +
                                "dibuat !\n"+
                                "\n \n LP2 | 3 MCS-J,K,L\n" +
                                "\n  1. Apa yang dimaksud dengan multimedia pada android ?\n" +
                                "2. Sebutkan dan jelaskan macam – macam multimedia !\n" +
                                "3. Jelaskan jenis – jenis resolusi gambar pada Aplikasi Developer Android\n" +
                                "(Eclipse/Android Studio)\n"+
                                "\n  LA2 | 3 MCS-J,K,L\n" +
                                "\n  1. Jelaskan fungsi file R.java ! \n" +
                                "2. Buatlah sebuah program layout sederhana yang menampilkan sebuah gambar dan video ! \n" +
                                "3. Buatlah kesimpulan dari Bab 2 \n",

                        "\n \n LP1 | 3 MCS-M,N,O\n" +
                                "\n  1. Apa yang dimaksud activity pada Android ? \n" +
                                "2. Apa yang dimaksud dengan broadcast Reciever dan Service pada Android ? \n" +
                                "3. Sebutkan komponen2 layout pada Android ? Jelaskan singkat! Minimal 3 \n"+
                                "\n  LA1 | 3 MCS-M,N,O\n" +
                                "\n  1. Buatlah aplikasi android pada pertemuan \n  1. Dikumpulkan dalam bentuk word\n" +
                                "ditulis step by step pembuatan aplikasi android ! Screenshot pada textedit nama\n" +
                                "menggunakan nama anda masing – masing pada aplikasi\n"+
                                "\n \n LP2 | 3 MCS-M,N,O\n" +
                                "\n  1. Jelaskan apa yang dimaksud dengan Multimedia Android !\n" +
                                "2. Sebutkan dan jelaskan media yang terdapat pada Android !\n" +
                                "3. Sebutkan nama – nama widget yang dipakai untuk soal No.2 !\n"+
                                "\n  LA2 | 3 MCS-M,N,O\n" +
                                "\n  1. Permission apa yang perlu ditambahkan ketika membuat aplikasi yang akan menulis pada sd card ! \n" +
                                "2. Apa fungsi dari android.media.action.IMAGE_CAPTURE? \n" +
                                "3. Pada aplikasi android multimedia terdapat fungsi ambilfoto() di kelas CameraActivity.java, " +
                                "tulis dan jelaskan fungsi ambilfoto() tersebut ! \n",

                        "\n \n LP1 | 3 MCS-P,Q,R\n" +
                                "\n  1. Sebutkan dan jelaskan macam-macam layout pada aplikasi Android! \n" +
                                "2. Buatlah sebuah program xml yang menampilkan sebuah button dengan tulisan \"Click Me!\" menggunakan relative layout! \n" +
                                "3. Sebutkan dan jelaskan widget-widget dasar pada aplikasi Android! \n"+
                                "\n  LA1 | 3 MCS-P,Q,R\n" +
                                "\n  1. Jelaskan secara singkat fungsi penggunaan intent !\n" +
                                "2. Jelaskan mengapa terkadang aplikasi langsung berhenti ketika berpindah layout !\n" +
                                "3. Buatlah sebuah program activity sederhana untuk berpindaj ke activity lain !\n"+
                                "\n \n LP2 | 3 MCS-P,Q,R\n" +
                                "\n  1. Apa yang dimaksud dengan Android Multimedia ?\n" +
                                "2. Sebutkan media apa saja yang dapat kita gunakan pada android ? Jelaskan secara\n" +
                                "singkat !\n" +
                                "3. Sebutkan bagaimana cara kita dapat menampilkan image pada android? Secara\n" +
                                "singkat!\n"+
                                "\n  LA2 | 3 MCS-P,Q,R\n" +
                                "\n  1. Buatlah aplikasi android pada pertemuan 2, dikumpulkan dalam bentuk word ditulis step by step pembuatan apliakasi android ! \n",

                        "\n \n LP1 | 3 MCS-S,T,U\n" +
                                "\n" +
                                "\n  1. Apa yang dimaksud activity pada Android ? \n" +
                                "2. Apa yang dimaksud dengan broadcast Reciever dan Service pada Android ? \n" +
                                "3. Sebutkan komponen2 layout pada Android ? Jelaskan singkat! Minimal 3 \n"+
                                "\n  LA1 | 3 MCS-S,T,U\n" +
                                "\n  1. Tuliskan contoh kode untuk pindah layout menggunakan intent !\n" +
                                "2. Apa kegunaan dari folder drawable ?\n" +
                                "3. Bagaimana cara menambahkan nama classs java yang ada di folder src pada\n" +
                                "android manifest ?\n"+
                                "\n \n LP2 | 3 MCS-S,T,U\n" +
                                "\n  1. Jelaskan apa yang dimaksud dengan Multimedia Android ?\n" +
                                "2. Sebutkan dan jelaskan media yang terdapat pada Andoid !\n" +
                                "3. Sebutkan nama – nama widget yang dipakai untuk soal No.2 !\n"+
                                "\n  LA2 | 3 MCS-S,T,U\n" +
                                "\n  1. Jelaskan kesimpulan dari project yang dibuat pada praktikum Bab Android Multimedia ! \n" +
                                "2. Apa yang terjadi jika kode program android:layout_below=”@+id/btnVideo” dihilangkan , jelaskan secara detail ! \n" +
                                "3. Jelaskan menurut bahasa kalian masing-masing listing program dari CameraActivity.java ! \n",

                        "\n \n LP1 | 3 MCS-V,W,X\n" +
                                "\n  1. Apa yang kalian ketahui tentang android \n" +
                                "2. Sebutkan versi android hingga saat ini \n" +
                                "3. Sebutkan emulator yg bisa digunakan untuk android\n"+
                                "\n  LA1 | 3 MCS-V,W,X\n" +
                                "\n  1. Buatlah aplikasi android pada pertemuan \n  1. Dikumpulkan dalam bentuk word\n" +
                                "ditulis step by step pembuatan aplikasi android ! Screenshot pada textedit nama\n" +
                                "menggunakan nama anda masing – masing pada aplikasi\n"+
                                "\n \n LP2 | 3 MCS-V,W,X\n" +
                                "\n  1. Apa yang dimaksud dengan Android Multimedia ?\n" +
                                "2. Sebutkan media apa saja yang dapat kita gunakan pada android ? Jelaskan secara\n" +
                                "singkat !\n" +
                                "3. Sebutkan bagaimana cara kita dapat menampilkan image pada android? Secara\n" +
                                "singkat!\n"+
                                "\n  LA2 | 3 MCS-V,W,X\n" +
                                "\n  1. Buatlah aplikasi android pada pertemuan 2, dikumpulkan dalam bentuk word ditulis step by step pembuatan apliakasi android ! \n",
                });
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

}