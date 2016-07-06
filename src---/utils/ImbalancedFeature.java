/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

public class ImbalancedFeature {
	
    private String name;
	
    private int appearances;
    
    private double IRInterClass;
    
    private double IRIntraClass;  
    
    private double variance;    
    
    
    /**
     * Constructor
     * 
     * @param name Name of the metric
     */
    public ImbalancedFeature(String name)
    {
        this.name = name;
        
        appearances =-1;
        IRInterClass=-1;
        IRIntraClass=-1;
        variance=-1;        
    }
    
    /**
     * Constructor
     * 
     * @param name Name of the metric
     * @param appearances Number of appearances of the feature in the dataset
     */
    public ImbalancedFeature(String name, int appearances)
    {
        this.name = name;
        this.appearances = appearances;
        
        IRInterClass = -1;
        IRIntraClass = -1;
        variance = -1;
    }
    
    /**
     * Constructor
     * 
     * @param name Name of the metric
     * @param IRIntraClass IR Intra-class value of the feature
     * @param variance Variance
     */
    public ImbalancedFeature(String name, double IRIntraClass, double variance)
    {
        this.name = name;
        this.IRIntraClass = IRIntraClass;
        this.variance = variance;
        
        IRInterClass = -1;
        appearances = -1;        
    }
    
    /**
     * Constructor
     * 
     * @param name Name of the metric
     * @param appearances Number of appearances of the feature in the dataset
     * @param IRIntraClass IR Intra-class value
     */
    public ImbalancedFeature(String name, int appearances, double IRIntraClass)
    {
        this.name = name;
        this.appearances = appearances ;
        this.IRIntraClass = IRIntraClass;
        
        IRInterClass = -1;
        variance = -1;        
    }
    
    /**
     * Constructor
     * 
     * @param name Name of the metric
     * @param appearances Number of appearances of the feature in the dataset
     * @param IRInterClass IR Inter-class value of the feature
     * @param IRIntraClass IR Intra-class value of the feature
     * @param variance Variance
     */
    public ImbalancedFeature(String name, int appearances, double IRInterClass, double IRIntraClass, double variance)
    {
        this.name = name;
        this.appearances = appearances;
        this.IRInterClass = IRInterClass;
        this.IRIntraClass = IRIntraClass;
        this.variance = variance;         
    }
    
    /**
     * Get metric name
     * 
     * @return Name of the metric
     */
    public String getName() { 
    	return name; 
    }
    
    /**
     * Get number of appearances
     * 
     * @return Number of appearances in the dataset
     */
    public int getAppearances() {
    	return appearances;
    }
    
    /**
     * Get IR Inter-class
     * 
     * @return IR Inter-class
     */
    public double getIRInterClass() {
    	return IRInterClass;
    }
    
    /**
     * Get IR Intra-class
     * 
     * @return IR Intra-class
     */
    public double getIRIntraClass() {
    	return IRIntraClass;
    }
    
    /**
     * Get variance
     * 
     * @return Variance
     */
    public double getVariance() {
    	return variance;
    }    
    
}