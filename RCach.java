package com.mypackage.rcach;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuMoR on 06.03.2017.
 */
class RCach {
    private Map<String, Integer> cachValue = new HashMap<String, Integer>();
    private Map<String, Integer> cachTimeLive = new HashMap<String, Integer>();

    public Integer getRCach(String keyRCach){
        Integer timeLive;
        Integer timeNow = null;
        if (cachTimeLive.containsKey(keyRCach)){
            timeLive = cachTimeLive.get(keyRCach);
            if (timeLive < timeNow){
              return cachValue.get(keyRCach);
            }else{
              return -1;
            };
        };
    };
    public void putRCach(String keyRCach, Integer valueRCash){

    }

    public RCach(){

    }
}
