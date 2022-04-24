package com.revature.service_layer;

import com.revature.model.Wizard;

public interface WizardService {
	void createNewWizard(Wizard w);
	void deleteWizard(Wizard w);
	Wizard getWizard(int index);
}
