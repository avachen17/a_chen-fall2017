import unittest
import filter

class TestCases(unittest.TestCase):
   def test_1(self):
      list1 = [3, -4, 5, -6]
      self.assertAlmostEqual(filter.are_positive(list1), [3, 5])
   
   def test_2(self):
      n = 1
      list1 = [9, 10, 0, -9, 8, 11]
      self.assertAlmostEqual(filter.are_greater_than_n(n, list1), [9, 10, 8, 11])

   def test_3(self):
      n = 2
      list1 = [4, 5, 6, 7, 8, 9, 10]
      self.assertAlmostEqual(filter.are_divisible_by_n(list1, n), [4, 6, 8, 10])

# Run the unit tests.
if __name__ == '__main__':
   unittest.main()

