#Project 1
#
#Ava Chen
#Turner 
#Section: 14

import funcs
def main(): 
#your code here 
    pounds = int(input("How much do you weigh (pounds)?"))
    distance = int(input("How far away is your professor (meters)?"))
    object =  input("Will you throw a rotten (t)omato, banana cream (p)ie, (r)ock, (l)ight saber, or lawn (g)nome?")
    mass = funcs.getMassObject(object)
    kilograms = funcs.poundsToKG(pounds)
    velObject = funcs.getVelocityObject(distance)
    velocity = funcs.getVelocitySkater(kilograms, mass, velObject)
    
    if mass <= 0.1:
        print ("Nice throw! You're going to get an F! \nVelocity of skater: " + str(velocity) + " m/s")
    elif mass > 0.1 and mass <= 1.0:
        print ("Nice throw! Make sure your professor is OK. \nVelocity of skater: " + str(velocity) + " m/s")
    else:
        if (distance < 20): 
            print("Nice throw! How far away is the hospital? \nVelocity of skater: " + str(velocity) + " m/s")
        else:
            print("Nice throw! RIP professor. \nVelocity of skater: " + str(velocity) + " m/s")
   
    if velocity < 0.2:
        print("My grandmother skates faster than you!")
    elif velocity >= 0.2 and velocity < 1.0: 
        print(" ")
    else:
        print("Look out for that railing!!!")
    
if __name__ == '__main__':
    main()
