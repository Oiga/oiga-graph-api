package mx.oiga.api.graph.rest.response;

import java.util.HashMap;
import java.util.Map;

/**
 * Template for rest responses:
 * 
 * { meta:{..}, response: {..}}
 * 
 * @author jaime.renato
 *
 * @param <T> Response payload
 */
public abstract class BaseResponse {
	
	/** meta property */
	private Map<String, Object> meta = new HashMap<String, Object>();
	
	/**
	 * @return the meta
	 */
	public Map<String, Object> getMeta() {
		return meta;
	}

	/**
	 * @param meta the meta to set
	 */
	public void setMeta(Map<String, Object> meta) {
		this.meta = meta;
	}
	
	
	
}
