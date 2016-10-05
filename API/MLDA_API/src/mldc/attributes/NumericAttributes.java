package mldc.attributes;

import java.util.Set;

import mldc.base.MLDataMetric;
import mulan.data.MultiLabelInstances;
import weka.core.Attribute;

/**
* Class implementing the Number of numeric attributes
*
* @author Jose Maria Moyano Murillo
*/
public class NumericAttributes extends MLDataMetric{

	/**
	 * Constructor
	 */
	public NumericAttributes() {
		super("Number of numeric attributes");
	}
	
	/**
	 * Calculate metric value
	 * 
	 * @param mlData Multi-label dataset to which calculate the metric
	 * @return Value of the metric
	 */
	public double calculate(MultiLabelInstances mlData){
		Set<Attribute> attributeSet = mlData.getFeatureAttributes();
        
        int count = 0;
        
        for(Attribute att : attributeSet){
            if(att.isNumeric()){
                count++;
            }
        }
		
		this.value = count;
		return value;
	}

}