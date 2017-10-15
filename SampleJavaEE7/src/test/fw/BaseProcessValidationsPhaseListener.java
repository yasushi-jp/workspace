package test.fw;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class BaseProcessValidationsPhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent arg0) {
		System.out.println("after PROCESS_VALIDATIONS");
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		System.out.println("before PROCESS_VALIDATIONS");
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.PROCESS_VALIDATIONS;
	}

}
