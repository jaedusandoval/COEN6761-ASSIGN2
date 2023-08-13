package coen6761.group.assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import coen6761.group.assign2.Quick;

public class QuickTest {

	@Test
	public void test_i_dcu() {
		assertEquals(2, Quick.partition(new Comparable[] {5,3,6,4}, 0, 3));
	}
	
	@Test
	public void test_j_dcu() {
		assertEquals(1, Quick.partition(new Comparable[] {6,8,4,9}, 0, 3));
	}
	
	@Test
	public void test_i_dpu() {
		assertEquals(1, Quick.partition(new Comparable[] {5,4}, 0, 1));
	}
	
}
