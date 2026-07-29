package models;

import java.util.Map;

public class CreateCollectionResponse {

	private String id;
	private String name;
	private Map<String,Object> data;
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setData(Map<String,Object> data) {
		this.data = data;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Map<String,Object> getData(){
		return data;
	}
	
}
