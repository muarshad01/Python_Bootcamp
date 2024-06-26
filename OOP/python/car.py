class Car(Vehicle):
    """The Car class is both a Vehicle and a Device."""

    wheels = 0

    def __init__(self, color, model, year, voltage):
        """Call our parent classes, then define the year."""
        Vehicle.__init__(self, color, model)
        self.year = year
        self.voltage = voltage

    def add_wheels(self, wheels):
        """Change the number of wheels we have."""
        self.wheels = wheels

    @property
    def voltage(self):
        """Allow us to access the Device._voltage property as voltage"""
        return self._voltage

    @voltage.setter
    def voltage(self, volts):
        """Warn the user before resetting the voltage"""
        print("Warning: this can cause problems!")
        self._voltage = volts

    @voltage.deleter
    def voltage(self):
        """Warn the user before deleting the voltage"""
        print("Warning: the radio will stop working!")
        del self._voltage

    def __str__(self):
        """Improved human readable version of the object"""
        return f"Car {self.color} : {self.model} : {self.year}"

    def __eq__(self, other):
        """Do these objects have the same year?"""
        return self.year == other.year

    def __lt__(self, other):
        """Which object was made earlier than the other?"""
        return self.year < other.year

    def __add__(self, other):
        """Add the objects together in our predefined way."""
        return Car(
            self.color + other.color,
            self.model + other.model,
            int(self.year) + int(other.year),
        )