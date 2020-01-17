import unittest
import map

class TestCases(unittest.TestCase):
   def test_1(self):
      # Add code here.
      l1 = map.square_all([0.0, 1.0, 2.0])
      l2 = [0.0, 1.0, 4.0]
      self.assertAlmostEqual(l1, l2)
   def test_2(self):
      n = 5
      l1 = [1.0, 2.0, 3.0]
      self.assertAlmostEqual(map.add_n_all(l1, n), [6.0, 7.0, 8.0])
   def test_3(self):
      list1 = [4, 6, 9, 10]
      self.assertTrue(map.even_or_odd_all(list1), [True, True, False, True])
# Run the unit tests.
if __name__ == '__main__':
   unittest.main()

