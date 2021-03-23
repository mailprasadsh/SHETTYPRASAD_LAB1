/**
 * 
 */
package LAB1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author user
 *
 */
public class Communication_Unit_Base implements SelfCheckCapable {


	
	String Report;
	String Signal_Decision;
	String Status_Data;
	
	Rover_Machine Report_get()
	{
		return null;
	}
	
	void Save_Report()
	{
	}
	
	
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "my commcheck";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
