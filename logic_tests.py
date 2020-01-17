import unittest
from logic import *

class TestCases(unittest.TestCase):
    def test_function_names(self):
        is_even(0)
        in_an_interval(0)

# Run the unit tests.
if __name__ == '__main__':
    unittest.main()

