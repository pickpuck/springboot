package util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;


public class UrlMap {
	private static Logger log= Logger.getLogger(UrlMap.class);
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("fans_id", "x000001");
		map.put("thirdPartyId", "J000001");
		map.put("name", "adam");
		log.debug(map);
//		遍历map键值对
		for(Map.Entry<String, String> entry:map.entrySet()) {
			log.debug("key="+ entry.getKey() + "	value=" + entry.getValue());
		}
		
		String name = map.get("name");
		log.debug(name);
	}
}
