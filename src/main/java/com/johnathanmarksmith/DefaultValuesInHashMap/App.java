package com.johnathanmarksmith.DefaultValuesInHashMap;



import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Date:   6/24/13 / 11:47 AM
 * Author: Johnathan Mark S
 * Email:  johnathan.smith@uftwf.org
 * <p/>
 * Comments:
 *
 *  This is Going to Be a Quick Example on How to get Default Values for
 *  objects not in a HashMap
 *
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World, Default Values In HashMap Example" );

        Map<String, String> myMap = new HashMap<String, String>();

        myMap.put("SABRAIN", "KID");
        myMap.put("JESSCIA", "KID");
        myMap.put("JOHNATHAN","ME");

        Iterator iterator = myMap.entrySet().iterator();

        /**
         *
         *   This will show all the keys and values in my hashMap
         */
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println("The key is: " + mapEntry.getKey()
                    + ",value is :" + mapEntry.getValue());
        }

        /**
         *
         * Now lets look for someone not in the map and setup a default value
         *
         */

        System.out.println(StringUtils.defaultString(myMap.get("REGAN"),"WIFE"));


    }
}
