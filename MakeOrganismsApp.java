import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import answers.ComparatorEngineer;

public class MakeOrganismsApp {
	private static Map<String, Organism.NutritionSource> getSource = 
				new HashMap<String, Organism.NutritionSource>();
	private static Map<String, Organism.NutritionStyle> getStyle = 
				new HashMap<String, Organism.NutritionStyle>();
	private static void fillMaps(){
		getSource.put("A", Organism.NutritionSource.AUTOTROPHIC);
		getSource.put("H", Organism.NutritionSource.HETEROTROPHIC);
		getSource.put("B", Organism.NutritionSource.BOTH_AUTO_HETEROTROPHIC);
	
		getStyle.put("C", Organism.NutritionStyle.CHEMOSYNTHETIC);
		getStyle.put("P", Organism.NutritionStyle.PHOTOSYNTHETIC);
		getStyle.put("I", Organism.NutritionStyle.INGESTIVE);
		getStyle.put("A", Organism.NutritionStyle.ABSORBTIVE);
		getStyle.put("C_I", Organism.NutritionStyle.CHEMO_ING);
		getStyle.put("C_A", Organism.NutritionStyle.CHEMO_ABS);
		getStyle.put("P_I", Organism.NutritionStyle.PHOTO_ING);
		getStyle.put("P_A", Organism.NutritionStyle.PHOTO_ABS);
	}
	public static Organism[] getOrganismList(String fileName){
		fillMaps();
		Scanner in = null;
		try{
			File inFile = new File(fileName);
			in = new Scanner(inFile);
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		ArrayList<Organism> aList = new ArrayList<Organism>();
		in.nextLine(); //throw away header line
		while(in.hasNext()){
			String line = in.nextLine();
			String[] f = line.split("\t");
/*			public Organism(String myName, NutritionSource myNutritionSource,
					NutritionStyle myNutritionStyle, boolean myHaveNucleus,
					boolean myHaveMultiCells, boolean myHaveCellWall) {	*/		
			aList.add(new Organism(f[0], getSource.get(f[1]), getStyle.get(f[2]),
					(f[3].toLowerCase().equals("y") ? true : false),
					(f[4].toLowerCase().equals("y") ? true : false),
					(f[5].toLowerCase().equals("y") ? true : false)));
		}
		return aList.toArray(new Organism[0]);
	}
	public static void main(String[] args) {
		Organism[] orgsList = getOrganismList("organismList.txt");
		for(Organism org : orgsList){
			System.out.println(org);
		}
	}

}
