package cs_utec.cs2901;

import org.apache.log4j.Logger;

public class App 
{
    final static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        for (int i = 0; i < 100; i++)
        {
            //System.out.println("Me debo lavar las manos por 20 segundos");
            logger.info("Me debo lavar las manos por 20 segundos");
        }
    }
}
