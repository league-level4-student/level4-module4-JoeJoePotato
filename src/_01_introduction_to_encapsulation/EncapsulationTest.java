package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EncapsulationTest {
@Test
	public void alltests() {
	

	EncapsulateTheData.setItemsReceived(4);
	assertEquals(4, EncapsulateTheData.getItemsReceived());
	EncapsulateTheData.setItemsReceived(-5);
	assertEquals(0, EncapsulateTheData.getItemsReceived());

	EncapsulateTheData.setDegreesTurned(120);
	assertEquals(120.0, EncapsulateTheData.getDegreesTurned());
	EncapsulateTheData.setDegreesTurned(480);
	assertEquals(120.0, EncapsulateTheData.getDegreesTurned());
	
	EncapsulateTheData.setNomenclature("yayeet");
	assertEquals("yayeet", EncapsulateTheData.getNomenclature());
	EncapsulateTheData.setNomenclature("");
	assertEquals(" ", EncapsulateTheData.getNomenclature());
	
	EncapsulateTheData.setObi(400);
	assertEquals(400, EncapsulateTheData.getObi());
	EncapsulateTheData.setObi("FIREBALL");
	assertEquals(null, EncapsulateTheData.getObi());
}
}
