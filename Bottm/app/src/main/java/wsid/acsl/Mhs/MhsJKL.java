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


public class MhsJKL extends AppCompatActivity {

    private ListView listView;
    private MyAppAdapter myAppAdapter;
    private ArrayList<MhsPost> mhsPostArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mhs_fpga);
        listView = (ListView) findViewById(R.id.listView);
        mhsPostArrayList = new ArrayList<>();
        mhsPostArrayList.add(new MhsPost("ADITYA CHRISTIANA PUTRA","20133289","JKL-A"));
        mhsPostArrayList.add(new MhsPost("AIDHIL FHIQRI ALWAN WADJA","20133631","JKL-A"));
        mhsPostArrayList.add(new MhsPost("AKBARII FADHLI MUIN","20133699","JKL-A"));
        mhsPostArrayList.add(new MhsPost("APRILYAN DWI SAPUTRA","21313471","JKL-A"));
        mhsPostArrayList.add(new MhsPost("ARIEF BUDIMAN","21313561","JKL-A"));
        mhsPostArrayList.add(new MhsPost("BAYU ARIANDI","22133052","JKL-A"));
        mhsPostArrayList.add(new MhsPost("DESTALIANO NUR SOEMALI","22133773","JKL-A"));
        mhsPostArrayList.add(new MhsPost("DIPO GIARRI NUGROHO","23133198","JKL-A"));
        mhsPostArrayList.add(new MhsPost("ECSA AHCRI PRACASA","23133386","JKL-A"));
        mhsPostArrayList.add(new MhsPost("FADHIL MAULANA","23133739","JKL-A"));
        mhsPostArrayList.add(new MhsPost("FAHRU ROZI","23133799","JKL-B"));
        mhsPostArrayList.add(new MhsPost("FATIMAH SUNDINI","24133045","JKL-B"));
        mhsPostArrayList.add(new MhsPost("FEBRIN LUDIA R","24133130","JKL-B"));
        mhsPostArrayList.add(new MhsPost("GUNAWAN YUDHISTIRA HARIYA","24133622","JKL-B"));
        mhsPostArrayList.add(new MhsPost("HAFIS DANI WICAKSONO","24133674","JKL-B"));
        mhsPostArrayList.add(new MhsPost("HARMAN RAKHMAT HIDAYATULL","24133813","JKL-B"));
        mhsPostArrayList.add(new MhsPost("HULMAN FRANS JESSE PAKPAH","25133016","JKL-B"));
        mhsPostArrayList.add(new MhsPost("IKBAL RIWALDI","25133139","JKL-B"));
        mhsPostArrayList.add(new MhsPost("INDRA NUR SUKMA UTOMO","25133298","JKL-B"));
        mhsPostArrayList.add(new MhsPost("ISBY ISBY FADLILLA","25133493","JKL-B"));
        mhsPostArrayList.add(new MhsPost("IZHAR JIHAD ALAIL","25133563","JKL-C"));
        mhsPostArrayList.add(new MhsPost("JHON SWANDI GULTOM","25133659","JKL-C"));
        mhsPostArrayList.add(new MhsPost("JONATHAN SIHOMBING","25133694","JKL-C"));
        mhsPostArrayList.add(new MhsPost("JOSEPHINE NATALIA KWANDY","25133701","JKL-C"));
        mhsPostArrayList.add(new MhsPost("LENI PRATIWI KARDINI","26133024","JKL-C"));
        mhsPostArrayList.add(new MhsPost("MAHENDRA DIMAS PRASETYO","26133323","JKL-C"));
        mhsPostArrayList.add(new MhsPost("MOCHAMAD RIZKY EKA PUTRA","26133705","JKL-C"));
        mhsPostArrayList.add(new MhsPost("MOCHAMMAD RADIFAN","2D133263","JKL-C"));
        mhsPostArrayList.add(new MhsPost("MOHAMMAD RIFKI MAHARDHIKA","26133813","JKL-C"));
        mhsPostArrayList.add(new MhsPost("MUHAMAD REZNA NUGRAHA","26133990","JKL-C"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD ALDI RIFIANSYAH","27133069","JKL-D"));
        mhsPostArrayList.add(new MhsPost("NURIA SELORA","28133220","JKL-D"));
        mhsPostArrayList.add(new MhsPost("RADITIO KAUTSAR","28133722","JKL-D"));
        mhsPostArrayList.add(new MhsPost("RAVY OCTHAVY YANSEN","28133960","JKL-D"));
        mhsPostArrayList.add(new MhsPost("RUDI L PAKPAHAN","29133840","JKL-D"));
        mhsPostArrayList.add(new MhsPost("RYEN INDRA DOLLY","29133902","JKL-D"));
        mhsPostArrayList.add(new MhsPost("SADDAM","29133913","JKL-D"));
        mhsPostArrayList.add(new MhsPost("SAHID FADIL ABDILLAH","29133932","JKL-D"));
        mhsPostArrayList.add(new MhsPost("STEVANO GALILEA PINOA","2A133457","JKL-D"));
        mhsPostArrayList.add(new MhsPost("SUMAR ADI WIJAYA","2A133513","JKL-E"));
        mhsPostArrayList.add(new MhsPost("WAHYU EKANANDA SOENARTO","2C133764","JKL-E"));
        mhsPostArrayList.add(new MhsPost("WAHYU SRI PRATOMO","2C133157","JKL-E"));
        mhsPostArrayList.add(new MhsPost("YURICKE RULI LORANTA","2C133596","JKL-E"));
        mhsPostArrayList.add(new MhsPost("ACHMAD ARDIS SYAHPUTRA","20133096","JKL-E"));
        mhsPostArrayList.add(new MhsPost("ADAM ABDUSSALAM","20133153","JKL-E"));
        mhsPostArrayList.add(new MhsPost("AFIF FATAN AUZAR","20133383","JKL-E"));
        mhsPostArrayList.add(new MhsPost("AGUS SETYAWAN","20133507","JKL-E"));
        mhsPostArrayList.add(new MhsPost("ALFIANDRI","20133815","JKL-E"));
        mhsPostArrayList.add(new MhsPost("ANDIKA PRATAMA","21313074","JKL-E"));
        mhsPostArrayList.add(new MhsPost("BAREP CIKAL YUSUF","22133035","JKL-F"));
        mhsPostArrayList.add(new MhsPost("BELLA KARNIA SARI","22133136","JKL-F"));
        mhsPostArrayList.add(new MhsPost("DEWANGGA BAYU FACHREZA","2C133995","JKL-F"));
        mhsPostArrayList.add(new MhsPost("DIAH AYU SETIANI","2D133282","JKL-F"));
        mhsPostArrayList.add(new MhsPost("DICKY RAHMATULLAH","23133046","JKL-F"));
        mhsPostArrayList.add(new MhsPost("DWIYAN SETIA CAHYA GUSTAM","23133356","JKL-F"));
        mhsPostArrayList.add(new MhsPost("FAISAL AWALUDIN","23133813","JKL-F"));
        mhsPostArrayList.add(new MhsPost("FARHAN RIFQI MAHATIDANA","23133962","JKL-F"));
        mhsPostArrayList.add(new MhsPost("FARHAT ANUGRAH","23133971","JKL-F"));
        mhsPostArrayList.add(new MhsPost("GILBERTH HOLLYFIED TETELE","24133568","JKL-F"));
        mhsPostArrayList.add(new MhsPost("HARRY FAJAR MUHARAM","24133817","JKL-F"));
        mhsPostArrayList.add(new MhsPost("IMAM BUCHORI","25133213","JKL-G"));
        mhsPostArrayList.add(new MhsPost("IRFAAN FIDYATAMA","25133426","JKL-G"));
        mhsPostArrayList.add(new MhsPost("JAMAL SAPUTRA","25133587","JKL-G"));
        mhsPostArrayList.add(new MhsPost("KURNIAWAN APRIANTO","25133944","JKL-G"));
        mhsPostArrayList.add(new MhsPost("LEONARD FREDS MORIN","26133028","JKL-G"));
        mhsPostArrayList.add(new MhsPost("M RIZKY GERRY S","26133254","JKL-G"));
        mhsPostArrayList.add(new MhsPost("MIRETAZAM CIPTAPRIMA","26133669","JKL-G"));
        mhsPostArrayList.add(new MhsPost("MOCHAMAD RIANSYAH","26133702","JKL-G"));
        mhsPostArrayList.add(new MhsPost("MOCHAMMAD GILANG PERDANA","26133720","JKL-G"));
        mhsPostArrayList.add(new MhsPost("MOHAMAD JAKA SURYA","26133755","JKL-G"));
        mhsPostArrayList.add(new MhsPost("MUHAMAD IQBAL FIRDAUS","26133959","JKL-H"));
        mhsPostArrayList.add(new MhsPost("MUHAMAD RIZKI AINUR YAQIN","27133003","JKL-H"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD RIZKY SAPUTRA","27133527","JKL-H"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD SADDAM","27133540","JKL-H"));
        mhsPostArrayList.add(new MhsPost("MUHARAM TRI PUTRA","2D133289","JKL-H"));
        mhsPostArrayList.add(new MhsPost("NANDAR HIKMAWAN","27133807","JKL-H"));
        mhsPostArrayList.add(new MhsPost("PRASASTI ZAYD HENDRAWAN","28133481","JKL-H"));
        mhsPostArrayList.add(new MhsPost("REIVA GIOVANSYAH","2D133139","JKL-H"));
        mhsPostArrayList.add(new MhsPost("RYAN SETIAWAN","29133896","JKL-H"));
        mhsPostArrayList.add(new MhsPost("SHAFAR YULIANTO NUGROHO","2A133184","JKL-H"));
        mhsPostArrayList.add(new MhsPost("SINTA AMARDIKA","2A133296","JKL-I"));
        mhsPostArrayList.add(new MhsPost("SOFYAN TRI JUWONO","2A133406","JKL-I"));
        mhsPostArrayList.add(new MhsPost("SUJI SAPUTRA","2A133498","JKL-I"));
        mhsPostArrayList.add(new MhsPost("SYAHRIZA ARRISYIID AKFA","2A133580","JKL-I"));
        mhsPostArrayList.add(new MhsPost("YONAN WIJAYANTO","2C133453","JKL-I"));
        mhsPostArrayList.add(new MhsPost("ZANUAR ABRIANTO BASKARA","2C133653","JKL-I"));
        mhsPostArrayList.add(new MhsPost("HASAN ASARI","29133981","JKL-I"));
        mhsPostArrayList.add(new MhsPost("ABIDIN","40133075","JKL-I"));
        mhsPostArrayList.add(new MhsPost("ADITHYA NANDA P","40133274","JKL-I"));
        mhsPostArrayList.add(new MhsPost("AHMAD FAJAR","40133545","JKL-I"));
        mhsPostArrayList.add(new MhsPost("ALPIN RAHMAN","40133885","JKL-J"));
        mhsPostArrayList.add(new MhsPost("ANGGA YUDISTIRA WIBOWO","41313213","JKL-J"));
        mhsPostArrayList.add(new MhsPost("ARIF DWI SAPUTRA","4C133779","JKL-J"));
        mhsPostArrayList.add(new MhsPost("BAGUS SATRIYO WIBOWO","42133005","JKL-J"));
        mhsPostArrayList.add(new MhsPost("DEVA RISTIANA","4C133717","JKL-J"));
        mhsPostArrayList.add(new MhsPost("FEBBY PUTRA SULISTYO","44133096","JKL-J"));
        mhsPostArrayList.add(new MhsPost("FRANSISKA NAURI","44133377","JKL-J"));
        mhsPostArrayList.add(new MhsPost("HADI SETIYADI","44133654","JKL-J"));
        mhsPostArrayList.add(new MhsPost("HANDIKO PRIYONGGO","44133739","JKL-J"));
        mhsPostArrayList.add(new MhsPost("HARIS SUBEKTI","44133804","JKL-J"));
        mhsPostArrayList.add(new MhsPost("JIMAT AJI SAPUTRA","4C133769","JKL-K"));
        mhsPostArrayList.add(new MhsPost("LABIB RYAN WIBOWO","45133956","JKL-K"));
        mhsPostArrayList.add(new MhsPost("M ALZI SAPTIADI","46133216","JKL-K"));
        mhsPostArrayList.add(new MhsPost("M NAILUR ROHMAN","46133243","JKL-K"));
        mhsPostArrayList.add(new MhsPost("M SAMSUL ADI PRATAMA","46133258","JKL-K"));
        mhsPostArrayList.add(new MhsPost("RIO SANDJAYA","49133465","JKL-K"));
        mhsPostArrayList.add(new MhsPost("RIZKI KUSRANA","49133632","JKL-K"));
        mhsPostArrayList.add(new MhsPost("RUSMIATI","49133858","JKL-K"));
        mhsPostArrayList.add(new MhsPost("TAUFIK EKO SAPUTRO","4A133677","JKL-K"));
        mhsPostArrayList.add(new MhsPost("THOHIR MUSTHOFA","4A133733","JKL-K"));
        mhsPostArrayList.add(new MhsPost("UTOMO ADITYA","4A133961","JKL-L"));
        mhsPostArrayList.add(new MhsPost("VALERIE GABRIELLA","4A133966","JKL-L"));
        mhsPostArrayList.add(new MhsPost("YOGA SANTOSO","4C133409","JKL-L"));
        mhsPostArrayList.add(new MhsPost("ADITYA NAFIS GUNAWAN","40135188","JKL-L"));
        mhsPostArrayList.add(new MhsPost("MUHAMAD REZA FAHLEFI","44135413","JKL-L"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD ARIO BAGUS P","44135517","JKL-L"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD FAJAR SASMITA SADIMAN","44135573","JKL-L"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD FAKHRI HASHFI","44135575","JKL-L"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD IQBAL SETIADI","44135657","JKL-L"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD NIZAR IRMANSYAH","44135713","JKL-L"));
        mhsPostArrayList.add(new MhsPost("RAKASIWI HARITS PRATAMA","45135613","JKL-M"));
        mhsPostArrayList.add(new MhsPost("REZA ADHI SAPUTRA","45135813","JKL-M"));
        mhsPostArrayList.add(new MhsPost("REZA EKO OKTAVIANO","45135824","JKL-M"));
        mhsPostArrayList.add(new MhsPost("REZA MEI SUBAKTI","45135833","JKL-M"));
        mhsPostArrayList.add(new MhsPost("REZI ANDINI","45135854","JKL-M"));
        mhsPostArrayList.add(new MhsPost("SATRIA AJI PANGESTU","46135418","JKL-M"));
        mhsPostArrayList.add(new MhsPost("ZONATA EKA PRASETYA","47135413","JKL-M"));
        mhsPostArrayList.add(new MhsPost("MUHAMMAD IRVAN SYAHPUTRA","47135905","JKL-M"));
        mhsPostArrayList.add(new MhsPost("MHD DIMAS AFRIANDI","44135158","JKL-M"));
        mhsPostArrayList.add(new MhsPost("M REZA TANJUNG","43135942","JKL-M"));
        mhsPostArrayList.add(new MhsPost("AGAM HERDIKA","40135250","JKL-N"));
        mhsPostArrayList.add(new MhsPost("AHMAD ALFIAN NURADI","40135316","JKL-N"));
        mhsPostArrayList.add(new MhsPost("ARIF HERIANTO","40135990","JKL-N"));
        mhsPostArrayList.add(new MhsPost("ARYA SULAIMAN","41315073","JKL-N"));
        mhsPostArrayList.add(new MhsPost("CHAERUL ANWAR","41315450","JKL-N"));
        mhsPostArrayList.add(new MhsPost("DZAKY NAUFALROCHMAN","42135097","JKL-N"));
        mhsPostArrayList.add(new MhsPost("EKA APRILIAN PAHTURAHMANS","42135130","JKL-N"));
        mhsPostArrayList.add(new MhsPost("EMCO MEYER KAROSEKALI","42135206","JKL-N"));
        mhsPostArrayList.add(new MhsPost("ENDRU KRISTIAN","42135222","JKL-N"));
        mhsPostArrayList.add(new MhsPost("FAUZI FIRDAUS","42135564","JKL-N"));
        mhsPostArrayList.add(new MhsPost("HADI ISTANTO AGUSTASENA","42135972","JKL-O"));
        mhsPostArrayList.add(new MhsPost("HERMAYANTI PUTRI","43135136","JKL-O"));
        mhsPostArrayList.add(new MhsPost("HILMAN DARMAWAN","43135164","JKL-O"));
        mhsPostArrayList.add(new MhsPost("IKHSAN AKBAR WAHYU P","43135252","JKL-O"));
        mhsPostArrayList.add(new MhsPost("MOCHAMAD KHARIS","44135218","JKL-O"));
        mhsPostArrayList.add(new MhsPost("MAHENDRA DIMAS KRISTIANTO","47135921","JKL-O"));
        mhsPostArrayList.add(new MhsPost("DEDE HANIF","42133134","JKL-O"));
        mhsPostArrayList.add(new MhsPost("ATIKA ULIL","2D133136","JKL-O"));
        mhsPostArrayList.add(new MhsPost("NADIA ZAHRINA","26133286","JKL-O"));
        mhsPostArrayList.add(new MhsPost("IMAM FADIANTO","24133304","JKL-O"));
        mhsPostArrayList.add(new MhsPost("RIKI SYAHPUTRA","27133698","JKL-P"));
        mhsPostArrayList.add(new MhsPost("YEREMIA TWOMAY F","29133430","JKL-P"));
        mhsPostArrayList.add(new MhsPost("YOLLANDA WAIFAR","27133852","JKL-P"));
        mhsPostArrayList.add(new MhsPost("AANG FITRAHURACHMAN","50413002","JKL-P"));
        mhsPostArrayList.add(new MhsPost("AANG INDRA MAULANA","13213001","JKL-P"));
        mhsPostArrayList.add(new MhsPost("AANG KUNAEFI","30133001","JKL-P"));
        mhsPostArrayList.add(new MhsPost("AANG SANUSI","20213002","JKL-P"));
        mhsPostArrayList.add(new MhsPost("AANG SINGGIH HARYONO","50408001","JKL-P"));
        mhsPostArrayList.add(new MhsPost("AANG SURYADI","30416001","JKL-P"));
        mhsPostArrayList.add(new MhsPost("AANG YULIANHAR","34139670","JKL-P"));
        mhsPostArrayList.add(new MhsPost("AANISAH DESIRIA A","20133001","JKL-Q"));
        mhsPostArrayList.add(new MhsPost("AAR ZAUHARI ISLAM","20199001","JKL-Q"));
        mhsPostArrayList.add(new MhsPost("AARON DICKY TARUNA","13607001","JKL-Q"));
        mhsPostArrayList.add(new MhsPost("AARON DWI PUTRA","18136003","JKL-Q"));
        mhsPostArrayList.add(new MhsPost("AARON FRANDITO","38134013","JKL-Q"));
        mhsPostArrayList.add(new MhsPost("AARON TERTULIANUS","13137001","JKL-Q"));
        mhsPostArrayList.add(new MhsPost("AAS","50413303","JKL-Q"));
        mhsPostArrayList.add(new MhsPost("AAS ASIAH","30707001","JKL-Q"));
        mhsPostArrayList.add(new MhsPost("AAY AISYAH ANISA","1B133055","JKL-Q"));
        mhsPostArrayList.add(new MhsPost("ABAD NURUL HAKIM","1A133303","JKL-Q"));
        mhsPostArrayList.add(new MhsPost("ABADI SANTOSO","50413002","JKL-R"));
        mhsPostArrayList.add(new MhsPost("ABALJERIND","50409946","JKL-R"));
        mhsPostArrayList.add(new MhsPost("Abang Selamat","20213003","JKL-R"));
        mhsPostArrayList.add(new MhsPost("ABAS LESSY","29213167","JKL-R"));
        mhsPostArrayList.add(new MhsPost("ABAS NURRAHMAN","13315001","JKL-R"));
        mhsPostArrayList.add(new MhsPost("ABBAS ABDUL GHAFFAR","22138346","JKL-R"));
        mhsPostArrayList.add(new MhsPost("ABBASUMAR SULAEMAN","13138001","JKL-R"));
        mhsPostArrayList.add(new MhsPost("ABBEL HEDRAT FALAZI","13213301","JKL-R"));
        mhsPostArrayList.add(new MhsPost("ABBI ABDULKADIR K","13133004","JKL-R"));
        mhsPostArrayList.add(new MhsPost("ABBI NOTO","13508001","JKL-R"));
        mhsPostArrayList.add(new MhsPost("ABBIE KUS DWI YANDA","59413207","JKL-S"));
        mhsPostArrayList.add(new MhsPost("ABBIE KUSDWIYANDA","13213302","JKL-S"));
        mhsPostArrayList.add(new MhsPost("ABBIE SYAHRIN","13303239","JKL-S"));
        mhsPostArrayList.add(new MhsPost("ABBOT ISANG ARTANTIO","20213003","JKL-S"));
        mhsPostArrayList.add(new MhsPost("B. KARINA DYAHARUM IMANSA","13507272","JKL-S"));
        mhsPostArrayList.add(new MhsPost("BA'DA JUM'AT RAMADHAN","13136002","JKL-S"));
        mhsPostArrayList.add(new MhsPost("BABAN SYA'BAN","20204090","JKL-S"));
        mhsPostArrayList.add(new MhsPost("BABAR PRAMUDYA","13413004","JKL-S"));
        mhsPostArrayList.add(new MhsPost("BABAR ROY RAMADAN","21304151","JKL-S"));
        mhsPostArrayList.add(new MhsPost("BABBY HARUM SARI","13136715","JKL-S"));
        mhsPostArrayList.add(new MhsPost("BABY DIAN PERTIWI","30131301","JKL-T"));
        mhsPostArrayList.add(new MhsPost("BABY MELONIA JR JAYA N","17137315","JKL-T"));
        mhsPostArrayList.add(new MhsPost("BABY PUTRI AZAHRA","13213005","JKL-T"));
        mhsPostArrayList.add(new MhsPost("BABY ROSITA SARI MARINGKA","29133208","JKL-T"));
        mhsPostArrayList.add(new MhsPost("BABY SYIFA ANGELINE F","55409291","JKL-T"));
        mhsPostArrayList.add(new MhsPost("BACHARUDIN ABDURRASYID FA","13413005","JKL-T"));
        mhsPostArrayList.add(new MhsPost("BACHARUDIN YUDHA S","31336588","JKL-T"));
        mhsPostArrayList.add(new MhsPost("BACHMAZ BACHTIAR","13507001","JKL-T"));
        mhsPostArrayList.add(new MhsPost("BACHREMI FANANDA","50413002","JKL-T"));
        mhsPostArrayList.add(new MhsPost("BACHRIAH FATWA DHINI","13513003","JKL-T"));
        mhsPostArrayList.add(new MhsPost("BACHRUL WALIDIN","20213004","JKL-U"));
        mhsPostArrayList.add(new MhsPost("BACHRUN ARIF MUNANDAR","13213006","JKL-U"));
        mhsPostArrayList.add(new MhsPost("BACHRYAN POMADWI A","30413304","JKL-U"));
        mhsPostArrayList.add(new MhsPost("BACHRYAN SULAEMAN","13208001","JKL-U"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR","20413006","JKL-U"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR ADIGUNA","13500001","JKL-U"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR AHMAD MUSLIHIN","19513364","JKL-U"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR APRIANTO MAWARDI","13213003","JKL-U"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR ARI WIBOWO","13139520","JKL-U"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR DWI MARIENDRA","13133005","JKL-U"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR MAULANA","13133007","JKL-V"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR RAMADHAN","20213008","JKL-V"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR RAMADHAN","13213305","JKL-V"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR RIFAI","13213009","JKL-V"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR RIVAIE","13316003","JKL-V"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR RIZQI METIARDI","40203001","JKL-V"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR SAFEI","30403924","JKL-V"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR SAFEI","25209895","JKL-V"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR SANI","13133004","JKL-V"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR SEPTIADI","58413294","JKL-V"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR SIDIK","13131306","JKL-W"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR UTOMO","32138170","JKL-W"));
        mhsPostArrayList.add(new MhsPost("BACHTIAR YUNIARTO","2A213254","JKL-W"));
        mhsPostArrayList.add(new MhsPost("BACHTIARTO SEPTIARDI","20215002","JKL-W"));
        mhsPostArrayList.add(new MhsPost("BACHTY HALOMOAN S","13213007","JKL-W"));
        mhsPostArrayList.add(new MhsPost("BADAI EL YAZA AZIZ","18413447","JKL-W"));
        mhsPostArrayList.add(new MhsPost("BADAI SAMOEDRA","30134002","JKL-W"));
        mhsPostArrayList.add(new MhsPost("BADAI SUGONDO PUTRA","13213006","JKL-W"));
        mhsPostArrayList.add(new MhsPost("BADAL FATAN RAYHAN","17133366","JKL-W"));
        mhsPostArrayList.add(new MhsPost("BADAR ADI WIJAYA","13516004","JKL-W"));
        mhsPostArrayList.add(new MhsPost("BADAR SYAHWALA K","17138022","JKL-X"));
        mhsPostArrayList.add(new MhsPost("BADARUDDIN NENTO","13509785","JKL-X"));
        mhsPostArrayList.add(new MhsPost("BADE SAPUTRO","20207001","JKL-X"));
        mhsPostArrayList.add(new MhsPost("BADERI JALIL MOORCY","20136005","JKL-X"));
        mhsPostArrayList.add(new MhsPost("BADI BASTIAN","27215805","JKL-X"));
        mhsPostArrayList.add(new MhsPost("BADRA DANENDRA","13204002","JKL-X"));
        mhsPostArrayList.add(new MhsPost("BADRIAH","50415003","JKL-X"));
        mhsPostArrayList.add(new MhsPost("BADRINA ALFI SUHARTINI","18216449","JKL-X"));
        mhsPostArrayList.add(new MhsPost("BADRIYATU SHOLIHAH","13213007","JKL-X"));
        mhsPostArrayList.add(new MhsPost("BADRU SALAM","20307001","JKL-X"));






        myAppAdapter = new MyAppAdapter(mhsPostArrayList, MhsJKL.this);
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