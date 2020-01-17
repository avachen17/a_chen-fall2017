import unittest
from conditional import *

class TestCases(unittest.TestCase):
    def test_function_names(self):
         max_101(0, 0)
         max_of_three(0, 0, 0)
         rental_late_fee(0)

# Run the unit tests.
if __name__ == '__main__':
    unittest.main()

