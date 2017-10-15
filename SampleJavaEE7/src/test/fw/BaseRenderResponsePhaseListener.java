package test.fw;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class BaseRenderResponsePhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent arg0) {
		System.out.println("after RENDER_RESPONSE");
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		System.out.println("before RENDER_RESPONSE");
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RENDER_RESPONSE;
	}

}
