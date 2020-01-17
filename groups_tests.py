import unittest
import groups

class TestGroups(unittest.TestCase):
   def test_groups(self):
      self.assertEqual(groups.groups_of_3([1, 2, 3, 4, 5, 6, 7, 8, 9]), [[1,2,3],[4,5,6],[7,8,9]])

   def test_groups_1(self):
      self.assertEqual(groups.groups_of_3([1, 2, 3, 4, 5, 6, 7, 8]), [[1,2,3],[4,5,6],[7,8]])
if __name__ == '__main__':
   unittest.main()
