public class Walec extends Punkt {
    //VARIABLES
    private int height; //wysokość walca (W SUMIE TO NIEPOTRZEBNE ALE DOBRZE,ŻE JEST)
    private int radius; //promień\
    private final static String nazwa = "Walec";
    //CONSTRUCTORS
    public Walec()
    {
        super();
        this.setRadius(1);
        this.setHeight(1);
    }
    public Walec(int r,int h, int m)
    {
        super(m);
        this.setHeight(h);
        this.setRadius(r);

    }
    //METHODS
    @Override
    public double momBez() {
        return  0.5*this.getMasa()*this.getRadius()*this.getRadius();
    }

    @Override
    public void opis() {
        System.out.println(this.getNazwa());
        System.out.println("masa: " + this.getMasa());
        System.out.println("wysokosc: " + this.getHeight());
        System.out.println("promien: " + this.getRadius());
        System.out.println("moment bezwladnosci: " + this.momBez());
    }

    //ACCESSORS
    public int getHeight()
    {
        return this.height;
    }
    public void setHeight(int h)
    {
        if(h>0)
        {
            this.height = h;
            return;
        }
        else
        {
            System.out.println("Podana bledna wysokosc, ustawiono domyslna wartosc 1 ");
            this.height = 1;
            return;
        }

    }
    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int r)
    {
        if(r>0)
        {
            this.radius = r;
            return;

        }else
        {
            System.out.println("Podana bledny promien, ustawiono domyslna wartosc 1 ");
            this.radius = 1;

        }
    }
    public String getNazwa()
    {
        return this.nazwa;
    }
}
