Michael Herring
ST10434179

Repo link: https://github.com/ST10434179-MichaelHerring/ST10434179_IMAD5112_Practicum/tree/master

This app was made to record user inputted days with the min temperature and maximum temperature of that day along with weather conditions.
For example:

Monday
Min Temp: 14
Max Temp: 19
Weather Conditions: Sunny

It records the user inputted values for each day and displays them.
The application also displays the average temperature over all the inputted days.

Pseudocode (unfortunately formatted very strangely, attempted to fix):

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
Screen welcoming the user, with a friendly logo. 
![Splash_Screen](https://github.com/ST10434179-MichaelHerring/ST10434179_IMAD5112_Practicum/assets/164514448/62486c82-a5b9-4518-a2e9-1676bf070953)

Main Screen
Screen where the user will be inputting their data. Temperature fields only allow integers, no strings are able to be entered.
![Main_Screen](https://github.com/ST10434179-MichaelHerring/ST10434179_IMAD5112_Practicum/assets/164514448/c2c4e9d3-0176-4aa7-96cc-19f18816ff07)


Main Screen with Temperature error(if user tries to enter a minimum value that is higher than the maximum value), trying to screenshot toasts are extremely challenging
![Main_Screen_withTempError](https://github.com/ST10434179-MichaelHerring/ST10434179_IMAD5112_Practicum/assets/164514448/bbcccc25-623f-4b56-b2bb-a5e78805728c)

Details Screen
Displays all user inputted data. If either no days or 1 day is entered, the average temperature will not be calculated and displayed.
![Details_Screen](https://github.com/ST10434179-MichaelHerring/ST10434179_IMAD5112_Practicum/assets/164514448/40b950ce-13e4-416f-b6c9-e587de4c0c51)






 
