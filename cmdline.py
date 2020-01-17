import sys

location = 0
for i in range(len(sys.argv)):
   print("command line argument: ", sys.argv[i])
   print("location", location)
   location += 1

