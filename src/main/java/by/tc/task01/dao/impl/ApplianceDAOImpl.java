package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public Appliance find(Criteria criteria) throws IOException {
		ArrayList<Appliance> applianceList = new ArrayList<>();

		File doc = new File("D:\\jwd-task01-template_v2\\src\\main\\resources\\appliances_db.txt");

		BufferedReader obj = new BufferedReader(new FileReader(doc));

		String strng;
		while ((strng = obj.readLine()) != null){
			String[] parts =strng.split(" : ");
			String str;
			String[] patrs2;
			switch (parts[0]) {
				case "Oven" -> {
					patrs2 = parts[1].split(", ");
					applianceList.add(new Oven(div(patrs2).get("POWER_CONSUMPTION"),
							div(patrs2).get("WEIGHT"),
							div(patrs2).get("CAPACITY"),
							div(patrs2).get("DEPTH"),
							div(patrs2).get("HEIGHT"),
							div(patrs2).get("WIDTH")));
				}
				case "Laptop" -> {
					patrs2 = parts[1].split(", ");
					applianceList.add(new Laptop(div(patrs2).get("BATTERY_CAPACITY"),
							div(patrs2).get("OS"),
							div(patrs2).get("MEMORY_ROM"),
							div(patrs2).get("SYSTEM_MEMORY"),
							div(patrs2).get("CPU"),
							div(patrs2).get("DISPLAY_INCHS")));
				}
				case "Refrigerator" -> {
					patrs2 = parts[1].split(", ");
					applianceList.add(new Refrigerator(div(patrs2).get("POWER_CONSUMPTION"),
							div(patrs2).get("WEIGHT"),
							div(patrs2).get("FREEZER_CAPACITY"),
							div(patrs2).get("OVERALL_CAPACITY"),
							div(patrs2).get("HEIGHT"),
							div(patrs2).get("WIDTH")));
				}
				case "VacuumCleaner" -> {
					patrs2 = parts[1].split(", ");
					applianceList.add(new VacuumCleaner(div(patrs2).get("POWER_CONSUMPTION"),
							div(patrs2).get("FILTER_TYPE"),
							div(patrs2).get("BAG_TYPE"),
							div(patrs2).get("WAND_TYPE"),
							div(patrs2).get("MOTOR_SPEED_REGULATION"),
							div(patrs2).get("CLEANING_WIDTH")));
				}
				case "TabletPC" -> {
					patrs2 = parts[1].split(", ");
					applianceList.add(new TabletPC(div(patrs2).get("BATTERY_CAPACITY"),
							div(patrs2).get("DISPLAY_INCHES"),
							div(patrs2).get("MEMORY_ROM"),
							div(patrs2).get("FLASH_MEMORY_CAPACITY"),
							div(patrs2).get("COLOR")));
				}
				case "Speakers" -> {
					patrs2 = parts[1].split(", ");
					applianceList.add(new Speakers(div(patrs2).get("POWER_CONSUMPTION"),
							div(patrs2).get("NUMBER_OF_SPEAKERS"),
							div(patrs2).get("FREQUENCY_RANGE"),
							div(patrs2).get("CORD_LENGTH")));
				}
				default -> {
					applianceList.add(null);
				}
			}
		}


		return null;
	}

	public Map<String,String> div(String[] parts2){
		Map<String, String> parameters = new HashMap<>() ;
		String[] parts3;
		for (String s : parts2) {
			parts3 = s.split("=");
			parameters.put(parts3[0], parts3[1]);
		}
		return parameters;
	}
	// you may add your own code here

}


//you may add your own new classes