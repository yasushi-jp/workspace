package test.fw;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class BaseInvokeApplicationPhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent arg0) {
		System.out.println("after INVOKE_APPLICATION");
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		System.out.println("before INVOKE_APPLICATION");
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.INVOKE_APPLICATION;
	}

}
