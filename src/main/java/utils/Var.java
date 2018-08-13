package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vietluong on 8/13/2018.
 */
public class Var {
    private static Map<String, Object> variables = new HashMap<>();

    public static void storeVariable(String key, Object value) {
        variables.put(key, value);
    }

    public static Object getVariable(String key) throws Exception {
        key = key.replaceAll("%", "");
        if (!variables.containsKey(key)) {
            throw new Exception("The key '" + key + "' does not exist.");
        }
        return variables.get(key);
    }
}
