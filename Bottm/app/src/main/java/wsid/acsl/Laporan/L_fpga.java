package wsid.acsl.Laporan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


;import wsid.acsl.R;

public class L_fpga extends Fragment {

    public L_fpga() {
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
                "\n\n LP1 | 3 FPGA-A,B,C\n" +
                        "\n 1.Apa yang dimaksud dengan VGA?\n" +
                        "2.Sebutkan dan Jelaskan standar resolusi pada VGA?\n" +
                        "3.Sebutkan dan jelaskan masing-masing pin pada VGA?\n"+
                "\n LA1 | 3 FPGA-A,B,C\n" +
                        "\n 1.Gambarkan architecture model VHDL?\n" +
                        "2.Jelaskan perbedaan Verilog dan VHDL?\n" +
                        "3.Jelaskan perulangan VHDL?\n" +
                        "4.Jelaskan kesimpulan dari bab 1?\n"+
                        "\n\n LP2 | 3 FPGA-A,B,C\n" +
                        "\n 1.Jelaskan apa yang dimaksud dengan:\n" +
                        "a)Clock\n" +
                        "b)Rise Time\n" +
                        "c)Fall Time\n" +
                        "2.Jelaskan tujuan penggunaan timer?\n" +
                        "3.Jelaskan pengertian PWM beserta penggunaan PWM?\n"+
                        "\n LA2 | 3 FPGA-A,B,C\n" +
                        "\n 1. Gambarkan Grafik & perhitungan Vout PWM?\n" +
                        "2. Gambarkan dan jelaskan bagaimana grafik duty cycle pwm?\n" +
                        "3. Jelaskan kesimpulan dari bab 2?\n",

                "\n\n LP1 | 3 FPGA-D,E,F\n" +
                        "\n 1. Apa yang anda ketahui dari VGA ?\n" +
                        "2. Tuliskan fungsi dari masing-masing pin pada port VGA !\n" +
                        "3. Jelaskan apa yang dimaksud dari DAC !\n" +
                        "4. Gambarkan rangkaian DAC pada VGA di Spartan 6 !\n"+
                        "\n LA1 | 3 FPGA-D,E,F\n" +
                        "\n 1. Apa yang membedakan antara verilog dengan VHDL ?\n" +
                        "2. Tuliskan contoh pendeklarasian arsitektur pada VHDL !\n" +
                        "3. Sebutkan dan jelaskan tipe data standar yang ada pada VHDL !\n" +
                        "4. Sebutkan dan jelaskan masing-masing operator yang ada pada :\n" +
                        "\ta. Arithmatic perators\n" +
                        "\tb. Boolean Operators\n"+
                        "\n\n LP2 | 3 FPGA-D,E,F\n" +
                        "\n 1. Jelaskan yang anda ketahui tentang clock!\n" +
                        "2. Tuliskan Pengertian dari:\n" +
                        "a. Cycle \n" +
                        "b. Cycle Time\n" +
                        "c. Rise Time\n" +
                        "d. Fall Time\n" +
                        "e. Clock Frekuensi\n" +
                        "f. Timer\n" +
                        "g. Counter\n"+
                        "\n LA2 | 3 FPGA-D,E,F\n" +
                        "\n 1. Jelaskan secara ringkas dari konsep dasar PWM !\n" +
                        "2. Sebutkan contoh pengaplikasian PWM !\n" +
                        "3. Jelaskan pengaruh prescaler pada timer !\n" +
                        "4. Jelaskan perbedaan pada percobaan timer 1 dengan percobaan mandiri 1 !\n",

                "\n\n LP1 | 3 FPGA-G,H,I\n" +
                        "\n 1. Apa itu VGA ?\n" +
                        "2. sebutkan graphic array turunan VGA !\n" +
                        "3. Apa itu DAC ? gambarkan rangkaiannya !\n"+
                        "\n LA1 | 3 FPGA-G,H,I\n" +
                        "\n 1.\tApa perbedaan verilog dan VHDL ?\n" +
                        "2.\tTuliskan package(library) yang selalu dibutuhkan dalam mendesain VHDL\n" +
                        "3.\tGambarkan gerbang logika dari source code berikut E<= (((A and B) nand (not B)) nand (B xor C) nand (C or D);\n"+
                        "\n\n LP2 | 3 FPGA-G,H,I\n" +
                        "\n 1. Apa itu timer and counter ?\n" +
                        "2. Sebutkan contoh aplikasi pwm\n" +
                        "3. Sebutkan penggunaan pwm\n"+
                        "\n LA2 | 3 FPGA-G,H,I\n" +
                        "\n 1. Tuliskan kesimpulan tentang clock\n" +
                        "2. Tuliskan syntax dengan percobaan Timer 20 bit dengann Prescaler 8 (pada bagian architecture Behavioral saja)\n" +
                        "3. Suatu mikrokontroler menggunakan crystal dengan frekuensi 8 MHz dan timer yang digunakan adalah Timer 1 (20 Bit) maka maksimum waktu Timer yang bisa dihasilkan adalah \n",

                "\n\n LP1 | 3 FPGA-J,K,L\n" +
                        "\n 1. Apa yang anda ketahui dari VGA ?\n" +
                        "2. Tuliskan fungsi dari masing-masing pin pada port VGA !\n" +
                        "3. Jelaskan apa yang dimaksud dari DAC !\n" +
                        "4. Gambarkan rangkaian DAC pada VGA di Spartan 6 \n"+
                        "\n LA1 | 3 FPGA-J,K,L\n" +
                        "\n 1. Apa yang membedakan antara verilog dengan VHDL ?\n" +
                        "2. Tuliskan contoh pendeklarasian arsitektur pada VHDL !\n" +
                        "3. Sebutkan dan jelaskan tipe data standar yang ada pada VHDL !\n" +
                        "4. Sebutkan dan jelaskan masing-masing operator yang ada pada :\n" +
                        "\ta. Arithmatic Operators\n" +
                        "\tb. Boolean Operators\n"+
                        "\n\n LP2 | 3 FPGA-J,K,L\n" +
                        "\n 1. Jelaskan yang anda ketahui tentang clock!\n" +
                        "2. Tuliskan Pengertian dari:\n" +
                        "a. Cycle \n" +
                        "b. Cycle Time\n" +
                        "c. Rise Time\n"+
                        "\n LA2 | 3 FPGA-J,K,L\n" +
                        "\n 1.\tJelaskan secara ringkas dari konsep dasar PWM !\n" +
                        "2.\tSebutkan contoh pengaplikasian PWM !\n" +
                        "3.\tBuatlah source code Timer 24 bit dengan Prescaler 4 dan menggunakan 8 LED untuk outputnya !\n",

                "\n\n LP1 | 3 FPGA-M,N,O\n" +
                        "\n 1. Tuliskan resolusi pada VGA?\n" +
                        "2. Gambarkan standart screen resolution!\n" +
                        "3. Jelaskan rangkaian DAC pada VGA?\n"+
                        "\n LA1 | 3 FPGA-M,N,O\n" +
                        "\n 1. 10 gerbang logika (ex and, or, not, dll)\n" +
                        "2. Dengan 5 input\n" +
                        "3. 1 Output\n" +
                        "4. Tuliskan code VHDL\n" +
                        "Semua praktikan tidak boleh sama\n"+
                        "\n\n LP2 | 3 FPGA-M,N,O\n" +
                        "\n 1. apa itu timer and counter ?\n" +
                        "2. Sebutkan contoh aplikasi pwm\n" +
                        "3. Sebutkan penggunaan pwm\n"+
                        "\n LA2 | 3 FPGA-M,N,O\n" +
                        "\n 1. Jelaskan Logika pemrograman Timer (Percobaan Timer)\n" +
                        "2. Jelaskan Logika Pemrograman PWM (Percobaan Mandiri 2)\n" +
                        "3. Buatlah Source Code Timer dengan Timer 20 bit dan prescaler 4 bit \n" +
                        "4. Buatlah kesimpulan dari materi dan praktikum pada bab Clock\n",

                "\n\n LP1 | 3 FPGA-P,Q,R\n" +
                        "\n 1. Apa yang kalian ketahui tentang VGA? Jelaskan!\n" +
                        "2. Gambarkan dan jelaskan fungsi PIN pada port VGA!\n" +
                        "3. Sebutkan dan jelaskan 7 resolusi pada VGA!\n"+
                        "\n LA1 | 3 FPGA-P,Q,R\n" +
                        "\n 1.\tBuatlah gerbang logika dari sintax berikut\n" +
                        "y<=((A and (A nor C) xor D) nand ((A or D) xor (B and A) nand (A xor ( B xnor D)));\n" +
                        "2.\tBuatlah table kebenaran dari program diatas\n" +
                        "3.\tBuatlah Program I/O standar(seperti percobaan 3) menggunakan 6 buah saklar dan 6 buah led. Jelaskan!\n"+
                        "\n\n LP2 | 3 FPGA-P,Q,R\n" +
                        "\n 1. apa yang kamu ketahui tentang clock, Timer, counter, dan PWM\n" +
                        "2. sebut dan jelaskan beberapa istilah penting yang berkaitan dengan clock\n" +
                        "3. Dapat digunakan untuk apa saja PWM itu?\n"+
                        "\n LA2 | 3 FPGA-P,Q,R\n" +
                        "\n 1. Jelaskan Logika pemrograman Timer (Percobaan Timer)\n" +
                        "2. Jelaskan Logika Pemrograman PWM (Percobaan Mandiri 2)\n" +
                        "3. Buatlah Source Code Timer dengan Timer 20 bit dan prescaler 4 bit\n",

                "\n\n LP1 | 3 FPGA-S,T,U\n" +
                        "\n 1. Tuliskan resolusi pada VGA?\n" +
                        "2. Gambarkan standart screen resolution!\n" +
                        "3. Jelaskan rangkaian DAC pada VGA?\n"+
                        "\n LA1 | 3 FPGA-S,T,U\n" +
                        "Buatlah struktur gerbang logika dengan:\n" +
                        "\n 1. 10 gerbang logika (ex and, or, not, dll)\n" +
                        "2. Dengan 5 input\n" +
                        "3. 1 Output\n" +
                        "4. Tuliskan code VHDL\n" +
                        "Semua praktikan tidak boleh sama\n"+
                        "\n\n LP2 | 3 FPGA-S,T,U\n" +
                        "\n 1. apa itu timer and counter ?\n" +
                        "2. Sebutkan contoh aplikasi pwm\n" +
                        "3. Sebutkan penggunaan pwm\n"+
                        "\n LA2 | 3 FPGA-S,T,U\n" +
                        "\n 1. Jelaskan Logika pemrograman Timer (Percobaan Timer)\n" +
                        "2. Jelaskan Logika Pemrograman PWM (Percobaan Mandiri 2)\n" +
                        "3. Buatlah Source Code Timer dengan Timer 20 bit dan prescaler 4 bit \n" +
                        "4. Buatlah kesimpulan dari materi dan praktikum pada bab Clock\n",

                "\n\n LP1 | 3 FPGA-V,W,X\n" +
                        "\n 1. Jelaskan tentang VGA ? Sebutkan contoh developernya! (min 5)\n" +
                        "2. RGB memiliki berapa bit warna ? Sebutkan fungsinya!\n" +
                        "3. Ada berapa port pada VGA Spartan6 ? Sebutkan dan jelaskan!\n"+
                        "\n LA1 | 3 FPGA-V,W,X\n" +
                        "\n 1. Apa itu Arsitektur pada VHDL ?\n" +
                        "2. Buat struktur sederhana penulisan koding VHDL!\n" +
                        "3. Simpulkan percobaan bab 1 ini ?\n"+
                        "\n\n LP2 | 3 FPGA-V,W,X\n" +
                        "\n 1. Apa yang kalian ketahui tentang Clock ?\n" +
                        "2. Sebutkan tujuan penggunaan Timer!\n" +
                        "3. Jelaskan secara singkat tentang PWM!\n"+
                        "\n LA2 | 3 FPGA-V,W,X\n" +
                        "\n 1. Jelaskan kesimpulan pada percobaan bab 2\n" +
                        "2. Jelaskan fungsi dari timer\n" +
                        "3. Jelaskan kondisi grafik duty cycle pada PWM\n",

                });
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

}