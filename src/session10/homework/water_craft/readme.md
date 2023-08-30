Hierarchical Inheritance
Domain Model: Watercraft
Classes:
Boat
SpeedBoat (inherits from Boat)
FishingBoat (inherits from Boat)
Attributes:
Boat: length, weight
SpeedBoat: maxSpeed, engineType
FishingBoat: fishCapacity, typeOfNet
Methods:
Boat: sail()
SpeedBoat: turboBoost()
FishingBoat: castNet()
Domain Model: Watercraft

Classes:

Boat

Attributes: length, weight
Methods: sail()
SpeedBoat (inherits from Boat)

Additional Attributes: maxSpeed, engineType
Additional Methods: turboBoost()
FishingBoat (inherits from Boat)

Additional Attributes: fishCapacity, typeOfNet
Additional Methods: castNet()