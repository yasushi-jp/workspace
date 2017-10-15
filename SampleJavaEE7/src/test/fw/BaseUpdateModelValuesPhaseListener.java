package test.fw;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class BaseUpdateModelValuesPhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent arg0) {
		System.out.println("after UPDATE_MODEL_VALUES");
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		System.out.println("before UPDATE_MODEL_VALUES");
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.UPDATE_MODEL_VALUES;
	}

}
