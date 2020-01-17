import math
def square_all(list1):
   return [i**2 for i in list1]

def add_n_all (list1, n):
   i = 0
   list2 = []
   for i in range(len(list1)):
      sum = list1[i] + n
      list2.append(sum)
   return list2

def even_or_odd_all(list1):
   i = 0
   for i in range(len(list1)):
      if (list1[i] % 2 == 0):
         return True 
      else:
         return False 
