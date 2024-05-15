# Q1
from array import arr
array_num = arr.array('i', [1, 2, 3, 4, 5])
print("original array:", str(array_num))
array_num.remove(3)
print("array after removing")
print(str(array_num))

# Q2
my_array = arr.array('i', [18, 20, 39, 40, 50, 60])
for i in my_array:
    print(i)

# Q3
arr = [1, 6, 3, 7, 1]
print("Elements in the array:", arr)
print("Length of the array:", len(arr))

# Q4
from array import *
array_num = array('i', [1, 3, 5, 3, 7, 9, 3])
print("Original array: " + str(array_num))
print("Number of occurrences of the number 3 in the said array: " + str(array_num.count(3)))

# Q5
pi = 22 / 7
radian = float(input("Input radians: "))
degree = radian * (180 / pi)
print(degree)

# Q6
def sector_area():
    pi = 22 / 7
    radius = float(input("Radius of Circle: "))
    angle = float(input('Angle measure: '))
    if angle >= 360:
        print("Angle is not possible")
        return
    sec_area = (pi * radius**2) * (angle / 360)
    print("Sector Area: ", sec_area)

sector_area()

# Q7
def sum_difference(n=2):
    sum_of_squares = 0
    square_of_sum = 0
    for num in range(1, n+1):
        sum_of_squares += num * num
        square_of_sum += num

    square_of_sum = square_of_sum ** 2

    return square_of_sum - sum_of_squares

print(sum_difference(11))

# Q8
import matplotlib.pyplot as plt

plt.bar([1, 3, 5, 7, 8], [5, 2, 7, 8, 2], label="Data 1")
plt.legend()
plt.xlabel('X values')
plt.ylabel('Height')
plt.title('Vertical Bar chart')
plt.show()

# Q9
from matplotlib import pyplot as plt

plt.plot([1, 3], [4, 5])
plt.show()

# Q10
from matplotlib import pyplot as plt
from numpy import array

data_set = array([25, 20, 50, 15])

plt.plot(data_set)
plt.show()
