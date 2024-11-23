import math
import unittest

class CircleTestCase(unittest.TestCase):

    def test_circle_area_1(self):
        res = area(10)
        self.assertEqual(res, math.pi * 100)
        
    def test_circle_area_2(self):
        res = area(40)
        self.assertEqual(res, math.pi * 40**2)

    def test_circle_perimeter_1(self):
        res = perimeter(239)
        self.assertEqual(res,math.pi * 239 * 2)
    
    def test_circle_perimeter_2(self):
        res = perimeter(8*9)
        self.assertEqual(res, math.pi * (8*9) * 2)

    def test_zero_area(self):
        res = area(0)
        self.assertEqual(res, 0)

    def test_zero_perimeter(self):
        res = perimeter(0)
        self.assertEqual(res, 0)



def area(r):
    return math.pi * r * r

def perimeter(r):
    return 2 * math.pi * r


