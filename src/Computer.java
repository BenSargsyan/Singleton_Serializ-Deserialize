import java.io.Serializable;

    public class Computer implements Serializable {
    private static Computer INSTANCE;
    private String brand;
    private String mark;
    private int screenSize;

    private Computer(){}

        protected Object readResolve()
        {
            return INSTANCE;
        }

    public static Computer getINSTANCE()
    {
        if(INSTANCE==null)
        {
            synchronized(Computer.class)
            {
                if(INSTANCE==null)
                {
                    INSTANCE=new Computer();
                }
            }
        }
        return INSTANCE;
    }

    public void from(String brand,String mark,int screenSize)
    {
        INSTANCE.brand=brand;
        INSTANCE.mark=mark;
        INSTANCE.screenSize=screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", mark='" + mark + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
