package com.SGHK.connectjavamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IndexComposition {
	
	//public access so I don't have to implement the getters and setters for this example
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer id;		
	public float closePrice;
	public float composition;
	public String indexName;
	public String instrumentID;
	public String validFrom;
	public String validTo;
	public float weight;

}
