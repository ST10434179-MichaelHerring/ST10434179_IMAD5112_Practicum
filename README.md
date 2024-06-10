Michael Herring
ST10434179

Repo link: 

This app was made to record user inputted days with the min temperature and maximum temperature of that day along with weather conditions.
For example:

Monday
Min Temp: 14
Max Temp: 19
Weather Conditions: Sunny

It records the user inputted values for each day and displays them.
The application also displays the average temperature over all the inputted days.

Pseudocode:

Splash Screen:
Display splash screen with "Weather Tracker" Title, followed by custom logo, Michael Herring(full name), ST10434179(student number)
If "Get Started" button is clicked:
  Navigate to MainScreen
If "Exit" button is clicked:
Close the app

MainScreen:
Initialize days as ArrayList<String>
Initialize minTemps as ArrayList<Int>
Initialize maxTemps as ArrayList<Int>
Initialize allWeatherConditions as ArrayList<String>

Initialize edtDay
Initialize edtMinTemp
Initialize edtMaxTemp
Initialize edtWeatherConditions

Initialize btnAdd
Initialize btnClear
Initialize btnViewDetails
Initialize btnExit

if btnAdd is clicked:
	Retrieve day from edtDay
	Retrieve minTemp from edtMinTemp
	Retrieve maxTemp from edtMaxTemp
	Retrieve weatherConditions from edtWeatherConditions
	Initialize txtErrorM
	If all inputs are valid:
		If minTemp is smaller than maxTemp:
			Add day to days
			Add minTemp to minTemps
			Add maxTemp to maxTemps
			Add weatherConditions to allWeatherConditions
			Clear the input fields
			Show success message
		Else:
		Display txtErrorM
	Else:
	Display error message
	
	
if btnClear is clicked:
	Clear days
	Clear minTemps
	Clear maxTemps
	Clear allWeatherConditions
	Clear edtDay
	Clear edtMinTemp
	Clear edtMaxTemp
	Clear edtWeatherConditions
	Show message data has been cleared
	
	
if btnViewDetails is clicked:
	Create Intent to navigatge to DetailScreen
	Pass days, minTemps, maxTemps, allWeatherConditions
	Start DetailScreen Activity
	
	
DetailScreen:
Initialize txtOutput
Initialize averageTemp
Initialize btnBack

Retrieve days from Intent
Retrieve minTemps from Intent
Retrieve maxTemps from Intent
Retrieve allWeatherConditions from Intent

Initialize displayOutput as StringBuilder

Initialize totalTempForCalc as 0

For each day in days
	Append day, minTemps, maxTemps and allWeatherConditions to displayOutput
	Add minTemps and maxTemps to totalTempForCalc
	If days is empty or number of days is 1:
		Set averageTempValue to 0
	Else:
		Calculate totalTempForCalc / number of days
		
Display displayOutput in txtOutput
Display averageTempValue in averageTemp


If btnBack is clicked:
Finish current activity and navigate back to MainScreen

	
