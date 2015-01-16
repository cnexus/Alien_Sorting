
public class Organism {
	public enum NutritionSource {AUTOTROPHIC, HETEROTROPHIC, BOTH_AUTO_HETEROTROPHIC};
	public enum NutritionStyle {CHEMOSYNTHETIC, PHOTOSYNTHETIC, INGESTIVE, ABSORBTIVE,
		CHEMO_ING, CHEMO_ABS, PHOTO_ING, PHOTO_ABS};
	private String myName;
	private NutritionSource myNutritionSource;
	private NutritionStyle myNutritionStyle;
	private boolean myHaveNucleus;
	private boolean myHaveMultiCells;
	private boolean myHaveCellWall;
	public Organism(String myName, NutritionSource myNutritionSource,
			NutritionStyle myNutritionStyle, boolean myHaveNucleus,
			boolean myHaveMultiCells, boolean myHaveCellWall) {
		this.myName = myName;
		this.myNutritionSource = myNutritionSource;
		this.myNutritionStyle = myNutritionStyle;
		this.myHaveNucleus = myHaveNucleus;
		this.myHaveMultiCells = myHaveMultiCells;
		this.myHaveCellWall = myHaveCellWall;

	}
	public String getName() {
		return myName;
	}
	public void setName(String myName) {
		this.myName = myName;
	}
	public NutritionSource getNutritionSource() {
		return myNutritionSource;
	}
	public void setNutritionSource(NutritionSource myNutritionSource) {
		this.myNutritionSource = myNutritionSource;
	}
	public NutritionStyle getNutritionStyle() {
		return myNutritionStyle;
	}
	public void setNutritionStyle(NutritionStyle myNutritionStyle) {
		this.myNutritionStyle = myNutritionStyle;
	}
	public boolean hasNucleus() {
		return myHaveNucleus;
	}
	public void setHaveNucleus(boolean myHaveNucleus) {
		this.myHaveNucleus = myHaveNucleus;
	}
	public boolean hasMultiCells() {
		return myHaveMultiCells;
	}
	public void setHaveMultiCells(boolean myHaveMultiCells) {
		this.myHaveMultiCells = myHaveMultiCells;
	}
	public boolean hasCellWall() {
		return myHaveCellWall;
	}
	public void setHaveCellWall(boolean myHaveCellWall) {
		this.myHaveCellWall = myHaveCellWall;
	}
	@Override
	public String toString() {
		return myName + "\t" + 
		myNutritionSource + "\t" + myNutritionStyle + "\t" +
		(myHaveNucleus ? "EUKARYOTIC":"PROKARYOTIC")+ "\t" +
		(myHaveMultiCells ? "MULTICELLULAR" : "UNICELLULAR") + "\t" +
		(myHaveCellWall ? "CELL WALL" : "NO CELL WALL");		
	}	
}
