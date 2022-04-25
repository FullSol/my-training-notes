package com.revature.service_tests;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.revature.data_layer.DummyWizardData;
import com.revature.data_layer.DummyWizardDataImpl;
import com.revature.model.Wizard;

public class MyServiceTest {

	@Mock
	private static DummyWizardDataImpl wizardData;
	
	private static Wizard w;
	
	@Before
	public void setUp() throws Exception {
		// make a mock of the data layer
		wizardData = new DummyWizardDataImpl();
		
		// make a wizard stub
		w = new Wizard(10, "Harry Potter", "Wingardium Levioso");
	}
	
	@Test
	public void test() {
		// act
		wizardData.add(w);
		
		// assert
		verify(wizardData, times(1)).add(w);
	}

}
