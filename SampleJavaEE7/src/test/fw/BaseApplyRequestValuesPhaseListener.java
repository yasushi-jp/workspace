package test.fw;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class BaseApplyRequestValuesPhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent arg0) {
		System.out.println("after APPLY_REQUEST_VALUES");
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		System.out.println("before APPLY_REQUEST_VALUES");
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.APPLY_REQUEST_VALUES;
	}

}
