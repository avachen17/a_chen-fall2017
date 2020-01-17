# Project 2 - Moonlander
# Author: Ava Chen 
# Section: 14 

def showWelcome():
   print()
   print("Welcome aboard the Lunar Module Flight Simulator")
   print()
   print("   To begin you must specify the LM's initial altitude")
   print("   and fuel level.  To simulate the actual LM use")
   print("   values of 1300 meters and 500 liters, respectively.")
   print()
   print("   Good luck and may the force be with you!")
   print()


def getAltitude():
   altitude = int(input("Enter the initial altitude of the LM (in meters): "))
   while (altitude < 1 or altitude >= 9999):
      print("ERROR: Altitude must be between 1 and 9999, inclusive, please try again")
      altitude = int(input("Enter the initial altitude of the LM (in meters): "))
   return altitude

def getFuel():
   fuelAmount = int(input("Enter the initial amount of fuel on board the LM (in liters): "))
   while (fuelAmount < 0): 
     print("ERROR: Amount of fuel must be positive, please try again")
     fuelAmount = int(input("Enter the initial amount of fuel on board the LM (in liters): "))      
   return fuelAmount 

def displayLMState(elapsedTime, altitude, velocity, fuelAmount, fuelRate): 
   if (elapsedTime == 0): 
      print()
      print("LM state at retrorocket cutoff")
   print("%13s %4d s"% ("Elapsed Time:", elapsedTime))
   print("%13s %4d l"% ("Fuel:", fuelAmount))
   print("%13s %4d l/s"% ("Rate:", fuelRate))
   print("%13s %7.2f m"% ("Altitude:", altitude))
   print("%13s %7.2f m/s"% ("Velocity:", velocity))     

def getFuelRate(currentFuel): 
   print()
   fuelRate = int(input("Enter fuel rate (0-9, 0=freefall, 5=constant velocity, 9=max thrust): ")) 
   while(fuelRate < 0 or fuelRate > 9):
      print("ERROR: Fuel rate must be between 0 and 9, inclusive")
      fuelRate = int(input("Enter fuel rate (0-9, 0=freefall, 5=constant velocity, 9=max thrust): "))
   if(currentFuel < fuelRate): 
      return currentFuel
   else:
      return fuelRate

def updateAcceleration(gravity, fuelRate):
   acceleration = gravity * ((fuelRate/5) - 1)
   return acceleration
	
def updateAltitude(altitude, velocity, acceleration):
   altitude = altitude + velocity + (acceleration / 2)
   return altitude 

def updateVelocity(velocity, acceleration):
   velocity = velocity + acceleration 
   return velocity 

def updateFuel(fuel, fuelRate):
   fuel = fuel - fuelRate 
   return fuel
 
def displayLMLandingStatus(velocity):
   if(velocity >= -1 and velocity <= 0): 
      print("Status at landing - The eagle has landed!")
   elif (velocity < -1  and velocity > -10): 
      print("Status at landing - Enjoy your oxygen while it lasts!")
   elif (velocity <= -10):
      print("Status at landing - Ouch - that hurt!")




   # set default values
	# ASKING 'user' FOR VALUE
	# fuel = GETFUEL()
   # displayState(default_value1, default_value2, ..)
   # while loop while a certain condition is met (spaceship not on the ground)
	# update defaultvalues
	# altitude = updateAlitidue(...)
	#
	
