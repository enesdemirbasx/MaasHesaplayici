public class Main {
    public static void main(String[] args) {
        calisan c1 = new calisan("Enes Demirbaş", 3000, 45, 2002);
        calisan c2=new calisan("Enes Kayan",900,40,2007);
        calisan c3=new calisan("Kara Demirbaş",6000,35,2015);
        calisan c4=new calisan("Sarı Demirbaş",9000,50,1989);
        c1.tax();
        c2.tax();
        c3.tax();
        c4.tax();
        c1.bonus();
        c2.bonus();
        c3.bonus();
        c4.bonus();
        c1.yilZam();
        c2.yilZam();
        c3.yilZam();
        c4.yilZam();
        c1.yazdir();
        c2.yazdir();
        c3.yazdir();
        c4.yazdir();
    }
}