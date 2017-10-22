package test.fw;

import javax.el.MethodExpression;
import javax.faces.application.NavigationHandler;
import javax.faces.component.ActionSource2;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class BaseActionListener implements ActionListener {

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {

		MethodExpression exp = ((ActionSource2)event.getComponent()).getActionExpression();
		FacesContext context = FacesContext.getCurrentInstance();
		String fromAction = null;
		String outcome = null;

		if (exp != null) {
			fromAction = exp.getExpressionString();
		}
		System.out.println("fromAction=" + fromAction);

		System.out.println("before invoke");
		outcome = (String)exp.invoke(context.getELContext(), null);
		System.out.println("after invoke");

		System.out.println("outcome=" + outcome);

		NavigationHandler handler = context.getApplication().getNavigationHandler();
		handler.handleNavigation(context, fromAction, outcome);
		context.renderResponse();
	}

}
