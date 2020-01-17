import sys

def main():
   file_name = sys.argv[1]   
   file_open = open(filename, 'r')
   sum = 0
   position = 0
   for line in file_open:
      position += 1
      for element in line:
         try:
            element = float(element)
            sum += element
            print(sum)
         except:
            print("Error on Line", position)
            
