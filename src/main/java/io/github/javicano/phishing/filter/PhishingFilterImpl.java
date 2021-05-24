package io.github.javicano.phishing.filter;

import java.io.File;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.apache.james.mime4j.MimeException;

import hex.genmodel.GenModel;
import hex.genmodel.MojoModel;
import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.exception.PredictException;
import hex.genmodel.easy.prediction.BinomialModelPrediction;

class PhishingFilterImpl implements PhishingFilter {
	
	PhishingFilterImpl() {
		
	}

	@Override
	public Features getFeatures(File email) throws MimeException, IOException, StackOverflowError {
		EmailParser emailParser = new EmailParser();
		return emailParser.getEmailFeatures(email.getPath());
	}

	@Override
	public PhishingPrediction isPhishingEmail_Stacked(File email) throws StackOverflowError, MimeException, PredictException, IOException {
		EasyPredictModelWrapper model;
		try {
			URL url = getClass().getClassLoader().getResource("./models/StackedEnsemble_AllModels_AutoML_20210516_182200.zip");
			model = new EasyPredictModelWrapper(MojoModel.load(url.getPath()));
			
			return getPhishingPrediction(model, email); 
		
		} catch (PredictException | IOException e) {
			e.printStackTrace();
			throw e;
		}    
	}
	
	@Override
	public PhishingPrediction isPhishingEmail_GBM(File email) throws StackOverflowError, MimeException, PredictException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException  {
		String modelClassName = "io.github.javicano.phishing.filter.GBM_grid__1_AutoML_20210523_175248_model_15";
		EasyPredictModelWrapper model;
		try {
			GenModel rawModel = (hex.genmodel.GenModel) Class.forName(modelClassName).getDeclaredConstructor().newInstance();
			model = new EasyPredictModelWrapper(rawModel);
			
			return getPhishingPrediction(model, email);
		
		} catch (PredictException | IOException e) {
			e.printStackTrace();
			throw e;
		}
	     
	}
	
	private PhishingPrediction getPhishingPrediction(EasyPredictModelWrapper model, File email) throws StackOverflowError, MimeException, IOException, PredictException {
		Features features = this.getFeatures(email);
		
		RowData row = new RowData();
		String[] fieldNames = features.fieldNames();
		String[] featuresArray = features.toArray();
		for (int i = 0; i < fieldNames.length; i ++) {
			row.put(fieldNames[i], featuresArray[i]);
		}
		
		BinomialModelPrediction p = model.predictBinomial(row);	
		PhishingPrediction phishingPrediction = new PhishingPrediction();
		for (int i = 0; i < p.classProbabilities.length; i++) {
			if (i == 0) {
				phishingPrediction.setFalseProbabilities(p.classProbabilities[i]);
			} else if ( i == 1) {
				phishingPrediction.setTrueProbabilities(p.classProbabilities[i]);
			}
			
		}
		phishingPrediction.setPhishing(p.label.equalsIgnoreCase("True") ? true : false);
		
		return phishingPrediction;
	}

}
