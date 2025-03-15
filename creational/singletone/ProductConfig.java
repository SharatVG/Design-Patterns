package creational.singletone;

import java.util.Map;

public enum ProductConfig {

    INSTANCE;

    private Map<String, Object> productConfig;

    public  static ProductConfig getInstance(){
        return INSTANCE;
    }

    private ProductConfig(){

    }

}
