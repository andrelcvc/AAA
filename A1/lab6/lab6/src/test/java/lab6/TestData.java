package lab6;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arquiteto.data.Data;

public class TestData {

	@Test
	public void test2000isBissexto() {
		Data data = new Data(01,01,2000);
		
		assertTrue("bissexto errado!", data.isAnoBissexto());
	}

	@Test
	public void test2004isBissexto() {
		Data data = new Data(01,01,2004);
		
		assertTrue("eh bissexto !", data.isAnoBissexto());
	}

	@Test
	public void test2005isBissexto() {
		Data data = new Data(01,01,2005);
		
		assertFalse("nao eh bissexto !", data.isAnoBissexto());
	}

}
