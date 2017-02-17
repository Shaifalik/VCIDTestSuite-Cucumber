Feature: VCID API Testing

	
	Scenario: NEW USER
		Given User with msisdn "8000007000"
	    When VCID request send
		Then validate response
		Then validate entry in ZIAM database
