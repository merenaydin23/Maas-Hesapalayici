public class Çalışan {
    // Çalışanın özellikleri
    String ad;
    String soyad;
    int çalışmaSaatı;
    int işbaşlangıç;
    double maaş;

    // Constructor
    Çalışan(String ad, String soyad, int çalışmaSaatı, int işbaşlangıç, double maaş) {
        this.ad = ad;
        this.soyad = soyad;
        this.çalışmaSaatı = çalışmaSaatı;
        this.işbaşlangıç = işbaşlangıç;
        this.maaş = maaş;
    }

    // Vergi kesintisi hesaplama
    double tax() {
        double tax = 0;
        if (this.maaş < 1000) {
            System.out.println("Kesilen vergi miktarı = 0 TL");
        } else {
            tax = this.maaş * 0.03;
            System.out.println("Kesilen vergi miktarı = " + tax + " TL");
        }
        return tax;
    }

    // Bonus hesaplama
    double bonus() {
        double bonus = 0;
        if (this.çalışmaSaatı > 40) {
            bonus = (çalışmaSaatı - 40) * 30;
            System.out.println("Bonus : " + bonus + " TL");
        } else {
            System.out.println("Bonus : 0 TL");
        }
        return bonus;
    }

    // Çalışma yılına bağlı olarak maaş artışı hesaplama
    double çalışmaYılınaGöreMaaşArtışı() {
        double maaşArtışı = 0;
        int geçenYıl = 2021 - this.işbaşlangıç;

        if (geçenYıl < 10) {
            maaşArtışı = this.maaş * 0.05;
        } else if (geçenYıl < 20) {
            maaşArtışı = this.maaş * 0.1;
        } else {
            maaşArtışı = this.maaş * 0.15;
        }

        System.out.println("Maaş artışı : " + maaşArtışı + " TL");
        return maaşArtışı;
    }

    // Vergi ve bonuslar dahil toplam maaşı hesaplama
    double vergiVeBonusHesapla() {
        double vergiVeBonus = this.maaş - tax() + bonus();
        System.out.println("Vergi ve bonuslar ile birlikte maaş : " + vergiVeBonus + " TL");
        return vergiVeBonus;
    }

    // Net maaşı hesaplama
    double netMaaşHesapla() {
        double net = çalışmaYılınaGöreMaaşArtışı() + vergiVeBonusHesapla();
        System.out.println("Toplam maaş : " + net + " TL");
        return net;
    }

    // Çalışanın bilgilerini ekrana yazdırma
    void çalışanBilgileri() {
        System.out.println("Çalışanın adı: " + this.ad);
        System.out.println("Çalışanın soyadı: " + this.soyad);
        System.out.println("Çalışma saati: " + this.çalışmaSaatı);
        System.out.println("Çalışanın işe başlama yılı: " + this.işbaşlangıç);
        tax();
        bonus();
        çalışmaYılınaGöreMaaşArtışı();
        vergiVeBonusHesapla();
        netMaaşHesapla();
    }
}
