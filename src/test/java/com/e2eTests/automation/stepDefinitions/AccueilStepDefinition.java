package com.e2eTests.automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AccueilPage;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccueilStepDefinition {
	
	public WebDriver driver;
	private AccueilPage accueilPage = new AccueilPage();
	public AccueilStepDefinition() {
		driver = Setup.driver;
	}
	
	@When("^je clique sur le module Recruitment$")
	public void jeCliqueSurLeModuleRecruitment() throws Throwable {
		PageFactory.initElements(driver, AccueilPage.class);
		accueilPage.goToRecruitment(); 
	}

	@Then("^je verifie l affichage de la page Recruitment$")
	public void jeVerifieLAffichageDeLaPageRecruitment() throws Throwable {
		String pageRecruitment = AccueilPage.pageRecruitment.getText();
		Assert.assertTrue(pageRecruitment.contains("Candidates"));
	}

	@When("^je clique sur le module PIM$")
	public void jeCliqueSurLeModulePIM() throws Throwable {
		PageFactory.initElements(driver, AccueilPage.class);
		accueilPage.goToPIM(); 
	}

	@Then("^je verifie l affichage de la page PIM$")
	public void jeVerifieLAffichageDeLaPagePIM() throws Throwable {
	 String pagePIM = AccueilPage.pagePIM.getText();
	 Assert.assertTrue(pagePIM.contains("Configuration"));
	}
}
