// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.publish.RestServiceRequest;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class setResponseHeader extends CustomJavaAction<Boolean>
{
	private String headerName;
	private String value;

	public setResponseHeader(IContext context, String headerName, String value)
	{
		super(context);
		this.headerName = headerName;
		this.value = value;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		RestServiceRequest.setResponseHeader(getContext(), headerName, value);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "setResponseHeader";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
