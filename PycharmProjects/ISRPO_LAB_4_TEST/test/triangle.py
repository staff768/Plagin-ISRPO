import unittest

class TriangleTestCase(unittest.TestCase):

    def test_triangle_area_1(self):
        res = area(10,100)
        self.assertEqual(res, 500)
        
    def test_triangle_area_2(self):
        res = area(6,5)
        self.assertEqual(res, 15)

    def test_triangle_perimeter_1(self):
        res = perimeter(10,10,10)
        self.assertEqual(res, 30)
    
    def test_triangle_perimeter_2(self):
        res = perimeter(200, 30, 9)
        self.assertEqual(res, 239)

    def test_zero_area(self):
        res = area(0,10)
        self.assertEqual(res, 0)

    def test_zero_perimeter(self):
        res = perimeter(0,0,0)
        self.assertEqual(res, 0)


def area(a, h):
    return a * h / 2

def perimeter(a, b, c):
    return a + b + c
