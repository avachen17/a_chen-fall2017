import unittest
import fold
import point

class TestCases(unittest.TestCase):
   def test_1(self):
      # Add code here.
      list1 = [1, 2, 3, 4, 5]
      self.assertAlmostEqual(fold.sum(list1), 15)

   def test_2(self):
      list1 = [1, 2, 3, 4, 5]
      self.assertAlmostEqual(fold.index_of_smallest(list1), 1)

   def test_3(self):
      list1 = [1, 1, 2, 3, 4, 5]
      self.assertAlmostEqual(fold.index_of_smallest(list1), 1, 2)

   def test_4(self):
      list1 = []
      self.assertAlmostEqual(fold.index_of_smallest(list1), -1)


# Run the unit tests.
if __name__ == '__main__':
   unittest.main()

