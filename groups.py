def groups_of_3(list):
   leftover_list = []
   leftover = 0
   result = []
   if len(list) % 3 != 0:
      leftover = len(list) % 3
      index = len(list) - leftover
      leftover_list = list[index: len(list)]
   i = 0
   while i != len(list) - leftover:
      result.append(list[i: i+3])
      i += 3
   if len(leftover_list) > 0:
      result.append(leftover_list)
   return result   
#list = [1,2,3,4,5,6,7,8,9]
#print(groups_of_3(list))
