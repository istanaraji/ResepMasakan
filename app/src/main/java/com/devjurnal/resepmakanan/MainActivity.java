package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ResepModel> listResep;
    ResepAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1. koneksi dengan recycler pada XML
        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        // TODO 2. Buat Model Class
        // TODO 3. BUat Array List
        listResep = new ArrayList<>();

        // TODO 4. Set data ke ResepModel
        ResepModel resep3 = new ResepModel();
        ResepModel resep4 = new ResepModel();
        ResepModel resep5 = new ResepModel();

        // TODO 5. Masukkan data ke List
            ResepModel resep1 = new ResepModel();
            resep1.setJudul("Es kacang merah");
            resep1.setPoster("http://inforesepmasakansederhana.com/wp-content/uploads/2017/10/es-kacang-merah-palembang.jpg");
            resep1.setSummary("Es kacang merah khas Palembang");
            resep1.setDetail(
                    "Bahan-Bahan :" +
                    "\nKacang merah : ±250 gram"+
                    "\nGula pasir : ±200 gram"+
                    "\nBubuk coklat : ±1 sendok teh"+
                    "\nSusu kental manis : 1 hingga 2 sachet, atau bisa diganti dengan santan kelapa"+
                    "\nVanili : cukup sedikit saja ( secukupnya )"+
                    "\nkayu manis : 1 batang, potong menjadi 3 bagian"+
                    "\nAir matang : 1 gelas"+
                    "\nEs batu : secukupnya"+
                    "\nGaram : ¼ sendok teh"+

                    "\n\nLangkah :" +

                    "\n1. Sehari sebelumnya rendam kacang merah semalaman, setelah perendaman biasanya kacang merah akan membesar"+
                    "\n2. Selanjutnya rebus kacang merah dengan air secukupnya hingga matang dan empuk."+
                    "\n3. Ambil wadah lain dan rebus coklat bubuk, vanili, garam dan gula pasir. Masukkan juga kayu manis. Aduk aduk secara perlahan supaya semua larut."+
                    "\n4. Selanjutnya masukkan kacang merah dan rebus kembali dengan api kecil hingga mengental."+
                    "\n5. Sajikan dengan mangkok atau gelas khusus es. Ambil kacang merah secukupnya dan siram dengan susu kental manis atau bisa juga dengan santan kental.");

        listResep.add(resep1);

            ResepModel resep2 = new ResepModel();
            resep2.setJudul("Pepes Ikan Tongkol");
            resep2.setPoster("http://inforesepmasakansederhana.com/wp-content/uploads/2017/09/pepes-ikan-tongkol.jpg");
            resep2.setSummary("Menu Pepes Ikan Tongkol");
            resep2.setDetail(
                    "Bahan Bahan :"+
                    "\nIkan tongkol segar : ± 1 kg, saya sarankan untuk memastikan ikan tongkol yang anda beli masih segar dan layak konsumsi, hal ini untuk menghindari keracunan ikan tongkol"+
                    "\nDaun pisang : secukupnya untuk membungkus, ada baiknya garang dahulu supaya daun pisang lebih lemas dan tidak mudah robek."+
                    "\nLidi untuk untuk ikat daun pisang"+

                    "\n\nBahan Bumbu :"+
                    "\nBawang putih : ± 5 siung"+
                    "\nBawang merah : sekitar 8 buah"+
                    "\nKunyit : 1 kerat sudah cukup"+
                    "\nLengkuas : kira kira 1 kerat"+
                    "\nJahe : cukup sekitar 2 cm"+
                    "\nKetumbar : sekitar 1 sendok teh"+
                    "\nKemiri : 3 butir"+
                    "\nTomat buah : 1 buah"+
                    "\nDaun jeruk : 5 lembar"+
                    "\nAsam jawa : kira kira 1 sendok teh"+
                    "\nCabe : secukupnya"+
                    "\nGula pasir, garam halus, dan penyedap rasa : secukupnya"+

                    "\n\nLangkah :"+
                    "\n1. Langkah pertama adalah tahap membersihkan ikan tongkol, buang kepala dan durinya supaya nanti mudah mengkonsumsinya."+
                    "\n2. Berikutnya uleg bumbu halus ( kecuali daun bawang ), sebaiknya jangan terlalu lembut, lebih bagus jika hasil ulegan sedikit kasar. Lantas tambahkan gula, garam, dan penyedap rasa secukupnya, Coba cicipi dahulu rasanya ya. Setelah cita rasanya pas potong potong daun bawang dan jadikan satu dengan bumbu halus."+
                    "\n3. Selanjutnya ambil selembar daun pisang dan taruh bumbu secukupnya, kemudian masukkan daging ikan tongkol dan tutupi kembali dengan bumbu halus, lalu bungkus yang rapi."+
                    "\n4. Terakhir kukus dengan langseng sekitar 30 menit"+
                    "\n5. Hidangkan bersama sepiring nasi putih hangat, selamat menikmati pepes ikan tongkol"
            );
            listResep.add(resep2);

            resep3.setJudul("Ikan mas bumbu rujak");
            resep3.setPoster("http://inforesepmasakansederhana.com/wp-content/uploads/2017/09/masakan-ikan-mas-bumbu-rujak.jpg");
            resep3.setSummary("Menu ikan mas bumbu rujak");
            resep3.setDetail(
                    "Bahan Utama :"+
                    "\nIkan mas : 1 kg, 2 ekor besar atau 3 ekor ukuran sedang" +
                    "\nJeruk nipis : 2 buah" +
                    "\n1/2 sendok teh garam" +
                    "\nGaram : secukupnya" +

                    "\nBahan bumbu halus ikan mas :" +

                    "\nBawang putih : 5 siung" +
                    "\nBawang merah : 8 buah" +
                    "\nCabe merah keriting : 5 buah atau sesuai selera" +
                    "\n Jahe : 1 kerat" +
                    "\n Kemiri : 3 buah, lebih baik di bakar atau sangrai dahulu" +

                    "\n\nBahan bumbu pelengkap :" +

                    "\nSereh : 1 batang" +
                    "\nLengkuas : 1 kerat, geprek dahulu ya" +
                    "\nDaun jeruk : 2 lembar" +
                    "\ndaun salam : 3 lembar" +
                    "\ntomat buah : 1 buah, iris tipis-tipis" +
                    "\nDaun bawang : 2 batang, iris iris" +
                    "\nAir asam jawa : ± 1 sendok makan" +
                    "\nKecap : secukupnya" +
                    "\nMinyak goreng secukupnya"+

                    "\n\nLangkah :"+
                    "\n1. Langkah pertama adalah untuk membersihkan dan menghilangkan bau lumpur ikan mas, potong menjadi 2 bagian dan kucuri dengan air jeruk nipis dan taburi garam secukupnya. Diamkan paling tidak 20 menit. Lantas bilas dengan air bersih."+
                    "\n2. Berikutnya goreng hingga matang dengan minyak panas, tempatkan dahulu dalam wadah."+
                    "\n3. Langkah selanjutnya haluskan bahan bahan bumbu halus ( bawang merah, bawang putih, cabe, jahe, dan kemiri ) dengan di uleg ya, sebaiknya jangan diblender."+
                    "\n4. Sekarang siapkan penggorengan dan minyak goreng secukupnya, dan tumis bumbu yang dihaluskan tadi hingga matang dan harum. Jangan lupa saat menumis bumbu halus dengan api kompor kecil dan aduk aduk secara perlahan."+
                    "\n5. Tambahkan lengkuas geprek, daun salam, sereh, daun jeruk, dan tomat iris, aduk aduk sebentar."+
                    "\n6. Tambah sedikit air paling tidak 100 ml, dan kecap manis 2 hingga 3 sendok makan. Tambahkan juga gula pasir, garam, dan penyedap rasa secukupnya. Aduk aduk dan tunggu hingga mendidih dan bumbu meresap. Coba cicipi dahulu, atur hingga pas rasanya." +
                    "\n7. Nah sekarang masukkan ikan mas goreng, aduk aduk dan bolak balik supaya bumbunya meresap. Diamkan beberapa saat. Kalau perlu cicipi kembali rasa kuahnya."+
                    "\n8. Kalau sudah pas, tambahkan daun bawang dan tunggu hingga layu."+
                    "\n9. Angkat dan tempatkan dalam mangkok saji."
            );

            listResep.add(resep3);
            resep4.setJudul("Sop Ayam");
            resep4.setPoster("http://resepcaramemasak.info/wp-content/uploads/2015/08/resep-sop-ayam.jpg");
            resep4.setSummary("Sop Ayam adalah masakan untuk keluarga, dengan citra rasa kaldu yang menggoda.");
            resep4.setDetail(
                    "Bahan :"+
                    "\n1 ekor ayam kampung" +
                    "\nBawang seledri atau daun bawang (sesuai selera)" +
                    "\n2 buah tomat segar" +
                    "\n3 buah kentang" +
                    "\n1 buah wortel" +
                    "\n3 buah bawang putih" +
                    "\n1 sdm garam" +
                    "\n½ sdt merica" +
                    "\n½ sdm penyedap rasa (tambahan)" +
                    "\n1L air bersih" +
                    "\nBawang goreng (tambahan)"+

                    "\n\nLangkah :"+
                    "\n1. Potong ayam menjadi beberapa bagian sesuai selera (Anda dapat memisahkan bagian tulang dan daging jika diinginkan)."+
                    "\n2. Cuci kentang dan kupas kulitnya hingga bersih."+
                    "\n3. Potong kentang menjadi bagian-bagian kecil sesuai selera."+
                    "\n4. Kupas wortel dan cuci hingga besih."+
                    "\n5. Potong wortel sesuai selera."+
                    "\n6. Cuci tomat hingga bersih."+
                    "\n7. Potong tomat sesuai selera."+
                    "\n8. Cuci bawang seledri atau daun bawang lalu iris."+
                    "\n9. Potong dan haluskan bawang putih."+
                    "\n10. Tuang 1 liter air atau secukupnya dalam wadah."+
                    "\n11. Masukkan potongan ayam dan bawang putih dalam wadah dan godok selama kurang lebih setengah jam."+
                    "\n12. Masukkan kentang, tomat, wortel, daun seledri atau daun bawang."+
                    "\n13. Tambahkan 1 sdm garam, ½ sdt merica, ½ sdm penyedap rasa (jika diinginkan)."+
                    "\n14. Biarkan hingga kentang dan wortel menjadi empuk."+
                    "\n15. Tuang isi dan kuah sop ayam dalam mangkok."+
                    "\n16. Tambahkan bawang goreng jika perlu." +
                    "\n17. Sajikan.");

        listResep.add(resep4);
        resep5.setJudul("Nasi Gudeg");
        resep5.setPoster("http://gudegyudjumpusat.com/wp-content/uploads/2015/12/Nasi-Gudeg-Ayam-Paha-Atas-Kecil.jpg");
        resep5.setSummary("Nasi Gudeg adalah makanan khas yang berasal dari kota kraton Yogyakarta.");
        resep5.setDetail(
                    "Bahan Bahan :"+
                    "\n1 kilogram Nangka muda di potong potong"+
                    "\n200 gram gula merah di sisir"+
                    "\nSantan kelapa kental"+
                    "\n10 butir telur di rebus"+
                    "\nDaun salam 2 atau 3 lembar"+
                    "\n1 liter air kelapa"+
                    "\nLengkuas potong memanjang"+

                    "\n\nBumbu Halus"+

                    "\nBawang merah 15 siung"+
                    "\nBawang putih 10 siung"+
                    "\nKemiri 10 buah disangrai"+
                    "\nKetumbar 2 sendok teh"+
                    "\nSatu setengah sendok teh merica"+
                    "\nGaram"+

                    "\n\nLangkah :"+
                    "\n1. Cuci buah nangka dengan bersih"+
                    "\n2. Sediakan Kuali (kendil) untuk memasak, masukan daun salam kemudian lengkuas dan masukan pula nangka, telur rebus serta gula aren"+
                    "\n3. Masukan air kelapa setengahnya saja kemudian masukan bumbu yang sudah dihaluskan aduk hingga tercampur rata"+
                    "\n4. Masukan setengah lagi air kelapa ke dalam panci hingga buah nangka terendam. Kemudian masak"+
                    "\n5. Masak bahan bahan dengan panci tertutup selama sekitar dua jam. Jika airnya sudah berkurang bahkan habis pisahkan telur rebusnya"+
                    "\n6. Santan dituangkan sambil nangkanya diaduk aduk."+
                    "\n7. Telur rebus dimasukkan kembali hingga terendam bersama dengan nangka"+
                    "\n8. Masak bahan bahan dengan api kecil kurang lebih empat jam. Biarkan hingga berubah kecoklatan dan kuahnya habis."
        );
        listResep.add(resep5);

        // TODO 6. Buat Adapter
        // TODO 7. Set Adapter
        adapter = new ResepAdapter(MainActivity.this, listResep);
        recycler.setAdapter(adapter);

        // TODO 8. Buat LayoutManager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
