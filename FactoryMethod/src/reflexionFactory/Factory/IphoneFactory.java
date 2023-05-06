package reflexionFactory.Factory;

import Model.Iphone;

import java.io.FileInputStream;
import java.util.Properties;

public class IphoneFactory {

    private String loadConf(String nome) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("utilReflexionFactory/factory.conf"));
        for(Object key : prop.keySet())
            if(nome.equals(key))
                return (String) prop.get(key);
        return null;
    }

    public  Iphone getIphone(String nome) throws Exception{
        String className= loadConf(nome);
        return (Iphone) Class.forName(className).getConstructor().newInstance();
    }
}
