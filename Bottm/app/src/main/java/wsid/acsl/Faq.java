package wsid.acsl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edg on 7/16/2017.
 */

public class Faq extends AppCompatActivity {
    private ListView lv_faq;
    private Adapter_FAQ adapter;
    private List <item_faq> mItemFaq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        lv_faq = (ListView) findViewById(R.id.lv_faq);
        mItemFaq = new ArrayList<>();
        mItemFaq.add(new item_faq(1, "Laboratorium Lanjut Sistem Komputer ","Merupakan Laboratorium yang mengajarkan materi FPGA,JKD,JKL & MCS untuk mahasiswa/i tingkat 3 & 4 jurusan sistem komputer Universitas Gunadarma\n"));
        mItemFaq.add(new item_faq(2, "Cara Mendaftar Sebagai peserta praktikum:",
                                "1.\tPendaftaran dilakukan mulai awal semester ganjil dan genap\n" +
                                "2.\tmahasiswa/i membawa KTM/KRS & foto 3x4\n" +
                                "3.\tpeserta memilih materi praktikum yang ingin diikuti \n" +
                                "4.\tpeserta memilih waktu untuk praktikum yang sudah disesuaikan dengan jadwal peserta   \n" +
                                "5.\tpeserta memberikan tanda tangan sebagai tanda bahwa telah melakukan pendaftaran praktikum.\n"));
        mItemFaq.add(new item_faq(3, "Waktu Operasi Laboratorium :",
                        "Hari senin-sabtu\n" +
                        "pukul : 08.00 - 09.00 WIB"));
        mItemFaq.add(new item_faq(4, "Tempat praktikum :",
                "Ruang D121 & D125 Kampus D Universitas Gunadarma Depok"));
        mItemFaq.add(new item_faq(5, "Kepada siapa jika saya ingin menanyakan lebih lanjut mengenai praktikum :",
                        "PJ Shift yang Standby di laboratorium\n" +
                        "Staff laboratorium"));
        mItemFaq.add(new item_faq(6, "Apakah wajib mengikuti kegiatan praktikum :",
                "Semua praktikum di laboratorium lanjut sistem komputer wajib di ikuti, karena praktikum sebagai penunjang matakuliah mahasiswa/i yang\n" +
                        "diterima di perkuliahan dan praktikum mempunyai SKS (Satuan Kredit Semester)-nya sendiri. \n"));

        adapter = new Adapter_FAQ(getApplicationContext(),mItemFaq);
        lv_faq.setAdapter(adapter);

    }
}
