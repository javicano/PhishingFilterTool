package io.github.javicano.phishing.filter;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.james.mime4j.MimeException;

import hex.genmodel.easy.exception.PredictException;

/**
 * PhishingFilter
 * <p>
 * Provide the methods to extract the email features 
 */
public interface PhishingFilter {
	
    /**
     * Returns features from email 
     *
     * @param email 
     * @return features
     * @throws StackOverflowError 
     * @throws IOException 
     * @throws MimeException 
     */
	Features getFeatures(File email) throws MimeException, IOException, StackOverflowError;
	
    /**
     * Returns a boolean indicating is email is phishing 
     *
     * @param email 
     * @return isPhishing
     * @throws MimeException 
     * @throws StackOverflowError 
     * @throws PredictException 
     * @throws IOException 
     */
	PhishingPrediction isPhishingEmail_Stacked(File email) throws StackOverflowError, MimeException, PredictException, IOException;
	
    /**
	 * Returns a boolean indicating is email is phishing 
     *
     * @param email 
     * @return isPhishing
     * @throws MimeException 
     * @throws StackOverflowError 
     * @throws ClassNotFoundException 
     * @throws SecurityException 
     * @throws NoSuchMethodException 
     * @throws InvocationTargetException 
     * @throws IllegalArgumentException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     * @throws PredictException 
     * @throws IOException 
     */
	PhishingPrediction isPhishingEmail_GBM(File email) throws StackOverflowError, MimeException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, PredictException, IOException;
	

}
