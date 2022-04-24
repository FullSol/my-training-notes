package com.revature.data_layer;

import com.revature.model.Wizard;

public interface DummyWizardData {
	boolean add(Wizard w);
	void delete(Wizard w);
	Wizard get(int index);
}
