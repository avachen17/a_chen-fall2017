import unittest
from landerFuncs import *

class TestCases(unittest.TestCase):
   def test_update_acc1(self):
      self.assertAlmostEqual(updateAcceleration(1.62, 1), -1.296)
      self.assertAlmostEqual(updateAcceleration(1.62, 0), -1.62)
   def test_update_alt(self):
      self.assertAlmostEqual(updateAltitude(4.0, 5.0, 4.0), 11.0)
      self.assertAlmostEqual(updateAltitude(7.0, 8.0, 8.0), 19.0) 
   def test_update_vel(self):
      self.assertAlmostEqual(updateVelocity(5.0, 11.0), 16.0)
      self.assertAlmostEqual(updateVelocity(6.0, 12.0), 18.0)
   def test_update_fuel(self):
      self.assertAlmostEqual(updateFuel(6.0, 0), 6.0)
      self.assertAlmostEqual(updateFuel(7.0, 1), 6.0)
      

# Run the unit tests.
if __name__ == '__main__':
   unittest.main()

