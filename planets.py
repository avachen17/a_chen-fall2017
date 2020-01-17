def weight_on_planets():
   # write your code here
   weight = input('What do you weigh on earth?')
   mars = float(weight) * 0.38
   jupiter = float(weight) * 2.34
   print('On Mars you would weigh', str( mars), 'pounds.')
   print('On Jupiter you would weigh', str(jupiter), 'pounds.')   
   
   
if __name__ == '__main__':
   weight_on_planets()
