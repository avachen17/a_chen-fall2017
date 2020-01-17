import unittest
import convert

class TestConvert(unittest.TestCase):
   def test_convert(self):
      self.assertEqual(convert.float_default("35", 9.0), 35.0)
   def test_convert_1(self):
      self.assertEqual(convert.float_default("xyz", 8.0), 8.0)
if __name__ == '__main__':
   unittest.main()

