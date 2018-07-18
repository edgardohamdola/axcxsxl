package wsid.acsl.Mhs;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import wsid.acsl.R;


public class MhsFPGA extends AppCompatActivity {

    private ListView listView;
    private MyAppAdapter myAppAdapter;
    private ArrayList<MhsPost> mhsPostArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mhs_fpga);
        listView = (ListView) findViewById(R.id.listView);
        mhsPostArrayList = new ArrayList<>();
        mhsPostArrayList.add(new MhsPost("AGUNG MULYONO","20114475","FPGA-A"));
        mhsPostArrayList.add(new MhsPost("ALICYA PUTRI","20114845","FPGA-A"));
        mhsPostArrayList.add(new MhsPost("ANDIKO PRASETYO ADI","21114082","FPGA-A"));
        mhsPostArrayList.add(new MhsPost("ANDRY HERMAWAN","20106146","FPGA-A"));
        mhsPostArrayList.add(new MhsPost("ANGGI ZULIAN PUTRIAWANTI","21114235","FPGA-A"));
        mhsPostArrayList.add(new MhsPost("ANUGERAH WILDANI","21114441","FPGA-A"));
        mhsPostArrayList.add(new MhsPost("ANWAR NUR FAADHILAH","21114449","FPGA-A"));
        mhsPostArrayList.add(new MhsPost("AVIANA FURI","21114850","FPGA-A"));
        mhsPostArrayList.add(new MhsPost("AYU SEKAR RINI","2C114918","FPGA-A"));
        mhsPostArrayList.add(new MhsPost("BAYU WIDIYANTO PABISA","22114084","FPGA-A"));
        mhsPostArrayList.add(new MhsPost("BIMO ICHMU AM","22114187","FPGA-B"));
        mhsPostArrayList.add(new MhsPost("BOBBY IMFIT VALENT","22114206","FPGA-B"));
        mhsPostArrayList.add(new MhsPost("BOY BRAJA ANGGA BAYA","20106293","FPGA-B"));
        mhsPostArrayList.add(new MhsPost("CHAILIR SENTOSA","22114311","FPGA-B"));
        mhsPostArrayList.add(new MhsPost("DZUWLHANIYF A I","23114381","FPGA-B"));
        mhsPostArrayList.add(new MhsPost("EKO SAFITRI","20106461","FPGA-B"));
        mhsPostArrayList.add(new MhsPost("EMA DWI KURNIAWATI","23114547","FPGA-B"));
        mhsPostArrayList.add(new MhsPost("ENDANG SRI WAHYUNI","21106597","FPGA-B"));
        mhsPostArrayList.add(new MhsPost("EVIE ROSDIANA SARI","23114698","FPGA-B"));
        mhsPostArrayList.add(new MhsPost("FARID AL RAFI","23114973","FPGA-B"));
        mhsPostArrayList.add(new MhsPost("FUTTY PRATIWI","20106569","FPGA-C"));
        mhsPostArrayList.add(new MhsPost("HAVELIO HENAR","24114857","FPGA-C"));
        mhsPostArrayList.add(new MhsPost("HENDRA LESMANA","20106637","FPGA-C"));
        mhsPostArrayList.add(new MhsPost("HENGKY RAMADHANO","24114913","FPGA-C"));
        mhsPostArrayList.add(new MhsPost("HUSAIN VITA ABDURRAHMAN","25114019","FPGA-C"));
        mhsPostArrayList.add(new MhsPost("I GEDE PUTU MARYANTA WYAK","25114033","FPGA-C"));
        mhsPostArrayList.add(new MhsPost("IBADARROHMAN","25114045","FPGA-C"));
        mhsPostArrayList.add(new MhsPost("ICHWAN KURNIA M","25114072","FPGA-C"));
        mhsPostArrayList.add(new MhsPost("IFFAN HALID","25114093","FPGA-C"));
        mhsPostArrayList.add(new MhsPost("IKHSAN CAESARIO HARSONO","25114143","FPGA-C"));
        mhsPostArrayList.add(new MhsPost("INDRA SETYAJIWIRAWAN GURI","25114308","FPGA-D"));
        mhsPostArrayList.add(new MhsPost("JAKA ASMARA FAZRIANA","25114581","FPGA-D"));
        mhsPostArrayList.add(new MhsPost("JORDI IRSANDI HIDAYAT","25114696","FPGA-D"));
        mhsPostArrayList.add(new MhsPost("KRISEDHO YOGISA","20106788","FPGA-D"));
        mhsPostArrayList.add(new MhsPost("MARTININGTYAS KUSMAN","26114435","FPGA-D"));
        mhsPostArrayList.add(new MhsPost("MEDINA YULIANI SANTOSO","26114520","FPGA-D"));
        mhsPostArrayList.add(new MhsPost("MERDY LESMANA","20106874","FPGA-D"));
        mhsPostArrayList.add(new MhsPost("MISBACH ISRON MEITIRTO","26114673","FPGA-D"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD IHSAN","27114318","FPGA-D"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD PASCAL FAJRIN","27114453","FPGA-E"));
        mhsPostArrayList.add(new MhsPost("NABILLA HANYFA FAUZI","27114718","FPGA-E"));
        mhsPostArrayList.add(new MhsPost("NANDA IKHSANABDULLAH UTAM","27114798","FPGA-E"));
        mhsPostArrayList.add(new MhsPost("NAUFAL ANIS RAMADHAN","27114848","FPGA-E"));
        mhsPostArrayList.add(new MhsPost("NUGRAHA RANDI PRATAMA","21106694","FPGA-E"));
        mhsPostArrayList.add(new MhsPost("NUR AKBAR DIBYOHUSODO","21106547","FPGA-E"));
        mhsPostArrayList.add(new MhsPost("NUR ANI BADRIYAH","28114142","FPGA-E"));
        mhsPostArrayList.add(new MhsPost("NURSAN TRI AGUNG","21106026","FPGA-E"));
        mhsPostArrayList.add(new MhsPost("PRATAMA INDRA RASWOKO","28114492","FPGA-E"));
        mhsPostArrayList.add(new MhsPost("REZA TIAR KUSUMA","21106157","FPGA-E"));
        mhsPostArrayList.add(new MhsPost("RIFQI FAUZI","29114372","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("RISYAD FADILLAH","29114533","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("RIVO NOVETLY REPIANE","21106214","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("SATRIO TEJO UTOMO","2A114080","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("SITI NURHASANAH","2A114380","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("TIA PITALOKA","2D114039","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("VERDI EKO PRABOWO","2A114997","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("WAHYU SUPRIYADI","21106454","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("WISNU RAHARDIAN PRATAMA","2C114308","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("ABDU AL GHOFUR","20114014","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("ABRIANTO PUTRA KUSUMA","20114085","FPGA-F"));
        mhsPostArrayList.add(new MhsPost("ADAM YOGI SAPUTRA","20114175","FPGA-G"));
        mhsPostArrayList.add(new MhsPost("ADITYA AGNESA PUTRA","20114285","FPGA-G"));
        mhsPostArrayList.add(new MhsPost("ADITYA ESWIN PAMUNGKAS","20114295","FPGA-G"));
        mhsPostArrayList.add(new MhsPost("ADITYA RAHMADI","20114319","FPGA-G"));
        mhsPostArrayList.add(new MhsPost("ADNAN HAVIF M","20114342","FPGA-G"));
        mhsPostArrayList.add(new MhsPost("AHMAD HUSEIN","20114566","FPGA-G"));
        mhsPostArrayList.add(new MhsPost("ALIZA AZHARI","20114870","FPGA-G"));
        mhsPostArrayList.add(new MhsPost("AMIR HUSEIN","20114964","FPGA-G"));
        mhsPostArrayList.add(new MhsPost("ANDRIANSYAH GANANG","21114164","FPGA-G"));
        mhsPostArrayList.add(new MhsPost("ANGGRAINI INDAH SANI","21114249","FPGA-G"));
        mhsPostArrayList.add(new MhsPost("ARDI GUSMAN","21106585","FPGA-H"));
        mhsPostArrayList.add(new MhsPost("ARDI SETYO PRABOWO","21114495","FPGA-H"));
        mhsPostArrayList.add(new MhsPost("ARFADILLA PRIATAMA","21114515","FPGA-H"));
        mhsPostArrayList.add(new MhsPost("ARIEF RACHMAN HAKIM","20106213","FPGA-H"));
        mhsPostArrayList.add(new MhsPost("ARVI RIZKI WIRMANSYAH","21114701","FPGA-H"));
        mhsPostArrayList.add(new MhsPost("BIMA DWI PAMUNGKAS","22114171","FPGA-H"));
        mhsPostArrayList.add(new MhsPost("DENI YULI PUTRA M","20106360","FPGA-H"));
        mhsPostArrayList.add(new MhsPost("DITIA RAMADHAN","20107519","FPGA-H"));
        mhsPostArrayList.add(new MhsPost("EDI SUSANTO","20108657","FPGA-H"));
        mhsPostArrayList.add(new MhsPost("ENDANG IRAWAN","26109285","FPGA-H"));
        mhsPostArrayList.add(new MhsPost("FADLI RAMADHAN","23114764","FPGA-I"));
        mhsPostArrayList.add(new MhsPost("FAHMI RABSANJANI MUKHDOR","2D114150","FPGA-I"));
        mhsPostArrayList.add(new MhsPost("FARID MAHDI","23114976","FPGA-I"));
        mhsPostArrayList.add(new MhsPost("FERDINAL YUHDI","24114163","FPGA-I"));
        mhsPostArrayList.add(new MhsPost("FIRDAUS RACHMAN","24114262","FPGA-I"));
        mhsPostArrayList.add(new MhsPost("FIRMAN MUHAMMAD H","24114287","FPGA-I"));
        mhsPostArrayList.add(new MhsPost("FITRI NOVITA YANI","24114331","FPGA-I"));
        mhsPostArrayList.add(new MhsPost("FUTRO IGHNAUL MALIK AL AZ","24114408","FPGA-I"));
        mhsPostArrayList.add(new MhsPost("GALANG FAHMI MAULANA","24114426","FPGA-I"));
        mhsPostArrayList.add(new MhsPost("GINDA SULTANSEAN","24114572","FPGA-I"));
        mhsPostArrayList.add(new MhsPost("HARIAWAN NUR FAJRI","24114797","FPGA-J"));
        mhsPostArrayList.add(new MhsPost("HENDRO PRIYONO","20106642","FPGA-J"));
        mhsPostArrayList.add(new MhsPost("HERDYNANSYAH","24114934","FPGA-J"));
        mhsPostArrayList.add(new MhsPost("HITOSI MARIO NAGA MAIT","20106661","FPGA-J"));
        mhsPostArrayList.add(new MhsPost("JEFKY PANGGABEAN","25114619","FPGA-J"));
        mhsPostArrayList.add(new MhsPost("LEPRANDO","26114038","FPGA-J"));
        mhsPostArrayList.add(new MhsPost("LUTHFI ERZANI ATMAJA","26114189","FPGA-J"));
        mhsPostArrayList.add(new MhsPost("MARTHIN PANDAPOTAN","26114432","FPGA-J"));
        mhsPostArrayList.add(new MhsPost("MAULANA PRATAMA RACHMAN","26114472","FPGA-J"));
        mhsPostArrayList.add(new MhsPost("MOCHAMAD PUNTODEWO","20106828","FPGA-J"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD AMMAR RAMADHAN","27114077","FPGA-K"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD NUSH IMAM M","27114447","FPGA-K"));
        mhsPostArrayList.add(new MhsPost("NANCY LIDYA","20106967","FPGA-K"));
        mhsPostArrayList.add(new MhsPost("NUR INDRA PERKASA","28114168","FPGA-K"));
        mhsPostArrayList.add(new MhsPost("NURDIN KAROMAH","28114206","FPGA-K"));
        mhsPostArrayList.add(new MhsPost("PUTRA CAHYA N","28114568","FPGA-K"));
        mhsPostArrayList.add(new MhsPost("PUTRA SEJATI SUNARDI","21106072","FPGA-K"));
        mhsPostArrayList.add(new MhsPost("RADEN WAHYU AJI TRIYONO","28114714","FPGA-K"));
        mhsPostArrayList.add(new MhsPost("RASYID ABDUL RACHMAN","28114938","FPGA-K"));
        mhsPostArrayList.add(new MhsPost("REZA RENALDI","29114186","FPGA-K"));
        mhsPostArrayList.add(new MhsPost("RIDWAN BAEHAQI","2D114093","FPGA-L"));
        mhsPostArrayList.add(new MhsPost("RIKKI SETIANTO","29114395","FPGA-L"));
        mhsPostArrayList.add(new MhsPost("SAPTO FEBRIYANTO","2A114014","FPGA-L"));
        mhsPostArrayList.add(new MhsPost("SIGIT SURYAWASKITO","2A114268","FPGA-L"));
        mhsPostArrayList.add(new MhsPost("AHMAD ANSHORI","20114534","FPGA-L"));
        mhsPostArrayList.add(new MhsPost("AKBAR FAUZI","20114692","FPGA-L"));
        mhsPostArrayList.add(new MhsPost("ANDI SETIAWAN","21114058","FPGA-L"));
        mhsPostArrayList.add(new MhsPost("ANDRE ADITAMA","21114101","FPGA-L"));
        mhsPostArrayList.add(new MhsPost("BRIAN APRIANDI","22114223","FPGA-L"));
        mhsPostArrayList.add(new MhsPost("BRIAN HOSEA","2C114967","FPGA-L"));
        mhsPostArrayList.add(new MhsPost("BUNGSU WIGUNA","22114252","FPGA-M"));
        mhsPostArrayList.add(new MhsPost("CHAIRUL ARIFIN PUTRA SAKU","22114314","FPGA-M"));
        mhsPostArrayList.add(new MhsPost("DIAZ SUKMA LAKSANA PUTRA","23114031","FPGA-M"));
        mhsPostArrayList.add(new MhsPost("DODDY HEMAWAN RUSDI","23114228","FPGA-M"));
        mhsPostArrayList.add(new MhsPost("EKO PRAWITO","23114469","FPGA-M"));
        mhsPostArrayList.add(new MhsPost("ERNT FAISAL RIYANTO","23114640","FPGA-M"));
        mhsPostArrayList.add(new MhsPost("EVAN SETYAWAN","2C114930","FPGA-M"));
        mhsPostArrayList.add(new MhsPost("FARHAN SYADIDA","23114965","FPGA-M"));
        mhsPostArrayList.add(new MhsPost("HERDI SETIAWAN","24114927","FPGA-M"));
        mhsPostArrayList.add(new MhsPost("IBRAHIM F","20106673","FPGA-M"));
        mhsPostArrayList.add(new MhsPost("KHAIRUL HAYAD RAEDI","25114843","FPGA-N"));
        mhsPostArrayList.add(new MhsPost("LATIFAH SAFITRI","26114001","FPGA-N"));
        mhsPostArrayList.add(new MhsPost("LUCKY YAN PERMANA","21107013","FPGA-N"));
        mhsPostArrayList.add(new MhsPost("LUTHFI KAMAL","26114190","FPGA-N"));
        mhsPostArrayList.add(new MhsPost("MOHAMMAD HIDAYAT UMASUGI","26114794","FPGA-N"));
        mhsPostArrayList.add(new MhsPost("MUHAMAD FAISAL HASIBUAN","26114923","FPGA-N"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD AZIB ABIDIN","27114117","FPGA-N"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD FARHAN PRADITYA","27114224","FPGA-N"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD FARHAN RAFSANZAN","27114225","FPGA-N"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD FIRZA DAHRIEL SY","27114259","FPGA-N"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD ILMAN NAFIS","27114335","FPGA-O"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD MUDJIB","27114414","FPGA-O"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD NAUFAL HUMAM","27114427","FPGA-O"));
        mhsPostArrayList.add(new MhsPost("NAUFAL WIDHYATRIANTO","27114864","FPGA-O"));
        mhsPostArrayList.add(new MhsPost("NURANDI RESTA ABDILAH","21106698","FPGA-O"));
        mhsPostArrayList.add(new MhsPost("OLIVIA","28114342","FPGA-O"));
        mhsPostArrayList.add(new MhsPost("QUSNUL VIVIAN CRYSY L.","28114651","FPGA-O"));
        mhsPostArrayList.add(new MhsPost("RAHMAT NURCAHYANTO","28114806","FPGA-O"));
        mhsPostArrayList.add(new MhsPost("RESTU WIDIANTO","29114099","FPGA-O"));
        mhsPostArrayList.add(new MhsPost("REYNALDI ANJAS SAPUTRA","29114136","FPGA-O"));
        mhsPostArrayList.add(new MhsPost("RISKY HERDIWIBOWO","29114508","FPGA-P"));
        mhsPostArrayList.add(new MhsPost("ROBBI MAULIDI","29114751","FPGA-P"));
        mhsPostArrayList.add(new MhsPost("TAPTA ZANILATIP","2A114664","FPGA-P"));
        mhsPostArrayList.add(new MhsPost("TAUFIX AL FAIRI","2A114685","FPGA-P"));
        mhsPostArrayList.add(new MhsPost("TUBAGUS ATMADIPURA","21108975","FPGA-P"));
        mhsPostArrayList.add(new MhsPost("URIF PRASAL LABAMBA","21106692","FPGA-P"));
        mhsPostArrayList.add(new MhsPost("WAWAN KURNIAWAN","21106463","FPGA-P"));
        mhsPostArrayList.add(new MhsPost("WILLY DOZEN PRASETHIO","2C114245","FPGA-P"));
        mhsPostArrayList.add(new MhsPost("YAZEED SYAHBANA HALIM","2C114370","FPGA-P"));
        mhsPostArrayList.add(new MhsPost("YOGI HERMANSYAH","2C114420","FPGA-P"));
        mhsPostArrayList.add(new MhsPost("YOGI PUTRA PANGESTU","2C114426","FPGA-Q"));
        mhsPostArrayList.add(new MhsPost("YUDHA WIRA WASKITA","2C114502","FPGA-Q"));
        mhsPostArrayList.add(new MhsPost("YUDI SATRIA","2C114516","FPGA-Q"));
        mhsPostArrayList.add(new MhsPost("YUNAZ MUHAMMAD ALFAUZI","2C114572","FPGA-Q"));
        mhsPostArrayList.add(new MhsPost("ADITYA ABIYYUDHA","20114283","FPGA-Q"));
        mhsPostArrayList.add(new MhsPost("AHMAD PARWIS","20106080","FPGA-Q"));
        mhsPostArrayList.add(new MhsPost("AHYA ALIF GAFIKI","20114627","FPGA-Q"));
        mhsPostArrayList.add(new MhsPost("ALDI DHARMAWAN","20114738","FPGA-Q"));
        mhsPostArrayList.add(new MhsPost("ALDI MUCHAMAD YASIN","20111547","FPGA-Q"));
        mhsPostArrayList.add(new MhsPost("ALOSIUS YUDHA BAYUONO","20114883","FPGA-Q"));
        mhsPostArrayList.add(new MhsPost("ANANDA WISNUWARDHANA","20114995","FPGA-R"));
        mhsPostArrayList.add(new MhsPost("ANDHIKA RAMANDA SAPUTRA","21114028","FPGA-R"));
        mhsPostArrayList.add(new MhsPost("ANDRI FIRMANSYAH","21114150","FPGA-R"));
        mhsPostArrayList.add(new MhsPost("APRIYADI AZIZ","21114473","FPGA-R"));
        mhsPostArrayList.add(new MhsPost("ARBIANTO PUTRA KUSUMA","21114480","FPGA-R"));
        mhsPostArrayList.add(new MhsPost("ARIQ NAUFAL IK PUTRA","21114638","FPGA-R"));
        mhsPostArrayList.add(new MhsPost("AULIA HARITS FARIZI","21114818","FPGA-R"));
        mhsPostArrayList.add(new MhsPost("BAGUS TRIAWAN","22114010","FPGA-R"));
        mhsPostArrayList.add(new MhsPost("DANAR ILHAM PRIAMBODO","22114501","FPGA-R"));
        mhsPostArrayList.add(new MhsPost("DEDE NITA","22114615","FPGA-R"));
        mhsPostArrayList.add(new MhsPost("DEDE RAMADHAN TRIPUTRA","22114619","FPGA-S"));
        mhsPostArrayList.add(new MhsPost("DIAS PRATAMA IRVAN A","23114028","FPGA-S"));
        mhsPostArrayList.add(new MhsPost("DINANTO AJI NUGROHO","23114146","FPGA-S"));
        mhsPostArrayList.add(new MhsPost("EKO PRASETYO UTOMO","23114467","FPGA-S"));
        mhsPostArrayList.add(new MhsPost("ERIK MUWARDI","22111457","FPGA-S"));
        mhsPostArrayList.add(new MhsPost("FAKHRI ABIYANSYAH PUTRA","23114898","FPGA-S"));
        mhsPostArrayList.add(new MhsPost("FEISAL RACHMAT","24114145","FPGA-S"));
        mhsPostArrayList.add(new MhsPost("GERALDY AXL VERDIAN","24114488","FPGA-S"));
        mhsPostArrayList.add(new MhsPost("GERY ROSADI","20106580","FPGA-S"));
        mhsPostArrayList.add(new MhsPost("GURUH ADI NUGRAHA","24114630","FPGA-S"));
        mhsPostArrayList.add(new MhsPost("HADI ANDRIAN","24114649","FPGA-T"));
        mhsPostArrayList.add(new MhsPost("HANIF HENDRA PERMANA","24114754","FPGA-T"));
        mhsPostArrayList.add(new MhsPost("IHSAN SANUBARI","25114111","FPGA-T"));
        mhsPostArrayList.add(new MhsPost("IMAM MULHAKIM","25114220","FPGA-T"));
        mhsPostArrayList.add(new MhsPost("MEGA PERMANA","2C114738","FPGA-T"));
        mhsPostArrayList.add(new MhsPost("MUHAMAD FADHILLAH","26114915","FPGA-T"));
        mhsPostArrayList.add(new MhsPost("MUHAMAD FAHRI RAMDANI","26114921","FPGA-T"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD APRIZAL","27114089","FPGA-T"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD BAQIER","27114128","FPGA-T"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD TOMY ANAKTA","27114570","FPGA-T"));
        mhsPostArrayList.add(new MhsPost("NOVIANSYAH DWI JAYA","28114063","FPGA-U"));
        mhsPostArrayList.add(new MhsPost("PITRANI EXNIHILO","28114453","FPGA-U"));
        mhsPostArrayList.add(new MhsPost("PRADITYA SETIAWAN RACHMAN","28114469","FPGA-U"));
        mhsPostArrayList.add(new MhsPost("REZA PHALEVI","29114180","FPGA-U"));
        mhsPostArrayList.add(new MhsPost("RIDJKI RANGGA","29114307","FPGA-U"));
        mhsPostArrayList.add(new MhsPost("RIFAI KUNCORO","29114341","FPGA-U"));
        mhsPostArrayList.add(new MhsPost("RIFKI AULIA","29114354","FPGA-U"));
        mhsPostArrayList.add(new MhsPost("RUNGGU CLAIRE","29114854","FPGA-U"));
        mhsPostArrayList.add(new MhsPost("TEGUH PUTRA PERDANA","2A114712","FPGA-U"));
        mhsPostArrayList.add(new MhsPost("WAHYU AJIS SAPUTRA","2C114121","FPGA-U"));
        mhsPostArrayList.add(new MhsPost("WISNU ADJI PRADANA","2C114297","FPGA-V"));
        mhsPostArrayList.add(new MhsPost("WISNU SINGGIH PAMBUDI","2C114310","FPGA-V"));
        mhsPostArrayList.add(new MhsPost("YUNUS","2C114592","FPGA-V"));
        mhsPostArrayList.add(new MhsPost("AGUNG ARDIAN","20114454","FPGA-V"));
        mhsPostArrayList.add(new MhsPost("AHMAD ZIKRI","20114620","FPGA-V"));
        mhsPostArrayList.add(new MhsPost("AJI CAHYO LAKSONO","20114670","FPGA-V"));
        mhsPostArrayList.add(new MhsPost("ANAM ROWI","20114985","FPGA-V"));
        mhsPostArrayList.add(new MhsPost("AULIA RAHMAN","21114831","FPGA-V"));
        mhsPostArrayList.add(new MhsPost("AUTIA AL FITRAH","21114847","FPGA-V"));
        mhsPostArrayList.add(new MhsPost("BAYU DWI RENDRAGRAHA","22114058","FPGA-V"));
        mhsPostArrayList.add(new MhsPost("BHAYANGKARA S P","22114154","FPGA-W"));
        mhsPostArrayList.add(new MhsPost("DHELA ANDRA MAHARDIKA","22114921","FPGA-W"));
        mhsPostArrayList.add(new MhsPost("ENRICO PANGESTU","23114583","FPGA-W"));
        mhsPostArrayList.add(new MhsPost("FARIS DRIAN MIRZAPAMUNGKA","2D114002","FPGA-W"));
        mhsPostArrayList.add(new MhsPost("IQBAL NAHAQGA ALI HAMDI","25114404","FPGA-W"));
        mhsPostArrayList.add(new MhsPost("KRISNA FAJAR DWI PUTRA","2D114192","FPGA-W"));
        mhsPostArrayList.add(new MhsPost("M FACHRIYAN GUNAWAN","26114224","FPGA-W"));
        mhsPostArrayList.add(new MhsPost("M. ALFI SYAHRIN ICHSAN","26114270","FPGA-W"));
        mhsPostArrayList.add(new MhsPost("MAIKAEL PRATAMA HARYANTO","26114333","FPGA-W"));
        mhsPostArrayList.add(new MhsPost("METHA ERZHA CHAIRANI","26114604","FPGA-W"));
        mhsPostArrayList.add(new MhsPost("MIA RACHMAH NARULITA","26114622","FPGA-X"));
        mhsPostArrayList.add(new MhsPost("MONALDO ANDREAS","26114831","FPGA-X"));
        mhsPostArrayList.add(new MhsPost("MUHAMAD ALI SADIKIN","26114898","FPGA-X"));
        mhsPostArrayList.add(new MhsPost("MUHAMAD KAMALLUDIN","26114970","FPGA-X"));
        mhsPostArrayList.add(new MhsPost("MUHAMAD RIZKY SAPUTRA","27114008","FPGA-X"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD IKMALUDDIN","27114324","FPGA-X"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD NOVAN PAHLEVY","27114435","FPGA-X"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD RIZKY","27114519","FPGA-X"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD SURINDRA","27114554","FPGA-X"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD ZULFIKRI P","27114611","FPGA-X"));




        myAppAdapter = new MyAppAdapter(mhsPostArrayList, MhsFPGA.this);
        listView.setAdapter(myAppAdapter);
    }

    public class MyAppAdapter extends BaseAdapter {

        public class ViewHolder {
            TextView txtTitle, txtSubTitle,txtShift;


        }

        public List<MhsPost> parkingList;

        public Context context;
        ArrayList<MhsPost> arraylist;

        private MyAppAdapter(List<MhsPost> apps, Context context) {
            this.parkingList = apps;
            this.context = context;
            arraylist = new ArrayList<MhsPost>();
            arraylist.addAll(parkingList);

        }

        @Override
        public int getCount() {
            return parkingList.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View rowView = convertView;
            ViewHolder viewHolder;

            if (rowView == null) {
                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.mhs_item_post, null);
                // configure view holder
                viewHolder = new ViewHolder();
                viewHolder.txtTitle = (TextView) rowView.findViewById(R.id.title);
                viewHolder.txtSubTitle = (TextView) rowView.findViewById(R.id.subtitle);
                viewHolder.txtShift = (TextView) rowView.findViewById(R.id.Shift);
                rowView.setTag(viewHolder);

            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }

            viewHolder.txtTitle.setText(parkingList.get(position).getPostTitle() + "");
            viewHolder.txtSubTitle.setText(parkingList.get(position).getPostSubTitle() + "");
            viewHolder.txtShift.setText(parkingList.get(position).getPostShift() + "");
            return rowView;


        }

        public void filter(String charText) {

            charText = charText.toLowerCase(Locale.getDefault());

            parkingList.clear();
            if (charText.length() == 0) {
                parkingList.addAll(arraylist);

            } else {
                for (MhsPost mhsPostDetail : arraylist) {
                    if (charText.length() != 0 && mhsPostDetail.getPostTitle().toLowerCase(Locale.getDefault()).contains(charText)) {
                        parkingList.add(mhsPostDetail);
                    } else if (charText.length() != 0 && mhsPostDetail.getPostSubTitle().toLowerCase(Locale.getDefault()).contains(charText)) {
                        parkingList.add(mhsPostDetail);
                    }
                    else if (charText.length() != 0 && mhsPostDetail.getPostShift().toLowerCase(Locale.getDefault()).contains(charText)) {
                        parkingList.add(mhsPostDetail);
                    }
                }
            }
            notifyDataSetChanged();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mhs_menu_search, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        //*** setOnQueryTextFocusChangeListener ***
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {

            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String searchQuery) {
                myAppAdapter.filter(searchQuery.toString().trim());
                listView.invalidate();
                return true;
            }
        });

        MenuItemCompat.setOnActionExpandListener(searchItem, new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                // Do something when collapsed
                return true;  // Return true to collapse action view
            }

            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                // Do something when expanded
                return true;  // Return true to expand action view
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}