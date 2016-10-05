package mldc.labelsRelation;

import mldc.base.MLDataMetric;
import mulan.data.MultiLabelInstances;
import mulan.data.Statistics;

/**
* Class implementing the Diversity
*
* @author Jose Maria Moyano Murillo
*/
public class Diversity extends MLDataMetric{

	/**
	 * Constructor
	 */
	public Diversity() {
		super("Diversity");
	}
	
	/**
	 * Calculate metric value
	 * 
	 * @param mlData Multi-label dataset to which calculate the metric
	 * @return Value of the metric
	 */
	public double calculate(MultiLabelInstances mlData){
		Statistics stat = new Statistics();
		stat.calculateStats(mlData);
		
		this.value = stat.labelSets().size() / Math.pow(2, mlData.getNumLabels());
		return value;
	}

}