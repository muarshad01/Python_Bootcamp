# import car

# honda = car.Car("Black", "Honda", 2024)
# print(f"My car is {honda.color}")

# honda.wheels = 5
# print(f"Wheels: {honda.wheels}")
# print(f"It has {car.Car.wheels} wheels")


# from car import *

import car

honda = car.Car("Black", "Honda", 2024)
toyota = car.Car("Toyota", "Grey", 2003)

print(f"My car is {honda.color}")
print(f"It has {honda.wheels} wheels\n")

print(f"My other car is {toyota.color}")
print(f"It has {toyota.wheels} wheels\n")

# Change the class variable value
car.Car.wheels = 4

print(f"My car has {honda.wheels} wheels")
print(f"My other car has {toyota.wheels} wheels\n")

# Change the instance variable value for honda
honda.wheels = 5

print(f"My car has {honda.wheels} wheels")
print(f"My other car has {toyota.wheels} wheels\n")

print(isinstance(honda, car.Car))
print(honda)
print(dir(honda))
