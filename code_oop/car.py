class Car:
    
    # class variable
    wheels = 0
    
    def __init__(self, color, model, year):
        # In Python, you both declare and define attributes inside the class __init__(), 
        # which is the equivalent of Java’s constructor:
        self.color = color
        self.model = model
        self.year = year
        # non-public
        self._voltage = 12      
        
    @property
    def voltage(self):
        return self._voltage

    @voltage.setter
    def voltage(self, volts):
        print("Warning: this can cause problems!")
        self._voltage = volts

    @voltage.deleter
    def voltage(self):
        print("Warning: the radio will stop working!")
        del self._voltage
        
    def __str__(self):
        return f'Car {self.color} : {self.model} : {self.year}'