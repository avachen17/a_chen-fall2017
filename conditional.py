def max_101 (num1, num2):
    if(num1 > num2): 
      return num1
    else:
       return num2

 
def max_of_three(num1, num2, num3):
    if (num1 > num2 and num1 > num3): 
      return num1
    elif (num2 > num1 and num2 > num3):
      return num2
    else:
      return num3

def rental_late_fee(days_late):
    if (days_late <= 0):
      return 0
    elif (days_late <= 9):
      return 5
    elif (days_late <= 15):
      return 7
    elif (days_late <= 24):
      return 19
    else: 
      return 100
