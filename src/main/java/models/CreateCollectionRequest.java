package models;

import java.util.HashMap;
import java.util.Map;

public class CreateCollectionRequest {

	private String name;
	
	private Map<String,Object> data;
	
	
	public Map<String,Object> getData() {
		return data;
	}
	
	public void setData(Map<String,Object> data) {
		this.data = data;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
