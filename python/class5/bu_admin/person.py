class Person:
    
    # initializer (kinda like a java constructor)
    def __init__(self, buid, lastname, firstname):
        # instance variables go in here
        self.buid = buid
        self.lastname = lastname
        self.firstname = firstname

    # method
    def display(self):
        print "BUID: ", self.buid, "\nLastname: ", self.lastname, "\nFirstname: ", self.firstname, "\n\n"
