public class calisan {

    String name;
    double maas;
    int hsaat;
    int byil;
    int bonus;
    double vergi;
    double saatzam;
    calisan(String name, double maas, int hsaat, int byil) {
        this.name = name;
        this.maas = maas;
        this.hsaat = hsaat;
        this.byil = byil;
    }

    void tax() {
        if (maas >= 1000) {
            vergi = (this.maas / 100.0) * 3.0;
        }
    }

    void bonus() {
        if (hsaat > 40) {
            bonus = (hsaat - 40) * 30;
        }
    }

    void yilZam() {
        if (2022-byil < 10) {
            saatzam = (this.maas / 100) * 5;
        } else if (2022-byil > 9 && 2022-byil < 20) {
            saatzam = (this.maas / 100) * 10;
        } else if (2022-byil > 19) {
            saatzam = (this.maas / 100) * 15;
        }
    }

    void yazdir(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.maas);
        System.out.println("Haftalık Çalışma Saati: " + this.hsaat);
        System.out.println("İşe Başladığı Yıl:" + this.byil);
        System.out.println("Vergi: " + this.vergi);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maaş Artışı: " + this.saatzam);
        System.out.println("Toplam Maaş: "+((this.maas+this.bonus+this.saatzam)-this.vergi));
        System.out.println("==============================================");


    }
}
