import unittest
import char

class TestChar(unittest.TestCase):
   def test_lower(self):
      self.assertFalse(char.is_lower_101('A'), False)
   def test_lower1(self):
      self.assertTrue(char.is_lower_101('b'), True)
   def test_lower2(self):
      self.assertTrue(char.is_lower_101('z'), True)
   def test_rot3(self):
      self.assertEqual(char.char_rot_13('A'), 'N')
   def test_rot4(self):
      self.assertEqual(char.char_rot_13('a'), 'n')
   def test_rot5(self):
      self.assertEqual(char.char_rot_13('Z'), 'M')

if __name__ == '__main__':
   unittest.main()

