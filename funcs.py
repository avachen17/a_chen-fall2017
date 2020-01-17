#Project 1
#
#Name: Ava Chen
#Instructor: Turner
#Section: 14 

import math
from decimal import Decimal 

def poundsToKG(pounds):
   kilograms = (pounds) * 0.453592
   return kilograms 

def getMassObject(object): 
   if object == 't':
      return 0.1
   elif object == 'p':
      return 1.0
   elif object == 'r':
      return 3.0
   elif object == 'g':
      return 5.3
   elif object == 'l':
      return 9.07
   else:
      return 0.0
      
def getVelocityObject(distance):
   velocityObject = math.sqrt((9.8*distance) / 2)
   return velocityObject
 
def getVelocitySkater(massSkater, massObject, velObject):
   velocitySkater = Decimal((massObject * velObject) / (massSkater))
   velocitySkaterRounded = round(velocitySkater, 3)
   return velocitySkaterRounded


