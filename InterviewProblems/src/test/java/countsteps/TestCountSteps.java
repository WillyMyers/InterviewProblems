package test.java.countsteps;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.countsteps.CountSteps;

public class TestCountSteps {

	CountSteps cs = new CountSteps();
	
	@Test
	public void testCountPossibleStepCombinationsFor0Steps() {
		assertEquals("Should be 1", 1, cs.countPossibleStepCombinations(0));
	}
	
	@Test
	public void testCountPossibleStepCombinationsFor1Step() {
		assertEquals("Should be 1", 1, cs.countPossibleStepCombinations(1));
	}

	@Test
	public void testCountPossibleStepCombinationsFor2Steps() {
		assertEquals("Should be 2", 2, cs.countPossibleStepCombinations(2));
	}

	@Test
	public void testCountPossibleStepCombinationsFor3Steps() {
		assertEquals("Should be 4", 4, cs.countPossibleStepCombinations(3));
	}
	
	@Test
	public void testCountPossibleStepCombinationsFor4Steps() {
		assertEquals("Should be 7", 7, cs.countPossibleStepCombinations(4));
	}
}
