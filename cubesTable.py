# CPE 101 Lab 4
# Name:

def main():
   table_size = get_table_size()
   while table_size != 0:
      first = get_first()
      increment = get_increments()
      show_table(table_size, first, increment)
      table_size = get_table_size()

# Obtain a valid table size from the user
def get_table_size():
   size = int(input("Enter number of rows in table (0 to end): "))

   while size < 0:
      print("Size must be non-negative.")
      size = int(input("Enter number of rows in table (0 to end): "))
      
   return size;

# Obtain the first table entry from the user 
def get_first():
   first = int(input("Enter the value of the first number in the table: "))
   return first;
   while first < 0: 
      print ("First number must be non-negative.")

# Obtain the increment from the user 
def get_increments():
   increment = int(input("Enter the increment between rows: "))
   while increment < 0:
      print("Increment must be non-negative.")
   return increment
# Display the table of cubes
def show_table(size, first, increment):
   print("A cube table of size %d will appear here starting with %d." % (size, first))
   print("Number Cube")
   
   # Insert Loop Here
   i = 0
   cube = 5 ** 3
   sum = 0
   for i in range(size):
      print ("%-6d %d" % (first, cube))
      first = first + increment
      sum += cube 
      cube = first ** 3
   
   print ("The sum of cubes is:", sum) 
if __name__ == "__main__":
   main()
