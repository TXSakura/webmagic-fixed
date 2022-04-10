package us.codecraft.webmagic.utils;

import cz.msebera.android.httpclient.Header;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author code4crafter@gmail.com
 *         Date: 17/3/27
 */
public abstract class HttpClientUtils {

    public static Map<String,List<String>> convertHeaders(Header[] headers){
        Map<String,List<String>> results = new HashMap<String, List<String>>();
        for (Header header : headers) {
            List<String> list = results.computeIfAbsent(header.getName(), k -> new ArrayList<>());
            list.add(header.getValue());
        }
        return results;
    }
}
