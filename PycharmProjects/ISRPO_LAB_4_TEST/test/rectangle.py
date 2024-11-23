import unittest
class RectangleTestCase(unittest.TestCase):

    def test_rectangle_area_1(self):
        res = area(20, 20)
        self.assertEqual(res, 400)
        
    def test_rectangle_area_2(self):
        res = area(10**10, 10)
        self.assertEqual(res, 10**11)

    def test_rectangle_perimeter_1(self):
        res = perimeter(30, 30)
        self.assertEqual(res, 120)
    
    def test_rectangle_perimeter_2(self):
        res = perimeter(34, 6)
        self.assertEqual(res, 80)

    def test_zero_area(self):
        res = area(10, 0)
        self.assertEqual(res, 0)

    def test_zero_perimeter(self):
        res = perimeter(0, 0)
        self.assertEqual(res, 0)


def area(a, b):
    return a * b

def perimeter(a, b):
    return (a+b)*2
