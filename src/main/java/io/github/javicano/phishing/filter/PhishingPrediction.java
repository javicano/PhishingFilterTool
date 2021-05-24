package io.github.javicano.phishing.filter;

public class PhishingPrediction {
	
	private double falseProbabilities;
	
	private double trueProbabilities;
	
	private boolean isPhishing;

	public double getFalseProbabilities() {
		return falseProbabilities;
	}

	public void setFalseProbabilities(double falseProbabilities) {
		this.falseProbabilities = falseProbabilities;
	}

	public double getTrueProbabilities() {
		return trueProbabilities;
	}

	public void setTrueProbabilities(double trueProbabilities) {
		this.trueProbabilities = trueProbabilities;
	}

	public boolean isPhishing() {
		return isPhishing;
	}

	public void setPhishing(boolean isPhishing) {
		this.isPhishing = isPhishing;
	}

}
