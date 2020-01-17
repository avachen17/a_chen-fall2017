#Ava Chen 
#May 3, 2019 
from landerFuncs import *
import math

def main(): 
   showWelcome()
   altitude = getAltitude()
   fuel = getFuel()
   time = 0
   velocity = 0
   fuelRate = 0
   displayLMState(time, altitude, velocity, fuel, fuelRate)
   while altitude > 0: 
      time += 1
      gravity = 1.62
      if(fuel > 0):
         fuelRate = getFuelRate(fuel)
      else: 
         fuelRate = 0
      fuel = updateFuel(fuel, fuelRate)
      acceleration = updateAcceleration(gravity, fuelRate)
      altitude = updateAltitude(altitude, velocity, acceleration)
      velocity = updateVelocity(velocity, acceleration)
      if(fuel > 0 and altitude > 0):   
         displayLMState(time, altitude, velocity, fuel, fuelRate)
      elif (altitude > 0):       
         print("OUT OF FUEL - Elapsed Time:%4d Altitude:%8.2f Velocity:%8.2f" %(time, altitude, velocity))
   
   print()   
   print("LM state at landing/impact")
   displayLMState(time, 0, velocity, fuel, fuelRate)
   print()
   displayLMLandingStatus (velocity)
   
if __name__ == "__main__":
   main()
