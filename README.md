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



Splash Screen
![Splash_Screen](https://github.com/ST10434179-MichaelHerring/ST10434179_IMAD5112_Practicum/assets/164514448/62486c82-a5b9-4518-a2e9-1676bf070953)

Main Screen
![Main_Screen](https://github.com/ST10434179-MichaelHerring/ST10434179_IMAD5112_Practicum/assets/164514448/092d7ad4-040a-4cee-9bd7-0e5730f1b4c4)

Main Screen with Temperature error, trying to screenshot toasts are extremely challenging
![Main_Screen_withTempError](https://github.com/ST10434179-MichaelHerring/ST10434179_IMAD5112_Practicum/assets/164514448/bbcccc25-623f-4b56-b2bb-a5e78805728c)

Details Screen
![Details_Screen](https://github.com/ST10434179-MichaelHerring/ST10434179_IMAD5112_Practicum/assets/164514448/8820618c-e244-4938-917b-dae754c01b86)






 
