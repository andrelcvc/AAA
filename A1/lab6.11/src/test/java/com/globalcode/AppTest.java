package com.globalcode;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
	@Test
	public void containsNumbersInAnyOrder() {
	    List<Integer> list = Arrays.asList(5, 2, 4);

	    assertThat(list, containsInAnyOrder(2, 4, 5));
	}
	
}
