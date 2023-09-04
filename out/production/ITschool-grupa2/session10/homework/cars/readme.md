Package 2: Multilevel Inheritance
Domain Model: Cars
Classes:
Car
ElectricCar (inherits from Car)
Tesla (inherits from ElectricCar)
Attributes:
Car: make, model, year
ElectricCar: batteryCapacity, range
Tesla: autopilotVersion
Methods:
Car: start(), stop(), accelerate()
ElectricCar: charge()
Tesla: enableAutopilot()

Classes:

Car

Attributes: make, model, year
Methods: start(), stop(), accelerate()
ElectricCar (inherits from Car)

Additional Attributes: batteryCapacity, range
Additional Methods: charge()
Tesla (inherits from ElectricCar)

Additional Attributes: autopilotVersion
Additional Methods: enableAutopilot()