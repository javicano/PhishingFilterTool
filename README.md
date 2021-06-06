# Phishing Filter Tool

This library provides the following functinalities:
- Email features extraction for Machine Learning purpose
- Phishing email prediction using models genetared by H2O AutoML process

## Features descriptions

| Feature Name | Description |
|---|---|
| htmlBody | Checks if the email body contains HTML content |
| scriptTag | Checks if the email body contains javascript script tag |
| hexadecimalURLs | The number of URLs consisting of hexadecimal characters in the email |
| domainsCount | The number of domains in the URLs that exists in the email |
| dotsCount | The maximum number of dots that exist in a URL in the email |
| isAccountTerm | Checks if the email contains the term “Account” |
| isDearTeam | Checks if the email contains the term “Dear” |
| imagesAsURL | The number of image URLs |
| ipUrls | The number of URLs whose domain is specified as an IP address |
| isPayPalTerm | Checks if the email contains the term “PayPal” |
| isLoginTerm | Checks if the email contains the term “Login” |
| isBankTerm | Checks if the email contains the term “Bank” |
| isVerifyTerm | Checks if the email contains the term “Verify” |
| isAgreeTerm |Checks if the email contains the term “Agree” |
| isSuspendTerm | Checks if the email contains the term “Suspend” |
| domainSender | Checks if sender domain is the same as message-id domain |
| phishingTermsWeight |A weight that is assigned to each email and represents the sum of weights of the phishing terms that exists in that email|
| isPhishing | Label the email as phishing or ham |

## Getting Started

### Requirements
This program is built with Java 12. You can check your version of Java by entering the following command in a terminal window: 
```sh
java -version
```

This is a Maven project, so you must check Maven is installed in your local:
```sh
mvn -version
```

### Install library in local maven repository to be used as dependency
```sh
mvn clean install
```

### Use this library in your own applications
Use PhishingFilterTool library as dependency. For example, with maven, add the dependency in pom.xml file as follows:
```xml
  <dependencies>
  	<dependency>
      <groupId>io.github.javicano</groupId>
  	  <artifactId>PhishingFilterTool</artifactId>
  	  <version>1.0-SNAPSHOT</version>
    </dependency>
  </dependencies>
```

Get an instance of PhishingFilter class: 
```java
  PhishingFilter phishingFilter = PhishingFilterFactory.getInstance();
```

Use getFeatures(File file) method to extract features from email file
```java
  Features phishingFilter.getFeatures(file);
```

Call isPhishingEmail_Stacked(File file) method to classify into phishing/ham email using Stacked model 
```java
  PhishingPrediction phishingFilter.isPhishingEmail_Stacked(file);
```

Call isPhishingEmail_GBM(File file) method to classify into phishing/ham email using Gradient Boosting Machine model 
```java
  PhishingPrediction phishingFilter.isPhishingEmail_GBM(file);
```
