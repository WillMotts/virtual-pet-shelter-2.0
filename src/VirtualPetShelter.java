import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> petLists = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> pets() {
		return getPetLists().values();
	}

	public void addPet(VirtualPet pet) {
		getPetLists().put(pet.getPetName(), pet);
	}

	public void removePet(String petNum) {
		getPetLists().remove(petNum);
	}

	public int getSize() {
		return getPetLists().size();
	}

	public void add(VirtualPet petNames) {
		getPetLists().put(petNames.getPetName(), petNames);
	}

	public void doTick() {
		for (VirtualPet currentPet : pets()) {
			currentPet.doTick();
		}

	}

	public Map<String, VirtualPet> getPetLists() {
		return petLists;
	}

	public void addWater() {
		for (VirtualPet currentPet : pets()) {
			currentPet.waterPet();
		}
	}

	public void playPet() {
		for (VirtualPet currentPet : pets()) {
			currentPet.playPet();

		}

	}

	public void getHunger() {

		for (VirtualPet currentPet : pets()) {
			System.out.print("Hunger is: ");
			System.out.println(currentPet.getPetHunger());
			System.out.print("For pet: ");
			System.out.println(currentPet.getPetName());

		}

	}

	public void getPetName() {

		for (VirtualPet currentPet : pets()) {
			System.out.println(currentPet.getPetName());

		}

	}

	public void getThirst() {

		for (VirtualPet currentPet : pets()) {
			System.out.print("Thirst is: ");
			System.out.println(currentPet.getPetThirst());
			System.out.print("For pet: ");
			System.out.println(currentPet.getPetName());

		}

	}

	public void feedPet() {
		for (VirtualPet currentPet : pets()) {
			currentPet.feedPet();
		}

	}

}
