def float_default(string, float_value):
   try:
      return float(string)
   except: 
      return float_value 

#string = "35"
#float_value = 9
#print(float_default(string, float_value))

