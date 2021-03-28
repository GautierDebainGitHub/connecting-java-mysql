package com.SGHK.connectjavamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path="/demoJulien")
public class MainController {
	
	@Autowired
	private IndexCompositionRepository indexCompositionRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addNewIndexComposition (
			//@RequestParam int id,
			@RequestParam float closePrice,
			@RequestParam float composition,
			@RequestParam String indexName,
			@RequestParam String instrumentID,
			@RequestParam String validFrom,
			@RequestParam String validTo,
			@RequestParam float weight) {
		
		IndexComposition ic = new IndexComposition();
		
		//attributes are public, I did not implement accessors for this test
		//ic.id = id;
		ic.closePrice = closePrice;
		ic.composition = composition;
		ic.indexName = indexName;
		ic.instrumentID = instrumentID;
		ic.validFrom = validFrom;
		ic.validTo = validTo;
		ic.weight = weight;
		indexCompositionRepository.save(ic);
		
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<IndexComposition> getAllIndexCompositions(){
		return indexCompositionRepository.findAll();
	}

}
