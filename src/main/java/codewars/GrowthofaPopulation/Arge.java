package codewars.GrowthofaPopulation;

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
       if (p<p0) {return 0;}
       int temp = (int) (p0+p0*percent/100+aug);
       return nbYear(temp,percent,aug,p) + 1;

    }
}
