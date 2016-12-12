package test.java.countsteps;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.countsteps.CountSteps;

public class TestCountSteps {

	CountSteps cs = new CountSteps();
	
	@Test
	public void testCountPossibleStepCombinationsFor0Steps() {
		assertEquals("Should be 0", 0, cs.countPossibleStepCombinations(1));
	}
	
	@Test
	public void testCountPossibleStepCombinationsFor1Step() {
		assertEquals("Should be 1", 1, cs.countPossibleStepCombinations(1));
	}

	@Test
	public void testCountPossibleStepCombinationsFor2Steps() {
		assertEquals("Should be 3", 3, cs.countPossibleStepCombinations(1));
	}
	
	@Test
	public void testCountPossibleStepCombinationsFor3Steps() {
		assertEquals("Should be 6", 6, cs.countPossibleStepCombinations(1));
	}
}
