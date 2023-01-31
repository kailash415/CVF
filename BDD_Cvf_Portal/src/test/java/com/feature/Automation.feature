Feature: CVF Portals-TestData
@OntCreation
Scenario: ONT Creation

	Given user open the url 
	When enter userid "btwma1" 
	When enter password "btwma1"
	Then click login button
	When select journey type
	When select Product type
	When select Transaction type
	When select EventType type
	When select Event type
	And enter Address Key "A900000"
	And enter Floor "55"
	And enter Room "55"
	And enter Position "55"
	Then click submit button
	
    @Addresskey
	Scenario: create Addresskey
	
    Given user open the url 
	When enter userid "btwma1" 
	When enter password "btwma1"
	Then click login button
    When select Addresskeyjourney type
	When select AddresskeyProduct type
	When select AddresskeyTransaction type
	When select AddresskeyEventType type
	When select AddresskeyEvent type
	And enter thoroughfarenNo "A900000"
	And enter thoroughfarenName "55"
	And enter PostTown "55"
	And enter Postcode "55"
	Then click submit button
	
	@updateNAD
	Scenario: updateNAD Addresskey
	
    Given user open the url 
	When enter userid "btwma1" 
	When enter password "btwma1"
	Then click login button
    When select updateNADjourney type
	When select updateNADProduct type
	When select updateNADTransaction type
	When select updateNADEventType type
	When select updateNADEvent type
	And enter Addresskey for updateNAD "S900000591548"
	And enter Addresstype for updateNAD
	And enter Addresstype for TransportMedium
	And enter Addresstype for FTTPSiteType
	Then click submit button for updateNAD
	
	@pauseatkci1
	Scenario: Pause at KCI1
	
    Given user open the url 
	When enter userid "btwma1" 
	When enter password "btwma1"
	Then click login button
	When select pause1journey type
	When select pause1Product type
	When select pause1Transaction type
	When select pause1EventType type
	When select pause1Event type
	And enter order for pausedatkci1 "1-166"
	And select kci
	Then click_submit_button_for_pauseatkci1
	
	@releasepo
	Scenario: release PO
	
    Given user open the url 
	When enter userid "btwma1" 
	When enter password "btwma1"
	Then click login button
	When select pause1journey type
	When select pause1Product type
	When select pause1Transaction type
	When select pause1EventType type
	When select pause1Event type
	And enter order for pausedatkci1 "1-166"
	And select kcireleasepo
	Then click_submit_button_for_pauseatkci1
	
	
	
	