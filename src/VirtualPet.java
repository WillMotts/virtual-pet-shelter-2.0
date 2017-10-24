
public class VirtualPet {

	private String petType;
	private String petName;
	private int petHunger;
	private int petThirst;
	private int petBoredom;

	public void VirtualPetStats(int petHunger, int petBoredom, int petThirst, int petLife) {
		this.petHunger = petHunger;
		this.petThirst = petThirst;
		this.petBoredom = petBoredom;

	}

	public VirtualPet(String petName, String petType) {
		this.setPetType(petType);
		this.setPetName(petName);
		petThirst = 0;
		petHunger = 0;
		petBoredom = 0;
	}

	public void doTick() {
		petThirst += 10;
		petHunger += 10;
		petBoredom += 10;
	}

	public int feedPet() {
		return petHunger -= 100;
	}

	public int waterPet() {
		return petThirst += 100;
	}

	public int playPet() {
		return petBoredom += 100;
	}

	public int getPetHunger() {
		return petHunger;
	}

	public void setPetHunger(int petHunger) {
		this.petHunger = petHunger;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public int getPetBoredom() {
		return petBoredom;
	}

	public void setPetBoredom(int petBoredom) {
		this.petBoredom = petBoredom;
	}

	public int getPetThirst() {
		return petThirst;
	}

	@Override
	public String toString() {
		return "\t" + petName;
	}

}
