package soal1;

public class BangunRuang {
    double luas(double la, double lb, double ls){
        return la+lb+ls;
    }
    double volume(double la, double t){
        return  la * t;
    }   
}
class Kubus extends BangunRuang {
    double luas(double sisi1){
        double la = sisi1 * sisi1;
        double lb = sisi1 * sisi1;
        double ls = (sisi1 * sisi1) *4;
        return super.luas(la, lb, ls); 
    }
    double volume(double sisi){
        double la =sisi * sisi;

        return super.volume(la, sisi);
    }
}
class Balok extends BangunRuang{
    double luas(double sisi1, double sisi2,  double t ){
        double la = sisi1 * sisi1;
        double lb = sisi1 * sisi1;
        double ls = (sisi1 * sisi2) *4;
        return super.luas(la, lb, ls); 
    }
    double volume(double sisi1, double sisi2,double t ){
        double la = sisi1* sisi2;

        return super.volume(la,t);
    }
}
class Bola extends BangunRuang{
    double luas(double sisi){
        double la = sisi *sisi * Math.PI;
        double lb = sisi *sisi * Math.PI;
        double ls = 2 * la;
        return super.luas(la, lb, ls);
    }
    double volume(double sisi){
        double la = 2/3*(sisi *sisi * Math.PI);
        double t = 2 * sisi;
        return super.volume(la, t);
    }
}
class Tabung extends BangunRuang{
    double luas(double sisi,double t){
        double la = sisi *sisi * Math.PI;
        double lb = sisi *sisi * Math.PI;
        double ls = (2 * Math.PI *sisi)*t;
        return super.luas(la, lb, ls);
    }
    double volume(double sisi, double t){
        double la = sisi *sisi * Math.PI;

        return super.volume(la,t);
    }
}