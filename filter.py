def are_positive(list1):
   i = 0
   list2 = []
   for i in range(len(list1)): 
      if(list1[i] > 0):
         list2.append(list1[i])
   return list2

def are_greater_than_n(n, list1):
   list2 = []
   i = 0
   for i in range(len(list1)):
      if(list1[i] > n):
         list2.append(list1[i])
   return list2

def are_divisible_by_n(list1, n):
   list2 = []
   i = 0
   for i in range (len(list1)):
      if(list1[i] % n == 0):
         list2.append(list1[i])
   return list2
