import unittest
import string_101

class TestString(unittest.TestCase):
   def test_rot(self):
      self.assertEqual(string_101.str_rot_13('ABCDEFGHIJ'), 'NOPQRSTUVW')
   def test_rot_1(self):
      self.assertEqual(string_101.str_rot_13('abcdefghij'), 'nopqrstuvw')
   def test_translate_2(self):
      self.assertEqual(string_101.str_translate_101('abcdcba', 'a', 'x'), 'xbcdcbx')
   def test_translate_3(self):
      self.assertEqual(string_101.str_translate_101('bbccaabbccaa', 'b', 'm'), 'mmccaammccaa')
if __name__ == '__main__':
   unittest.main()

